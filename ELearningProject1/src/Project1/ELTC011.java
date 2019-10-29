package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ELTC011 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("http://elearningm1.upskills.in");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("abcdef");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abcdef@123");
		driver.findElement(By.xpath("//button[@id='form-login_submitAuth']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Homepage')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Edit profile')]")).click();
		driver.findElement(By.xpath("//input[@id='profile_password0']")).sendKeys("abcdef@123");
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("abcdef@456");
		driver.findElement(By.xpath("//input[@id='profile_password2']")).sendKeys("abcdef@456");
		driver.findElement(By.xpath("//button[@id='profile_apply_change']")).click();
		
		String text1 = driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText();
		String text2 = "Your new profile has been saved";
		
		if(text2.equals(text1)) {
			System.out.println("Passed");
			}
		else
		{
			System.out.println("Failed");
		}
		
		driver.close();
		
	}

}

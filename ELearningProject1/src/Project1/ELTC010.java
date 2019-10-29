package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ELTC010 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("http://elearningm1.upskills.in");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@id='form-login_submitAuth']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Homepage')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Course catalog')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='search_term']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//div[@class='input-group']//button[1]")).click();
		
		String text1 = driver.findElement(By.xpath("//strong[contains(text(),'Search results for: Selenium')]")).getText();
		String text2 = "Search results for: Selenium";
		
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

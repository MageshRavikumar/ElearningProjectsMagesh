package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ELTC012 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("http://elearningm1.upskills.in");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//a[contains(text(),'I lost my password')]")).click();
		
		driver.findElement(By.xpath("//input[@id='lost_password_user']")).sendKeys("abcdef");
		driver.findElement(By.xpath("//button[@id='lost_password_submit']")).click();
		
		//Get the updated password sent to registered email
	
		//Login with updated password
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("abcdef");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abcdef@123");
		driver.findElement(By.xpath("//button[@id='form-login_submitAuth']")).click();
		
		
	}

}

package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class How_to_Return_Key_after_Entering_a_Value_in_Text {
	@Test
	
	public void xPath() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");

		// Use chrome browser
		ChromeDriver	driver =new ChromeDriver();
		
		//Navigate to facebook login  Maximize
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//Type Email
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ramia");	
		Thread.sleep(4000);	
		
		//Return
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);	
		
		//Type password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234567");	
		Thread.sleep(4000);	
		
		
		//click button
		driver.findElement(By.xpath("//button[@name='login']")).submit();	
		Thread.sleep(4000);	
		
		//quite browser
		driver.quit();
	}
}

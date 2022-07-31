package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verifying_Whether_a_Button_is_Enabled_or_Disabled {
	@Test
	
	public void xPath() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");

		// Use chrome browser
		ChromeDriver	driver =new ChromeDriver();
		
		//Navigate to facebook login  Maximize
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		

		//button
		boolean button_enable = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		
		if(button_enable) {
			System.out.println("Button is enabled");
		}else {
			System.out.println("Button is desabled");

		}
		Thread.sleep(4000);	
		
		//quite browser
		driver.quit();
	}
}

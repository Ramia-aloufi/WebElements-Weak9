package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_with_CSSSelector_Tag_and_ID {
	@Test
	public void CssSelector() throws InterruptedException {
		//link for Driver
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");

		//driver for type chrome
		ChromeDriver driver = new ChromeDriver();
		//Navigate to facebook login
		driver.navigate().to("https://www.facebook.com");
	
		//type in email 
		driver.findElement(By.cssSelector("input#email")).sendKeys("Ramia");
		Thread.sleep(1000);
	
		//type  in pw input
		driver.findElement(By.cssSelector("input#pass")).sendKeys("1234");
		Thread.sleep(1000);

		//type  in pw input
		driver.findElement(By.cssSelector("button[id*='u_0_5']")).click();
		Thread.sleep(1000);

					
		
		driver.quit();
	}
}

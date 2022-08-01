package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_with_Checkboxes_Using_a_Button_Click {
	@Test
	public void XPath() throws InterruptedException {
		//link for Driver
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");

		//driver for type chrome
		ChromeDriver driver = new ChromeDriver();
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		
		//driver navigate to techlistic
		driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
		
		//scroll to specific point
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(4000);

		//check Manual Tester 
		driver.findElement(By.cssSelector("#profession-0")).click();
		
		Thread.sleep(4000);
		
		//check Automation Tester
		driver.findElement(By.cssSelector("#profession-1")).click();
		
		
		
		Thread.sleep(4000);

		
		driver.quit();
	}

}

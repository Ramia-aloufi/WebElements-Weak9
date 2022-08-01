package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Interacting_with_Web_Elements_Scrolling_Techniques {
	@Test
	public void XPath() throws InterruptedException {
		//link for Driver
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");

		//driver for type chrome
		ChromeDriver driver = new ChromeDriver();
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		
		//driver navigate to techlistic
		driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
		
		//scroll By View
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.cssSelector("#submit")));
		Thread.sleep(4000);
		
		//scroll By pixel
		js.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(4000);
		

		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4000);

					
		
		driver.quit();
	}
}

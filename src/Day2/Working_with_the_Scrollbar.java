package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Working_with_the_Scrollbar {
	@Test
	public void XPath() throws InterruptedException {
		//link for Driver
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");

		//driver for type chrome
		ChromeDriver driver = new ChromeDriver();
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		
		//driver navigate to techlistic
		driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
		
		driver.findElement(By.cssSelector("#submit")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(4000);
		
        Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
        System.out.println("Scroll down perfomed");
        Thread.sleep(3000);
     
        act.sendKeys(Keys.PAGE_UP).build().perform();       //Page Up
        System.out.println("Scroll up perfomed");
        Thread.sleep(3000);
					
		
		driver.quit();
	}
}

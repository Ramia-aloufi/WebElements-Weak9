package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Working_with_keyUp_and_keyDown {
	@Test
	public void CssSelector() throws InterruptedException {
		//link for Driver
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");

		//driver for type chrome
		ChromeDriver driver = new ChromeDriver();
		//Navigate to facebook login
		driver.navigate().to("https://www.codingdojo.com");
		Thread.sleep(5000);

		//type in email 
		WebElement form = driver.findElement(By.cssSelector(".course_packet_form"));
		
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", form);
		js.executeScript("window.scrollBy(0,-150)");
		
		
		WebElement name = driver.findElement(By.cssSelector(".packet_name.form-control"));
		
		Actions builder = new Actions(driver);
		
		Action act1 = builder
				.moveToElement(name)
				.click()
				.keyDown(name, Keys.SHIFT)
				.sendKeys("ramia aloufi")
				.keyUp(name, Keys.SHIFT)
				.doubleClick(name)
				.contextClick()
				.build();
		
		act1.perform();

		Thread.sleep(5000);

					
		
		//driver.quit();
	}
}

package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_with_RadioButtons_using_RadioGroup_and_CSSSelector {
	@Test
	public void XPath() throws InterruptedException {
		//link for Driver
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");

		//driver for type chrome
		ChromeDriver driver = new ChromeDriver();
		
		//driver navigate to and maximaize
		driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		
		
		
		//click male radioButton
		driver.findElement(By.cssSelector("#sex-0")).click();
		
		Thread.sleep(4000);
		
		//click female radioButton
		driver.findElement(By.cssSelector("#sex-1")).click();
		
		
		
		Thread.sleep(4000);

		
		driver.quit();
	}
}

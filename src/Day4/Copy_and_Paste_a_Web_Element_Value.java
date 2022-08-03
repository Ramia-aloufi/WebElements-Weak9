package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.google.common.collect.Iterables;

public class Copy_and_Paste_a_Web_Element_Value {
	@Test
	public void events() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/text-box");
		
		
		WebElement locOfOrder = driver.findElement(By.cssSelector("input[placeholder='Full Name']"));
		locOfOrder.sendKeys("Ramia_aloufi");
		Actions act = new Actions(driver);
		act.moveToElement(locOfOrder).doubleClick().build().perform();
		// catch here is double click on the text will by default select the text 
		// now apply copy command 
		locOfOrder.sendKeys(Keys.chord(Keys.COMMAND,"c"));
		// now apply the command to 
		WebElement email = driver.findElement (By.cssSelector("input[placeholder='name@example.com']"));
		email.sendKeys(Keys.chord(Keys.COMMAND, "v"));
		



		
//		driver.close();
		
		
	}
}

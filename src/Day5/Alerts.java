package Day5;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
@Test
public class Alerts {
	public  void main() throws InterruptedException
    {
		//Use safari Browser
		SafariDriver driver = new SafariDriver();
        driver.manage().window().setPosition(new Point(0,0));
        driver.manage().window().setSize(new Dimension(600,800));
       
        //Navigate to webpage
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		
        //Click in JS Prompt Button
		WebElement jsPrompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		jsPrompt.click();
	  
		//switch to alert
		Alert promptAlert  = driver.switchTo().alert();
	    String alertText = promptAlert.getText();
	    System.out.println("Alert text is " + alertText);
	   
	    //Send some text to the alert
		Thread.sleep(2000);
		
		//write text in alert input
	    promptAlert.sendKeys("Test User");
		Thread.sleep(2000);
		
		//click ok
	    promptAlert.accept();
		Thread.sleep(2000);

	    
	    driver.close();

	}

}

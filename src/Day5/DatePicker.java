package Day5;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DatePicker {
    String year = "2021";
    String month = "April";
    String day = "15";
    
	@Test
	public void datepicker() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");

	      WebDriver driver = new ChromeDriver();

	      
	      driver.get("https://jqueryui.com/datepicker/#date−range");
	      // wait of 4 seconds
	      driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	      // maximize browser
	      driver.manage().window().maximize();
	      // identify frame and switch to it
	      WebElement e = driver.findElement(By.xpath("//*[@id='content']/iframe"));
	      driver.switchTo().frame(e);
	      // choose from date
	      driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	      Thread.sleep(1000);
	      // choose month and Year
	      String monthYear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
	      while(!monthYear.equals(month+" " +year)){
		      System.out.println("B: "+monthYear);
		      driver.findElement(By.cssSelector(".ui-datepicker-prev.ui-corner-all")).click();
		
		     monthYear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
	      }
	      List<WebElement> days = driver.findElements(By.className("ui-state-default"));

	      System.out.println("D: "+days.size());

	      for(WebElement da:days) {
	    	  if(da.getText().equals(day)) {
			      System.out.println("D1: "+da.getText());

	    		  da.click();
	    		  break;
	    	  }
	      }

	   }
}

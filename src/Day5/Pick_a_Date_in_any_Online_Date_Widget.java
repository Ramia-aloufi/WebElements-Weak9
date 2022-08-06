package Day5;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pick_a_Date_in_any_Online_Date_Widget {
	
	private ChromeDriver driver;
	
//	@FindBy(className="ui-state-default")
//	private List<WebElement> dates;
	
	@FindBy(className="hasDatepicker")
	private WebElement dateInput;
	
	
	@Test
	public void date() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		PageFactory.initElements(driver, this);
//		
		WebElement fram = (WebElement) driver.findElements(By.className("demo-frame"));
		driver.switchTo().frame(fram);

		dateInput.click();

		Calendar calendar = Calendar.getInstance();
		int currentDateTime = calendar.get(Calendar.DAY_OF_MONTH);
		String cdstring = String.valueOf(currentDateTime);
		
		
//		for(WebElement date:dates) {
//			if(date.equals(cdstring)) {
//				date.click();
//				break;
//			}
//		}
		
		

		
		driver.close();
		
		
	}
}

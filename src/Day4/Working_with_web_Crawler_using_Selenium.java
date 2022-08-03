package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.collect.Iterables;

public class Working_with_web_Crawler_using_Selenium {
	
	@Test
	public void events() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-safari-driver");
		
		
		String content = driver.getPageSource();
		
		//System.out.println(content);
		
		WebElement table = driver.findElement(By.xpath("//*[@id=\"snippets\"]/div/div/div/table"));		
		List<WebElement> rows = table.findElements(By.tagName("tbody"));
		
		for(WebElement row:rows) {
			System.out.println(row.getText());
			System.out.println("-----------------------------");
		}
		
		System.out.println(driver.findElements(By.tagName("tr")));
		System.out.println("-------------------------------------");
		System.out.println(driver.findElements(By.tagName("a")));
		   
		   WebElement date = Iterables.getLast(driver.findElements(By.tagName("td")));
		System.out.println(date);



		
//		driver.close();
		
		
	}

}

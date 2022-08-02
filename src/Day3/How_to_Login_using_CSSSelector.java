package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class How_to_Login_using_CSSSelector {
	@Test
	public void CssSelector() throws InterruptedException {
		//link for Driver
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");

		//driver for type chrome
		ChromeDriver driver = new ChromeDriver();
		//Navigate to facebook login
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		Thread.sleep(5000);

		//type in email 
		driver.findElement(By.cssSelector("input[name^='user']")).sendKeys("Ramia");//by start
		Thread.sleep(1000);
	
		//type  in pw input
		driver.findElement(By.cssSelector("input[name$='ord']")).sendKeys("1234");//by end
		Thread.sleep(1000);

		//click  log in
		driver.findElement(By.cssSelector("button[type*='sub']")).submit();//by sub
		Thread.sleep(5000);

					
		
		driver.quit();
	}
}

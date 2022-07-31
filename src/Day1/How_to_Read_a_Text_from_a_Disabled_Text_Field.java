package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class How_to_Read_a_Text_from_a_Disabled_Text_Field {
	@Test
	
	public void xPath() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");

		// Use chrome browser
		ChromeDriver	driver =new ChromeDriver();
		
		//Navigate to google login  Maximize
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?hl=ar&passive=true&continue=https%3A%2F%2Fwww.google.com.sa%2F%3Fhl%3Dar&ec=GAZAmgQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//Type Email
		System.out.println(driver.findElement(By.xpath("//div[@class='DRS7Fe bxPAYd k6Zj8d']/descendant::input[@type='email']")).getAttribute("type"));	
		Thread.sleep(1000);	
		

	
		//quite browser
		driver.quit();
	}
}

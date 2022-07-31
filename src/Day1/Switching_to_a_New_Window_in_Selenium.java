package Day1;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Switching_to_a_New_Window_in_Selenium {

	@Test
	public void xPath() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");

		// Use chrome browser
		ChromeDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		int width = driver.manage().window().getSize().getWidth();
		int height = driver.manage().window().getSize().getHeight();
		System.out.println("WindowWidth : "+width);
		System.out.println("WindowHeight : "+height);
		System.out.println("-----------------------------------------------------");
		driver.manage().window().minimize();
		Thread.sleep(5000);

		
		int x = driver.manage().window().getPosition().getX();
		int y = driver.manage().window().getPosition().getY();
		System.out.println("WindowX : "+x);
		System.out.println("WindowY : "+y);
		System.out.println("-----------------------------------------------------");
		driver.manage().window().setSize(new Dimension(500,700));
		driver.manage().window().setPosition(new Point(100, 100));
		Thread.sleep(5000);

		
		String firstWindow = driver.getWindowHandle();
		System.out.println("WindowTitle : "+driver.getTitle());
		System.out.println("WindowHandle : "+firstWindow);
		System.out.println("WindowHandlesSize : "+driver.getWindowHandles().size());
		System.out.println("-----------------------------------------------------");
		Thread.sleep(5000);
		 
		String secondWindow = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com");
		System.out.println("WindowTitle : "+driver.getTitle());
		System.out.println("WindowHandle : "+secondWindow);
		System.out.println("WindowHandlesSize : "+driver.getWindowHandles().size());
		System.out.println("-----------------------------------------------------");
		Thread.sleep(5000);
		
		driver.switchTo().window(firstWindow);
		System.out.println("WindowHandlesSize : "+driver.getWindowHandles().size());
		System.out.println("WindowTitle : "+driver.getTitle());
		System.out.println("-----------------------------------------------------");
		Thread.sleep(5000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://login.codingdojo.com/");
		String thirdWindow = driver.getWindowHandle();
		System.out.println("WindowTitle : "+driver.getTitle());
		System.out.println("WindowHandle : "+secondWindow);
		System.out.println("WindowHandlesSize : "+driver.getWindowHandles().size());
		System.out.println("-----------------------------------------------------");
		Thread.sleep(5000);


		driver.quit();
		
	}
}

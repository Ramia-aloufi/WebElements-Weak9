package Day5;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class DragandDrop {
	
	@Test
	public  void dragdrop() throws InterruptedException {		
	    //Use safari browser
		SafariDriver driver = new SafariDriver();
        driver.manage().window().setPosition(new Point(0,0));
        driver.manage().window().setSize(new Dimension(600,800));
		
        //navigate to website
		String URL = "https://demoqa.com/droppable";
		driver.get(URL);                               
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
				
		//element for drag and drop
		WebElement from = driver.findElement(By.cssSelector("#draggable"));
		WebElement to = driver.findElement(By.cssSelector("#droppable"));	 

		//Actions class method to drag and drop		
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(from).moveToElement(to).release().build();
        dragAndDrop.perform();

//			builder.dragAndDrop(drop,to).perform();
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String URL = "https://beej.us/blog/data/drag-n-drop/";
//		driver.get(URL);
//		// It is always advisable to Maximize the window before performing DragNDrop action driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//		driver.switchTo().frame(driver.findElement(By.cssSelector("#mainbody > div.demo > div > iframe")));
//		//Actions class method to drag and drop 
//		Actions builder = new Actions(driver);
//		WebElement from = driver.findElement(By.id("goat0"));
//		WebElement to = driver.findElement(By.id("goat2")); 
//		//Perform drag and drop
//		builder.dragAndDrop(from, to).perform();
//		Thread.sleep(2000);
//
//		//verify text changed in to 'Drop here' box 
//		String textTo = to.getText();
//		if(textTo.equals("Dropped!")) {
//		System.out.println("PASS: File is dropped to target as expected");
//		}else {
//		System.out.println("FAIL: File couldn't be dropped to target as expected");
//		}
//		driver.close();
		

	}	
}

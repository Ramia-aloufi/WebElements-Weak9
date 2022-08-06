package Day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

class dragdrop {
	@Test
	public  void dragdrop() throws InterruptedException {		
	    //Use safari browser
		SafariDriver driver = new SafariDriver();
        driver.manage().window().setPosition(new Point(0,0));
        driver.manage().window().setSize(new Dimension(600,800));
        JavascriptExecutor js = (JavascriptExecutor) driver;
		//navigate to website        
        driver.get("https://jqueryui.com/draggable/");
        driver.switchTo().frame(0);
        WebElement dragMe = driver.findElement(By.cssSelector(".ui-draggable-handle"));
        js.executeScript("arguments[0].scrollIntoView();", dragMe);
		Thread.sleep(2000);

        new Actions(driver).dragAndDropBy(dragMe, dragMe.getLocation().getX()+100, dragMe.getLocation().getY()+100).perform();


		Thread.sleep(2000);
		driver.close();
		
		
	}
}

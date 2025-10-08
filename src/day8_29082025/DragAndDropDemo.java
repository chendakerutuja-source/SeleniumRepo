package day8_29082025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.switchTo().frame(0); // if element is present in frame we need to use frame and frame will work with index. here we took 0 because there was only one frame in above application so index will start from 0 
        WebElement drag=driver.findElement(By.id("draggable"));
        WebElement drop=driver.findElement(By.id("droppable"));
        
        Actions act=new Actions(driver);
        act.clickAndHold(drag).moveToElement(drop).release().build().perform(); // it will drag and drop the element
        // Another way to perform drag and drop - more easy - follow which one u want
        act.dragAndDrop(drag, drop).build().perform(); //for safer side take build all the time.
	}

}

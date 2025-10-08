package sel_Assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationcentral.com/demo/index.html");
		Thread.sleep(2000);
		WebElement UserInteraction=driver.findElement(By.xpath("//button[@id='nav-close']/following-sibling::div/following-sibling::div[2]/following-sibling::div/child::button"));
		UserInteraction.click();
		WebElement DragDropMenu=driver.findElement(By.xpath("//a[text()='Drag and Drop']"));
		DragDropMenu.click();
		Thread.sleep(5000);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();

	}

}

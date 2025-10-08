package assignment_3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraAnotherWay {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		
		Actions act=new Actions(driver);
		
		// stored menu in array Xpaths
		
		String[] menuXpaths = {"//a[@data-group='men']","//a[@data-group='women']","//a[@data-group='kids']","//a[@data-group='home']","//a[@data-group='beauty']","//a[@data-group='genz']","//a[@data-group='studio']"};
		
		// one by one element will be storing in xpath
		for(String xpath:menuXpaths)
		{
			WebElement menu=driver.findElement(By.xpath(xpath));
			act.moveToElement(menu).build().perform();
			System.out.println("Hovered on: "+menu.getText());
			Thread.sleep(2000);
		}
		
		
		
			
		
	
	
	}

}

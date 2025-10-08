package sel_Assignment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		Actions act=new Actions(driver);
		
		String[] menuXpath = {"//a[@data-group='men']","//a[@data-group='women']","//a[@data-group='kids']","//a[@data-group='home']","//a[@data-group='beauty']","//a[@data-group='genz']","//a[@data-group='studio']"};
		
        for(String xpath:menuXpath)
        {
        	WebElement menu=driver.findElement(By.xpath(xpath));
        	act.moveToElement(menu).build().perform();
        	System.out.println("Hoveres On: "+menu.getText());
        	Thread.sleep(2000);
        }
	}

}

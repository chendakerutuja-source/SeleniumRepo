package sel_Assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.name("username"));
		Actions act=new Actions(driver);
		//for right Clicking
		act.contextClick(username).build().perform();
		
		
		
		//contextClick(WebElement element) → right-clicks on the given element.
        //contextClick() (without element) → right-clicks at the current mouse pointer location.

	}

}

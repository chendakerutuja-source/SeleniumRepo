package sel_Assignment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterKey {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.name("username"));
		WebElement password=driver.findElement(By.name("password"));
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Enter key Clicked");

	}

}

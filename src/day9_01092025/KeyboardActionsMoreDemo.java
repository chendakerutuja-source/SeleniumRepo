package day9_01092025;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsMoreDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).click();
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		act.build().perform(); //like this also we can give instead of giving for each line give at the end only once.
	}

}

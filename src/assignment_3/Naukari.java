package assignment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukari {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		WebElement job=driver.findElement(By.xpath("//ul[@class='nI-gNb-menus']/child::li[1]/child::a"));
		Actions act=new Actions(driver);
		act.moveToElement(job).build().perform();
		Thread.sleep(2000);
		WebElement register=driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		

	}

}

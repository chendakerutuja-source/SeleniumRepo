package assignment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		WebElement men=driver.findElement(By.xpath("//nav[@class='desktop-navbar']/child::div/child::div[1]/child::div/child::a"));
		Actions act=new Actions(driver);
        act.moveToElement(men).build().perform();
        Thread.sleep(2000);
        WebElement women=driver.findElement(By.xpath("//nav[@class='desktop-navbar']/child::div/child::div[2]/child::div/child::a"));
		Actions actw=new Actions(driver);
        act.moveToElement(women).build().perform();
        Thread.sleep(2000);
        WebElement kids=driver.findElement(By.xpath("//nav[@class='desktop-navbar']/child::div/child::div[3]/child::div/child::a"));
		Actions actk=new Actions(driver);
        act.moveToElement(kids).build().perform();
        Thread.sleep(2000);
        WebElement home=driver.findElement(By.xpath("//nav[@class='desktop-navbar']/child::div/child::div[4]/child::div/child::a"));
		Actions acth=new Actions(driver);
        act.moveToElement(home).build().perform();
        Thread.sleep(2000);
        WebElement beauty=driver.findElement(By.xpath("//nav[@class='desktop-navbar']/child::div/child::div[5]/child::div/child::a"));
		Actions actb=new Actions(driver);
        act.moveToElement(beauty).build().perform();
        Thread.sleep(2000);
        WebElement genz=driver.findElement(By.xpath("//nav[@class='desktop-navbar']/child::div/child::div[6]/child::div/child::a"));
		Actions actg=new Actions(driver);
        act.moveToElement(genz).build().perform();
        Thread.sleep(2000);
        WebElement studio=driver.findElement(By.xpath("//nav[@class='desktop-navbar']/child::div/child::div[7]/child::div/child::a"));
		Actions acts=new Actions(driver);
        act.moveToElement(studio).build().perform();
        

	}

}

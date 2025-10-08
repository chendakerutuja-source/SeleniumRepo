package day8_29082025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementsDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		WebElement men=driver.findElement(By.xpath("//nav[@class='desktop-navbar']/child::div/child::div[1]/child::div/child::a"));
		Actions act=new Actions(driver);// we have to create constructor or object for action class to use and why we are using driver here because its syntax and because it is parameterized constructor so we have pass the webDriver reference name which we created above line no 12
        act.moveToElement(men).build().perform(); // here if we are dealing with single element go without build and if you are dealing with multi(more than 1 element) elements go with build.
	}

}

package day2_21082025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookElementsLocatorsDemo {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Rutuja");
		driver.findElement(By.name("lastname")).sendKeys("Chendake");
		driver.findElement(By.name("reg_email__")).sendKeys("9148833351");
		driver.findElement(By.name("reg_passwd__")).sendKeys("rutuja@1409");
		
		//This is NOT the Good Practice to handle the dropdown
//		driver.findElement(By.id("day")).sendKeys("20");
//		driver.findElement(By.id("month")).sendKeys("Nov"); // we have to give as it is how present in application.
//		driver.findElement(By.id("year")).sendKeys("1991");
		
//		Below practice we have to follow to handle the dropdown - Select Class
		WebElement date=driver.findElement(By.id("day")); // we are storing day in date as webElement because whatever present on page those are elements.
		Select slDay=new Select(date);
		slDay.selectByIndex(19); // one way to deal with dropdown but here we need to check in DOM what value we have for the particular day then we need to pass same.
		
		WebElement mon=driver.findElement(By.id("month")); // we are storing day in date as webElement because whatever present on page those are elements.
		Select slMonth=new Select(mon);
		slMonth.selectByValue("11"); // another way to deal with dropdown but here too we need to check value in DOM page then we need to pass it
		
		WebElement yr=driver.findElement(By.id("year")); // we are storing day in date as webElement because whatever present on page those are elements.
		Select slYr=new Select(yr); //Creating constructor
		slYr.selectByVisibleText("1991"); //This is the good way to handle the dropdown because here will be giving the value. 
		
//		driver.findElement(By.id("sex")).click(); // radio button	
		List<WebElement> gender=driver.findElements(By.className("_58mt"));
		
		for(int i=0;i<gender.size();i++)
		{
			if((gender.get(i).getText()).equals("Male"))
			{
				gender.get(i).click();
			}
		}
		
		driver.findElement(By.name("websubmit")).click();
		
//		driver.close();
		
	}

}

package day3_22082025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ValidationCommandsDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement createAcc=driver.findElement(By.linkText("Create new account"));
		if(createAcc.isDisplayed())
		{
			createAcc.click();
			System.out.println("Yes the create a new account button is present");
		}
		else
		{
			System.out.println("No the create a new account button is NOT present");
		}
		
		driver.findElement(By.name("firstname")).sendKeys("Rutuja");
		driver.findElement(By.name("lastname")).sendKeys("Chendake");
		driver.findElement(By.name("reg_email__")).sendKeys("9148833351");
		driver.findElement(By.name("reg_passwd__")).sendKeys("rutuja@1409");
		
		WebElement date=driver.findElement(By.id("day")); // we are storing day in date as webElement because whatever present on page those are elements.
		Select slDay=new Select(date);
		slDay.selectByIndex(19); // one way to deal with dropdown but here we need to check in DOM what value we have for the particular day then we need to pass same.
		
		WebElement mon=driver.findElement(By.id("month")); // we are storing day in date as webElement because whatever present on page those are elements.
		Select slMonth=new Select(mon);
		slMonth.selectByValue("11"); // another way to deal with dropdown but here too we need to check value in DOM page then we need to pass it
		
		WebElement yr=driver.findElement(By.id("year")); // we are storing day in date as webElement because whatever present on page those are elements.
		Select slYr=new Select(yr); //Creating constructor
		slYr.selectByVisibleText("1991"); //This is the good way to handle the dropdown because here will be giving the value. 
		
		
		WebElement gender=driver.findElement(By.id("sex"));
		if(gender.isSelected()) //here first it won't be selected because we are not giving any click action here. so it will be failed and it will go for else part
		{
			System.out.println("Yes the gender is already selected");
		}
		else
		{
			gender.click();
			System.out.println("No the gender was not selected so, we clicked on it.");
		}
					
		WebElement signup=driver.findElement(By.name("websubmit"));
		if(signup.isEnabled())
		{
			signup.click();
			System.out.println("Yes the sign up button is enabled");
		}

	}

}

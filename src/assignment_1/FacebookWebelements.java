package assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookWebelements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.name("firstname"));
		name.sendKeys("Rutuja");
		WebElement surname=driver.findElement(By.name("lastname"));
		surname.sendKeys("Chendake");
		WebElement Email=driver.findElement(By.name("reg_email__"));
		Email.sendKeys("9148833351");
		WebElement Password=driver.findElement(By.name("reg_passwd__"));
		Password.sendKeys("rutuja@1409");
		
		WebElement date=driver.findElement(By.id("day")); 
		Select slDay=new Select(date);
		slDay.selectByIndex(19); 
		
		WebElement mon=driver.findElement(By.id("month")); 
		Select slMonth=new Select(mon);
		slMonth.selectByValue("11"); 
		
		WebElement yr=driver.findElement(By.id("year")); 
		Select slYr=new Select(yr); 
		slYr.selectByVisibleText("1991"); 
		
		
		WebElement gender=driver.findElement(By.id("sex"));
		gender.click();
		
		WebElement signup=driver.findElement(By.name("websubmit"));
		signup.click();
		
		

	}

}

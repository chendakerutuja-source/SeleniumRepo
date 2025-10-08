package seleniumPractice_06092025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookElementLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//div[@class='_6ltg']/child::a")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Rutuja");
		driver.findElement(By.name("lastname")).sendKeys("Chendake");
		
		
		WebElement date=driver.findElement(By.id("day"));
		Select slDay=new Select(date);
		slDay.selectByIndex(13);
		
		WebElement month=driver.findElement(By.id("month"));
		Select slmonth=new Select(month);
		slmonth.selectByValue("9");
		
		WebElement year=driver.findElement(By.id("year"));
		Select slyear=new Select(year);
		slyear.selectByVisibleText("1999");
		
        List<WebElement> gender=driver.findElements(By.className("_58mt"));
		
		for(int i=0;i<gender.size();i++)
		{
			if((gender.get(i).getText()).equals("Custom"))
			{
					gender.get(i).click();
					WebElement she=driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
				    Select slshe=new Select(she);
				    slshe.selectByIndex(1);
				    Thread.sleep(2000);
				    driver.findElement(By.xpath("//input[@id='custom_gender']")).sendKeys("Others");
				}
			
			}
		driver.findElement(By.name("reg_email__")).sendKeys("9148833351");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Rutuja@1409");
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
	}
	
}

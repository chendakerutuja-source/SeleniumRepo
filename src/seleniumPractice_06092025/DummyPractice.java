package seleniumPractice_06092025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DummyPractice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement date=driver.findElement(By.id("day"));
		Select s1day=new Select(date);
//		s1day.selectByIndex(1);
//		s1day.selectByValue("11");
		s1day.selectByVisibleText("Sep");
		
		
		WebElement month=driver.findElement(By.id("month"));
		Select s2month=new Select(month);
//		s2month.selectByIndex(1);
		s2month.selectByValue("1");
		s2month.selectByVisibleText("Jan");
		
		WebElement year=driver.findElement(By.id("year"));
		Select s3year=new Select(year);
		s3year.selectByVisibleText("2025");
		s3year.selectByValue("2");
		s3year.selectByIndex(1);
		
		

	}

}

package assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchButton=driver.findElement(By.name("q"));
		if(searchButton.isDisplayed())
		{
			System.out.println("Yes Search button is available");
		}
		else
		{
			System.out.println("Search button is NOT available");
		}
		
		if(searchButton.isEnabled())
		{
			System.out.println("Search button is enabled");
			
		}
		else
		{
			System.out.println("Search button is NOT enabled");
		}

	}

}

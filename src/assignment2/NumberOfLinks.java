package assignment2;

// 2. Verify Number of links should be greater than number of buttons in application.

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfLinks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total Count of Links: "+links.size());
		
		List<WebElement> button=driver.findElements(By.tagName("button"));
		System.out.println("Total Number of buttons: "+button.size());
		
		if(links.size()>button.size())
		{
			System.out.println("Test Case Passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}

	}

}

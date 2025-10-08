package assignment2;

import java.util.List;

import org.openqa.selenium.By;

// 6. Write a program to count number of links and click on last but one link

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CountNumberLinksClickList {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total Count of Links: "+links.size());
		
		if(links.size() >=2)
		{
			WebElement secondLastLink=links.get(links.size()-2);
			System.out.println("Clicking on: "+secondLastLink.getText());
			secondLastLink.click();
		}
		else
		{
			System.out.println("Not enough links to click the last but one.");
		}

	}

}

package assignment2;

// 1. Count number of links in app and print all names of links

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLink {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total Count of Links: "+links.size());
		
		 for(int i=0;i<links.size();i++)
	        {
	        	String linkName=links.get(i).getText();  
	        	System.out.println((i+1)+". "+linkName); //why we took i+1 is index starting from 0 but we want it to be displayed with number starting 1
	        	
	        }

	}

}

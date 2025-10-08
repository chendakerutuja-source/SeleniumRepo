package day5_25082025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchLinksDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Click here to go to rediff.com »")).click();
		List<WebElement> links=driver.findElements(By.tagName("a")); // it will find the element which has tag name as "a"
        System.out.println("Total Count of Links: "+links.size());//it will give the count of link how many are present on that page
        
        for(int i=0;i<links.size();i++)
        {
        	String linkName=links.get(i).getText(); //get(i) used for index
        	String url=links.get(i).getAttribute("href"); //all URL will be present in href tag
        	if(linkName.startsWith("M"))
        	{
        		System.out.println((i+1)+". "+linkName+"------>"+url); //why we took i+1 is index starting from 0 but we want it to be displayed with number starting 1
        	}
        }
        
        List<WebElement> images=driver.findElements(By.tagName("img"));
        System.out.println("Total Count of images: "+images.size());
        
        if(links.size()>images.size())
        {
        	System.out.println("Test Case Passed");
        }
        else
        {
        	System.out.println("Test Case Failed");
        }
	}

}

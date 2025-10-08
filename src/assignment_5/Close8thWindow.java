package assignment_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Prepare program to close 8th window

public class Close8thWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/boy-trousers?p=1");
		
		List<WebElement> trouser=driver.findElements(By.xpath("//ul[@class='results-base']/child::li/child::a"));
		System.out.println("Total Number of trouser: "+trouser.size());
		
		for(int i=0;i<8;i++) // 8 windows will be opened.
		{
			trouser.get(i).click();
			Thread.sleep(2000);		
		}
		
		Set<String> win=driver.getWindowHandles();
		List<String> windowList=new ArrayList<>(win);
		
		int windowToClose = 7;
		
		if(windowList.size()>windowToClose)
		{
			driver.switchTo().window(windowList.get(windowToClose));
			driver.close();
			System.out.println("8th window closed successfully");
		}
		else
		{
			System.out.println("Less than 8 windows are open");
		}
		
		
		
		

	}

}

package day11_04092025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindowsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/women-kurtas-kurtis-suits?p=1");
		
		List<WebElement> kurtis=driver.findElements(By.xpath("//ul[@class='results-base']/child::li/child::a"));
		System.out.println("Total Number of itmes: "+kurtis.size());
		
		for(int i=0;i<5;i++)
		{
			kurtis.get(i).click();
			Thread.sleep(2000);
		}
		
		// we can store windowhandle in arraylist as well. but basically it will be windows randomaly only its made like that , its has set so
//		Set<String> win=driver.getWindowHandles();
//		ArrayList al=new ArrayList();
//		al.addAll(al);
		
		Set<String> win=driver.getWindowHandles(); //as we are using set here it will take random sequence as set does not follow insertion order.
		System.out.println(win);
		
		Iterator<String> itr=win.iterator();
		
		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next()); // it switches randomly as we used set.
			Thread.sleep(2000);
			String title=driver.getTitle();
			System.out.println(title);
			if(title.contains("Peach Petals Women Ethnic"))
			{
				driver.close();
			}
		}
		
//		String win1=driver.getWindowHandle(); // this is handle single window - give index 0 or 1.
//		driver.switchTo().window(win1);
//		driver.switchTo().window(0);
//		String title=driver.getTitle();
//		System.out.println(title); // it will give the title of the window which we launched initially using driver.get

	}

}

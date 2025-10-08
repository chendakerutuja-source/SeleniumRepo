package assignment_5;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close8ThWindowAnotherWay {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/boy-trousers?p=1");
		
		List<WebElement> trouser=driver.findElements(By.xpath("//ul[@class='results-base']/child::li/child::a"));
		
		for(int i=1;i<=8;i++)
		{
			trouser.get(i).click();
			Thread.sleep(2000);		
		}
		
		Set<String> win=driver.getWindowHandles();
        Iterator<String> itr=win.iterator();
		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next()); 
			Thread.sleep(2000);
			String title=driver.getTitle();
			System.out.println(title);
			if(title.contains("Buy Urbano Juniors Boy Cream Baggy Fit Solid Cargo Chino Pant With 6 Pockets Non Stretchable - Trousers for Boys 32614115 | Myntra"))
			{
				WebElement us=driver.findElement(By.xpath("//h1[text()='Urbano Juniors']"));
				if(us.isDisplayed())
				{
					driver.close();
				}
			}			
		}	

	}

}

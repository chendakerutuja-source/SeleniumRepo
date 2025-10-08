package assignment_5;

// 2. Prepare program to close all opened windows

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllOpenedWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/boy-trousers?p=1");
		
		List<WebElement> trouser=driver.findElements(By.xpath("//ul[@class='results-base']/child::li/child::a"));
		System.out.println("Total Number of trouser: "+trouser.size());
		
		for(int i=0;i<4;i++)
		{
			trouser.get(i).click();
			Thread.sleep(2000);
		}
		driver.quit();

	}

}

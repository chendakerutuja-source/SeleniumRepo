package assignment_6;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


// Launch application, Element Present, Element Enabled

public class TakeScreenshot {
	
	public static WebDriver driver;
	public static CaptureScreenshot cs;

	public static void main(String[] args) throws IOException, InterruptedException {
		cs=new CaptureScreenshot();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		if(title.equals("Facebook – log in or sign up"))
		{
			cs.getSS("Launch facebook application");
			Thread.sleep(2000);
			WebElement Login=driver.findElement(By.xpath("//button[text()='Log in']"));
			if(Login.isDisplayed())
			{
				cs.getSS("Element is Present");
				Thread.sleep(2000);
				if(Login.isEnabled())
				{
					cs.getSS("Element is Enabled");
				}
			}
		}
		
		
		
		

	}

}

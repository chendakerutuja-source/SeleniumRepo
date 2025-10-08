package assignment_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFaceBookApp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		if(title.length()>url.length())
		{
			System.out.println("Yes Application title length is geater than url length");
		}
		else
		{
			System.out.println("No Application title length is NOT geater than url length");
		}
		

	}

}

package assignment_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titleabcd {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String appTitle=driver.getTitle();
		if(appTitle.contains("abcd"))
		{
			System.out.println("Application title contains abcd");
		}
		else
		{
			System.out.println("Application title does not contain abcd");
		}

	}

}

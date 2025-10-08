package assignment_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLcom {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String URL=driver.getCurrentUrl();
		if(URL.contains(".com"))
		{
			System.out.println("URL contains .com");
		}
		else
		{
			System.out.println("URL does NOT contain .com");
		}

	}

}

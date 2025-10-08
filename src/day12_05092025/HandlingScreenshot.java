package day12_05092025;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScreenshot {
	
	public static WebDriver driver;
	public static CaptureScreenshot cs;

	public static void main(String[] args) throws IOException {
		cs=new CaptureScreenshot();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/women-kurtas-kurtis-suits?p=1");
		String title=driver.getTitle();
		if(title.equals("Shop for Women Kurtas, Suits & Kurtis Online in India | Myntra"))
		{
			cs.getSS("LaunchApplication");
			System.out.println("Test Case Passed");
		}

	}

}

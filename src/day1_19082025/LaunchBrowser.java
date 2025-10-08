package day1_19082025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// Launch Browser
		WebDriver driver=new ChromeDriver();
		
		// Launching the Application
		driver.get("https://www.google.com/");
		
		// Maximize the window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// Closing the browser
//		driver.close();
		driver.quit();

	}

}
// Difference between Close and Quit

// Close is responsible to targeted window. or Close will close only current window where actually selenium is focusing
// Quit is responsible to close all windows are opened. or it will close all tabs.

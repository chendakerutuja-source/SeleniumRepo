package day10_03092025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommandsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.flipkart.com/"); //will navigate to flipcart.com
		
		Thread.sleep(5000);
		driver.navigate().back(); // it will navigate back to amazon.com
		Thread.sleep(5000);
		driver.navigate().forward(); // it will be navigating to flipcart.com because after amazon we navigated to flipcart so based on bowser history it will navigate
		Thread.sleep(5000);
		driver.navigate().refresh(); // it refreshed the page

	}

}

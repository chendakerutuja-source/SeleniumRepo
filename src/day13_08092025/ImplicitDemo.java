package day13_08092025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
//		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Sign in")).click();
	}

}

// Implicit wait is like as soon as element is present it will perform the action and if element is not present it will wait for defined time and throws "NoSuchElementException" 
// and its applicable for all elements which are present in that code. Check Facebook code.
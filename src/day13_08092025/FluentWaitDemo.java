package day13_08092025;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				            .withTimeout(Duration.ofSeconds(10))
		                    .pollingEvery(Duration.ofSeconds(2)) // every 2 seconds it will check the element.
		                    .ignoring(NoSuchElementException.class); // we are asking to ignore the exception.
		                    
		WebElement signIn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("abbabbd")));
		signIn.click();
	}

}

// fluent is parent for ur Explicit Wait.

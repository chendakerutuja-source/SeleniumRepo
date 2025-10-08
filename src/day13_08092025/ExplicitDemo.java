package day13_08092025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement signIn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign in")));
		signIn.click();
		

	}

}

// Explicit wait will give Timeout Exception - every half seconds it will go and check for element.
// if element is present it will be executing it and if element is not present after defined time it will throw the exception as "timeout" exception

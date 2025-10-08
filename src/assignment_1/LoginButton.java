package assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement loginButton=driver.findElement(By.name("login"));
		if(loginButton.isDisplayed())
		{
			System.out.println("Yes Login button is available");
		}
		else
		{
			System.out.println("Yes Login button is NOT available");
		}
		Thread.sleep(2000);
		if(loginButton.isEnabled())
		{
			System.out.println("yes login button is enabled");
			loginButton.click();
		}
		else
		{
			System.out.println("Login button is NOT enabled");
		}
		
		

	}

}

package assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgetPassword {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement forget=driver.findElement(By.linkText("Forgotten password?"));
		forget.click();
		String title = driver.getTitle();
		if(title.contains("account1"))
		{
			System.out.println("title contains account1");
		}
		else
		{
			System.out.println("Title does NOT contain account1");
		}

	}

}

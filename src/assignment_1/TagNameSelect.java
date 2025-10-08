package assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameSelect {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement createAccount=driver.findElement(By.linkText("Create new account"));
		createAccount.click();
		WebElement month=driver.findElement(By.name("birthday_month"));
		System.out.println(month.getTagName());
		if(month.getTagName().contains("select"))
		{
			System.out.println("tag name is select");
		}
		else
		{
			System.out.println("Tag name is Not the select");
		}

	}

}

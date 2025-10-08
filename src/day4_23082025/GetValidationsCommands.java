package day4_23082025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetValidationsCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String actualTitle=driver.getTitle(); // we can get title by using getTitle.
		System.out.println(actualTitle); //printing actual title
		String expTitle="Facebook – log in or sign up";
		if(actualTitle.equals(expTitle))
		{
			System.out.println("Test Case is Pass as Title Match");
		}
		else
		{
			System.out.println("Test Case Is Fail as Title Not Match");
		}
		
//		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl()); //it will gives the current URL like whichever page user will be that URL it will give as it is responsible to give current url.
        WebElement login=driver.findElement(By.name("login"));
        System.out.println(login.getAttribute("id")); // returns the values of mentioned attribute
		System.out.println(login.getTagName()); //return the tagname for mentioned element.
		System.out.println(login.getSize());//gives the diamentions of the mentioned element
		System.out.println(login.getText());// gives the text of the element
		login.click();
		Thread.sleep(5000);
		WebElement valMessage=driver.findElement(By.className("_9ay7"));
		System.out.println(valMessage.getText()); //prints the error message as we are using get text
	}

}

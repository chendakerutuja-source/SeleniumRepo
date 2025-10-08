package day2_21082025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.className("gLFyf")).clear(); // we can go with single element class or name or id ..here to show demo we took in all elements.
//		driver.close();

	}

}

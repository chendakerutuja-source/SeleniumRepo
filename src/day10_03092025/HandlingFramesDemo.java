package day10_03092025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		Thread.sleep(2000);
		driver.switchTo().frame(0); // navigating to first frame so index will be 0
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@title='Packages']/child::li[1]/child::a")).click(); // in order to click this element we have to first go to frame that is the reason we wrote line number 14 because this element is present in frame.
		
		//now we need to click to the element in next frame that is second frame so for that first of all we need to come out of first frame then only it is possible. we can outof first frame using defaultContent see as below.
		//Real time Ex- for line no 18 is Movie theater so i went to watch movie that is Saiyarra in screen1 but by miss i went in another screen 2 where War2 was show was going on so inorder to go to first screen i need to come out of screen 2 right so there wont be any way in screen 2 to go to directly to screen 1 so first i need to comeout side of screen one then only i can go to screen 1
		
		
		driver.switchTo().defaultContent(); // it will come out of first frame
		Thread.sleep(2000);
		driver.switchTo().frame("packageFrame"); //we are switching to second frame using id or name ..in our page we have only name so going with name. --- we can go with index as well.
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@title='Classes']/child::li[1]/child::a")).click();
		

	}

}

// Important..
//There are 3 ways to handle frame
//1.Frame by index - Ex for this in line no 14
//2.Frame by id or name - Ex for this in line no 24
//3.Frame by webElement frameelement // need to check on this


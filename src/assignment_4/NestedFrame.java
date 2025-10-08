package assignment_4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		// Another way to count frames
		int fm=driver.findElements(By.tagName("frame")).size();
		System.out.println("Total Number of frames: "+fm);
		
//		driver.switchTo().frame(2); // this is for frame 3 so index is 2 - this index way
		// Another way to handle frame that is by WebElement
		WebElement fm3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(fm3);
		
		Thread.sleep(5000);
		driver.switchTo().frame(0); // it has frame inside frame so again we need to navigate to that frame so took index 0 here.
		driver.findElement(By.xpath("//span[text()='Hi, I am the UI.Vision IDE']")).click();
		
//		driver.switchTo().defaultContent(); // coming out of frame0 that is nested frame
//		Thread.sleep(2000);
//		driver.switchTo().frame(2); //navigating to frame3
		
		// instead of using above 3 lines we can use parent as well because Frame 3 is parent for nested frame(frame inside frame) check website u will get to know
		driver.switchTo().parentFrame(); 
		Thread.sleep(2000);
		WebElement frame3=driver.findElement(By.name("mytext3")); 
		frame3.click();
		frame3.sendKeys("Rutuja"); //entering data in frame3 text box
		
		driver.switchTo().defaultContent(); // coming out of frame 3
		Thread.sleep(2000);
		driver.switchTo().frame(4); // navigating to frame5
		Thread.sleep(2000);
		WebElement frame5=driver.findElement(By.name("mytext5")); //entering data in frame5 text box
		frame5.click();
		frame5.sendKeys("Selenium");
		
//		//To get the total number of frames.  - if we use here it will give count zero because we will be in frame 5 so give it in initial lines.
//		List<WebElement> fm=driver.findElements(By.tagName("frame")); // here we gave frame because frames will be present in frame and iframe tag, in our application its only frame so we took frame.
//		System.out.println("Total Frames: "+fm.size());
//		
		
		
		
		

	}

}

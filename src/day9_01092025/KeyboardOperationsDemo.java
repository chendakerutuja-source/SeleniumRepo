package day9_01092025;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOperationsDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		/*Actions act=new Actions(driver);
		act.sendKeys(Keys.F5).build().perform(); //for refreshing the window
		Thread.sleep(2000);
		act.sendKeys(Keys.CONTROL+"t").build().perform(); //For Opening new tab.
		Thread.sleep(2000);
		act.sendKeys(Keys.CONTROL+"n").build().perform(); // for opening new window */
		
		//above code wont work because we have multiple things here so if we have single operation we can go with actions class..
		
		// Now we have to do with Robot Class
		
		Robot robo=new Robot(); //to use this we need to add exception. see above for main method line no. 11
		robo.keyPress(KeyEvent.VK_F5); // this for pressing the key - VK means virtual key
		robo.keyRelease(KeyEvent.VK_F5); // this is releasing the key
		
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_CONTROL); // for new tab for pressing - Control+T
		robo.keyPress(KeyEvent.VK_T);
		
		robo.keyRelease(KeyEvent.VK_CONTROL); // for new tab for releasing
		robo.keyRelease(KeyEvent.VK_T);
		
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_CONTROL); // for new window for pressing - Control+N
		robo.keyPress(KeyEvent.VK_N);
		
		robo.keyRelease(KeyEvent.VK_CONTROL); // for new window for releasing
		robo.keyRelease(KeyEvent.VK_N);
		
		

	}

}

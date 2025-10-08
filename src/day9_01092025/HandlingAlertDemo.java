package day9_01092025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert(); //Alert is Not class its a interface.
		System.out.println(a.getText());
		
//		driver.switchTo().alert().accept(); - this another way for calling alerts or handling alerts but best practice is store in any element so it will be easy to use line no 16
     
		// for example if we have 2 buttons on Alert like cancel and okay then we can use for accepting .accept and for cancelling dismiss. in our ex we have only one button that is ok so we are using accept we can use dismiss as well it will work.
		a.accept();
		Thread.sleep(2000);
//        a.dismiss();
	}

}

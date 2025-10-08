package sel_Assignment_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverVerifyToolTip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationcentral.com/demo/index.html");
		Thread.sleep(2000);
		WebElement UserInteraction=driver.findElement(By.xpath("//button[@id='nav-close']/following-sibling::div/following-sibling::div[2]/following-sibling::div/child::button"));
		UserInteraction.click();
		WebElement ToolTip=driver.findElement(By.xpath("//a[text()='Tool Tips']"));
		ToolTip.click();
		Thread.sleep(5000);
		WebElement hover=driver.findElement(By.id("tool-tip-button"));
		Actions act=new Actions(driver);
		act.moveToElement(hover).build().perform();
		String tooltipdescription=hover.getAttribute("title");
		System.out.println("Tool Tip text: "+tooltipdescription);
		String Expected="This is a tool tip!";
		if(tooltipdescription.equals(Expected))
		{
			System.out.println("Test Case Passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
	
	}

}

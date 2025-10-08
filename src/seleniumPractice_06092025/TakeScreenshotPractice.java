package seleniumPractice_06092025;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotPractice {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver; //TakesScreenshot is an interface in Selenium.
		File src=ts.getScreenshotAs(OutputType.FILE); //captures the screenshot of the current browser window. and It stores that screenshot temporarily as a File object (here named src).
		File dest=new File("D\\Screenshots\\Kurats-Sets.jpeg"); //Creates a File object representing the final destination path where the screenshot will be saved.
		FileHandler.copy(src,dest); //FileHandler.copy() copies the screenshot from the temporary src file to the desired dest file location.
	}
}

// TakesScreenshot ts=(TakesScreenshot)driver;
// File src=ts.getScreenshotAs(OutputType.FILE);
// File dest=new File("D\\Screenshots\\Kurtas.jpeg");
// FileHandler.copy(src,dest);

// TakesScreenshot ts=(TakesScreenshot)driver;
// File src=ts.getScreenshotAs(OutputType.FILE);
// File dest=new File("D\\Screenshots\\Kurtas.jpeg");
// FileHandler.copy(src,dest);
    		 

package day12_05092025;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot extends HandlingScreenshot {
	
	public void getSS(String nm) throws IOException 
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Screenshots\\"+nm+".jpeg");
		FileHandler.copy(src, dest);
	}

}

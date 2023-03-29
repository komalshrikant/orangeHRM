package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	WebDriver driver; 
	public void Takescreenshot() throws IOException
	{
		File source =(( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\screenshot\\Image.png");
		FileHandler.copy(source, dest);
		
		
		
	}
	

}

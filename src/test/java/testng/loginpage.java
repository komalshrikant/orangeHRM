 package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pom.loginpagepom;

public class loginpage {

	public static void main(String[] args)  throws InterruptedException {
		//System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\Tast\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions Option=new ChromeOptions();
		Option.addArguments("--remote-allow-origins=*");
		 WebDriver Driver=new ChromeDriver(Option);
       Driver.get("https://www.facebook.com/");
       Driver.manage().window().maximize();
       Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       //1.Test case 1
       loginpagepom login = new loginpagepom(Driver);
                 login.sendusername("Admin");
                 login.sendpassword("Admin123");
                 login.loginbutton();
                 Thread.sleep(2000);
                 String ExpectedURL = "https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjc5MDYzNjI1LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
                	String ActualURL = Driver.getCurrentUrl()	; 
                	
                 
                 
	}

	
		
	}



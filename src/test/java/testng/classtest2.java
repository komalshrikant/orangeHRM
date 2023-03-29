package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.loginpagepom;
import utility.StaticBrowser;

public class classtest2 {
	
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeTest
	
	public void beforetest(String browser) 
	{
		driver=StaticBrowser.launchBrowser(browser,10, "https://www.facebook.com/");
		
	
		
		//ChromeOptions Option=new ChromeOptions();
	//Option.addArguments("--remote-allow-origins=*");
	 // driver=new ChromeDriver(Option);
      // driver.get("https://www.facebook.com/");
      // driver.manage().window().maximize();
     //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
		
       
   
       
		
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class of class2");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method of class2");
	}
	@Test
	public void Test() throws InterruptedException {
		//1.Test case 1
	       loginpagepom login = new loginpagepom(driver);
	                 login.sendusername("Admin");
	                 login.sendpassword("admin123");
	                 login.loginbutton();
	                 Thread.sleep(2000);
	       
	}
	//@Test
	//public void Test2() {
	//	System.out.println("test2 of class2");
	//}
	//@Test
	//public void Test3() {
	//	System.out.println("Test3 of class2");
	//}
	@AfterMethod

	public void AfterMethod() {
		System.out.println("After method of class2");
	}
	@AfterClass

	public void AfterClass() {
		System.out.println("After class of class2");
	}
	 @AfterTest
	 public void Aftertest() {
		 driver.quit();
		 
	 }

}

package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpagepom {
	
	//@FindBy(xpath="//input[@placeholder='Username']")
	// private WebElement Username;
	 
	// @FindBy(xpath="//input[@name='password']")
	 //private WebElement password;
	 
	// @FindBy(xpath="//button[contains( . ,'Login')]")
	// private WebElement login;
	 
	 @FindBy(xpath="//input[@name='email']")
	 private WebElement Username;
	 
	 @FindBy(xpath="//input[@id='pass']")
	 private WebElement password;
	 @FindBy(xpath="//a[text()=\"Create new account\"]")
	 private WebElement login;
	 
	 
	 public loginpagepom(WebDriver driver) {
		 
		 
		PageFactory.initElements(driver, this);
	 }
	 
	


	public void sendusername(String uname) {
		
	
		 Username.sendKeys("uname");
		 
	 }
	 public void sendpassword(String pass) {
		 password.sendKeys("pass");
	
	 }
  public void loginbutton() {
	  login.click();
	  
  }







	
}









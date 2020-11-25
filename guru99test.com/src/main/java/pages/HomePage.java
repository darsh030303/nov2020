package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	/*
	 * What is Page Factory in Selenium?
	Page Factory in Selenium is an inbuilt Page Object Model framework concept for Selenium WebDriver but it is very optimized. It is used for initialization of Page objects or to instantiate the Page object itself. It is also used to initialize Page class elements without using "FindElement/s."

	Here as well, we follow the concept of separation of Page Object Repository and Test Methods. Additionally,
	 with the help of class PageFactory in Selenium, we use annotations @FindBy to find WebElement. We use initElements method to initialize web elements
	 */
	
	/*
	 * AjaxElementLocatorFactory
AjaxElementLocatorFactory is a lazy loading concept of PageFactory in Selenium. It is used to find the web elements only when the elements are used in any operation. It assigns a timeout for WebElements to the object page class. 

	 */
	
		WebDriver driver;
		@FindBy(name="uid") WebElement username;
		@FindBy(name="password") WebElement pwd;
		@FindBy(name="btnLogin") WebElement login;
		@FindBy(className="barone") WebElement titletext;
		
		public HomePage(WebDriver driver)
		{
			// TODO Auto-generated constructor stub
			this.driver=driver;
			//This initElements method will create all WebElements

	        PageFactory.initElements(driver, this);
		}
		public void setusername(String setusername)
		{
			username.sendKeys(setusername);
		}
		public void setpwd(String setpwd)
		{
			pwd.sendKeys(setpwd);
		}
		public void clickonloginpage()
		{
			login.click();
		}
		
		public String gethomepagetitle()
		{
			return titletext.getText();
		}
		public void logintoguru99(String setusername, String setpwd)
		{
			this.setusername(setusername);
			this.setpwd(setpwd);
			this.clickonloginpage();
		}
}

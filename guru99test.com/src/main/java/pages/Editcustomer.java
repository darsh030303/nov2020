package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Editcustomer
{
	WebDriver driver;
	@FindBy(linkText="Edit Customer") WebElement editcustomerlink;
	
	public Editcustomer(WebDriver driver)
	{
		this.driver=driver;
		//This initElements method will create all WebElements

        PageFactory.initElements(driver, this);
	}
	public void clickeditcustomerlink()
	{
		editcustomerlink.click();
	}
	public String geteditcustomertitle()
	{
		return driver.getTitle();
	}
}

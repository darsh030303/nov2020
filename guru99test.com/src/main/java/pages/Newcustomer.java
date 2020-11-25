package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newcustomer
{
	WebDriver driver;
	@FindBy(linkText="New Customer") WebElement newcustomerlink;
	//@FindBy(name="sub") WebElement newcustomertitle;
	public Newcustomer(WebDriver driver)
	{
		this.driver=driver;
		//This initElements method will create all WebElements

        PageFactory.initElements(driver, this);
	}
	public void clicknewcustomerlink()
	{
		newcustomerlink.click();
	}
	public String getnewcustomertitle()
	{
		return driver.getTitle();
	}
}

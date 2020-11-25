package test;

import org.testng.annotations.Test;

import pages.DeleteCustomer;
import pages.Editcustomer;
import pages.HomePage;
import pages.Newcustomer;

import org.testng.annotations.BeforeTest;
import utilities.takescreenshot2;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class test1
{
	WebDriver  driver;
	HomePage objHomepage;
	Newcustomer objNewcustomer;
    Editcustomer objEditcustomer;
	DeleteCustomer objDeletecustomer;  
	
  @Test(priority=0)
  public void login() throws InterruptedException, IOException
  {
	 
	  objHomepage=new HomePage(driver);
	  String homepagetitle=objHomepage.gethomepagetitle();
	  System.out.println("homepage title: "+homepagetitle);
	 
	  objHomepage.logintoguru99("mngr293992","epabAdE");
	
	  try
	  {
		  objHomepage.clickonloginpage();
	  }
	  catch(NoSuchElementException e)
	  {
		 // System.out.prinln(+e);
	  }
	  catch(UnhandledAlertException e)
	  {
		  System.out.println("username or pwd is incorrect, so closing the test");
		  
	  }
	  Assert.assertTrue(homepagetitle.contains("Guru99 Bank"));
	   takescreenshot2.ss(driver);
	   System.out.println("test pass: login");
		  
  }
  
  @Test(priority=1)
  public void newcustomer()
  {
	  objNewcustomer=new Newcustomer(driver);
	  objNewcustomer.clicknewcustomerlink();
	  String newcustomertitle=objNewcustomer.getnewcustomertitle();
	  System.out.println("newcustomer title: "+newcustomertitle);
	  Assert.assertTrue(newcustomertitle.contains("Guru99 Bank New Customer Entry Page"));
	  System.out.println("test pass: newcustomer");
	  
  }
  
  @Test(priority=2)
  public void editcustomer()
  {
	  objEditcustomer=new Editcustomer(driver);
	  objEditcustomer.clickeditcustomerlink();
	  String editcustomertitle=objEditcustomer.geteditcustomertitle();
	  System.out.println("editcustomer title: "+editcustomertitle);
	  Assert.assertTrue(editcustomertitle.contains("Guru99 Bank Edit Customer Page"));
	  System.out.println("test pass: editcustomer");
	  
  }
  
  @Test(priority=3,enabled=true)
  public void deletecustomer()
  {
	  objDeletecustomer=new DeleteCustomer(driver);
	  objDeletecustomer.clickdeletecustomerlink();
	  String deletecustomertitle=objDeletecustomer.getdeletecustomertitle();
	  System.out.println("deletecustomer title: "+deletecustomertitle);
	  Assert.assertTrue(deletecustomertitle.contains("Guru99 Bank"));
	  System.out.println("test pass: deletecustomer");
	  
  }
  
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("http://demo.guru99.com/V4/");
	 
  }

  @AfterTest
  public void afterTest()
  {
	  driver.close();
  }

}

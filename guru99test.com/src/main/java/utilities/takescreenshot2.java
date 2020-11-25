package utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class takescreenshot2
{
	public static void ss(WebDriver driver) throws IOException
	{
		File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//// Create object of SimpleDateFormat class and decide the format
		DateFormat dateformat=new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
		
		////get current date time with Date()
		Date date=new Date();
		
		// Now format the date
		String date1=dateformat.format(date);
		String filename=date1+".jpg";
		FileUtils.copyFile(file1, new File("C:\\Users\\darsh\\eclipse-workspace\\guru99test.com\\src\\main\\java\\screenshots\\"+filename),true);
	}
}

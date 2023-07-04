package Genric_script;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements Framework_const
{
	public WebDriver driver;
	@BeforeMethod
	public void oppenAppln()
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void closeAppln(ITestResult res) throws IOException 
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Takes_ss.getPhoto(driver);
		}
		driver.close();
	}	
}

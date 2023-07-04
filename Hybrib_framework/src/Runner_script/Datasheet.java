package Runner_script;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Genric_script.Base_test;
import Genric_script.Dtt;
import Pom_script.Fb1;

public class Datasheet extends Base_test
{
	@Test(dataProvider = "testdata")
	public void test(String un,String pwd) throws InterruptedException
	{
		
		Fb1 f=new Fb1(driver);
		f.mail1(Dtt.get_data("Sheet1", 1, 0));
		f.mail2(Dtt.get_data("Sheet1", 2, 0));
		Thread.sleep(2000);
		f.mail3();
	  
	}
	@DataProvider(name = "testdata")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "gowri",  "gowri@123" },
	   { "Gowri", "Gowro@3333"},
	 };
	}
	}

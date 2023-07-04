package Runner_script;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Genric_script.Base_test;
import Pom_script.Fb1;

public class Runn_fb extends Base_test
{
@Test(dataProvider = "testdata")
public void test(String un,String pwd) throws InterruptedException
{
	
	Fb1 f=new Fb1(driver);
	f.mail1(un);
	Thread.sleep(2000);
	f.mail2(pwd);
	Thread.sleep(2000);
	f.mail3();
 
}
@DataProvider(name = "testdata")
public Object[][] createData1() {
 return new Object[][] {
   { "Cedric",  "gowri@123" },
   { "Anne", "Gowro@3333"},
 };
}
}

package Pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genric_script.BasePage;

public class Fb1 extends BasePage
{
	@FindBy(id="email")
	private WebElement unfeild;
	
	@FindBy(id="pass")
	private WebElement pwd;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement btn;
	
	public Fb1(WebDriver driver)//constuctor 
	{
		super(driver);
}
	public void mail1(String un)
	{
		unfeild.sendKeys(un);
	}
	
	public void mail2(String pass)
	{
		pwd.sendKeys(pass);
	}
	public void mail3()
	{
		btn.click();
	}
}

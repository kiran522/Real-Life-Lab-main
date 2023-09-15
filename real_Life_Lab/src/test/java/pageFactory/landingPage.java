package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPage {
	@FindBy(xpath =  "//a[contains(@class,'ico-login')]")
	private WebElement loginButton;


	public landingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void  LoginButton()
	{
		loginButton.click();
	}
}

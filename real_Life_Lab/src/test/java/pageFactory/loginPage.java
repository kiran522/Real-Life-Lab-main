package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	@FindBy(id =  "Email")
	private WebElement Email;
	
	@FindBy(id =  "Password")
	private WebElement Password;
	
	@FindBy(xpath =   "//input[contains(@class,'button-1 login-button')]")
	private WebElement LoginBtn;


	public loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void  email()
	{
		Email.sendKeys("kiru@gmail.com");
	}
	
	public void  password()
	{
		Password.sendKeys("kiru12");
	}
	
	public void  loginBtn()
	{
		LoginBtn.click();
	}
	
}

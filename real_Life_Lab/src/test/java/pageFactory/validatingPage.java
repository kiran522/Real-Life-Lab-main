package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class validatingPage {
	
	@FindBy(xpath =  "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/h2/a")
	private WebElement BookName;


	public validatingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void  LoginButton()
	{
		BookName.click();
	}
	}



package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchStore {
	@FindBy(id =  "small-searchterms")
	private WebElement SearchProduct;
	
	@FindBy(xpath =  "//input[contains(@class,'button-1 search-box-button')]")
	private WebElement SearchBtn;
	
	


	public searchStore(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void  searchProduct(String product)
	{
		
		SearchProduct.sendKeys(product);
	}
	
	public void  searchBtn()
	{
		SearchBtn.click();
	}
}

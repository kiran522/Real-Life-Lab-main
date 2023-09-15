package sharedSteps;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import util.ReadExcel;

public class search_product extends Driver10 {
	
	
	@Given("a user is on the landing page")
	public void a_user_is_on_the_landing_page() {
		LandingPage.LoginButton();
		logger.info("User is on the landing page");
	}

	@When("he click login button")
	public void he_click_login_button() {
		logger.info("User clicks on the login button");
		LoginPage.email();
		LoginPage.password();
		LoginPage.loginBtn();
	   
	}


	@When("he writes product name")
	public void he_writes_product_name() throws IOException, SQLException, ClassNotFoundException {
		
		
String[][] data = ReadExcel.getData("C:\\Users\\HP\\eclipse-workspace\\real_Life_Lab\\src\\test\\resources\\productname.xlsx", "Sheet1");
		
		for(int i =1;i<data.length;i++) {
			String product =data[i][1];
		
			SearchStore.searchProduct(product);
			SearchStore.searchBtn();
	String actual = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/h2/a")).getText();
			String expect = "Health Book";
		
			
			boolean assertionResult = actual.equals(expect);
		String	result = assertionResult ? "Pass" : "Fail";
		String s = "Fail";
		        if (!result.equals(s)) {
		           driver.findElement(By.id("small-searchterms")).clear();
		           driver.navigate().back();
		        }
		        
		
		
		
		
		
		
	}
		
	
	
	}

	@When("he clicks on search button")
	public void he_clicks_on_search_button() throws InterruptedException {
		Thread.sleep(5000);
		SearchStore.searchBtn();
		 logger.info("User clicks on the search button");
	}

	@Then("he must be able to verify the product {string}")
	public void he_must_be_able_to_verify_the_product(String expect) throws InterruptedException {
		Thread.sleep(5000);
		ValidatingPage.LoginButton();
		
	    String actual = driver.findElement(By.xpath("(//span[contains(@class,'label')])[4]")).getText();
	  assertEquals(actual, expect);
	  logger.info("Product verification completed");
	}

	
}

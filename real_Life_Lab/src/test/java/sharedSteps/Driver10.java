package sharedSteps;

import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.*;

import pageFactory.landingPage;
import pageFactory.loginPage;
import pageFactory.searchStore;
import pageFactory.validatingPage;
import org.apache.log4j.Level;


public class Driver10 extends tool10{
	protected static landingPage LandingPage;
	protected static loginPage LoginPage;
	protected static searchStore SearchStore;
	protected static validatingPage ValidatingPage;
	public static RequestSpecification httprequest;
	public static Response response;
	
	public static Logger logger;
	
	 
	
	
	public static void init()
	{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		LandingPage = new landingPage(driver);
		LoginPage = new loginPage(driver);
		SearchStore =new searchStore(driver);
		ValidatingPage = new validatingPage(driver);
	
		   logger = Logger.getLogger("LogDemo");
			PropertyConfigurator.configure("log4j.properties");
			logger.setLevel(Level.DEBUG);
		
	}


}

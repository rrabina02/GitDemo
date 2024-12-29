package rabinaqueendom.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import rabinaqueendom.TestComponent.BaseTests;
import rabinaqueendom.pageObjects.ProductCatalogue;

public class ErrorValidationTest extends BaseTests {
	
	@Test(groups={"ErrorHandling"})
	public void submitOrders() throws IOException, InterruptedException
	{
		String country="India";
		String productName= "ZARA COAT 3";
		String message="THANKYOU FOR THE ORDER.";
		//LandingPage landingPage=launchApplication();
		
		
		ProductCatalogue productCatalog= landingPage.loginApplication("yuvasri111@gmail.com", "Aa123123");
		Assert.assertEquals("Incorrect email or password.",landingPage.getErrorMessage());
		
		System.out.println("Welcome aboard");
		System.out.println("Welcome John");
		System.out.println("Welcome MAry");
		
		
		
}
}
	

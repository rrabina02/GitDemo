
package rabinaqueendom.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import rabinaqueendom.TestComponent.BaseTests;
import rabinaqueendom.pageObjects.CartPage;
import rabinaqueendom.pageObjects.CheckoutPage;
import rabinaqueendom.pageObjects.ConfirmationScreen;
import rabinaqueendom.pageObjects.OrderPage;
import rabinaqueendom.pageObjects.ProductCatalogue;

public class StandAloneTest extends BaseTests {
	private static String productName= "ZARA COAT 3";
	//String productName= "ZARA COAT 3";
	public static String message="THANKYOU FOR THE ORDER.";
	public static String country="India";
	
	
	@Test
	public void submitOrders() throws IOException, InterruptedException
	{
		//String country="India";
		//String productName= "ZARA COAT 3";
		//String message="THANKYOU FOR THE ORDER.";
		//LandingPage landingPage=launchApplication();
		
		
		ProductCatalogue productCatalog= landingPage.loginApplication("yuvasri1@gmail.com", "Aa123123");
		
		productCatalog.addProductToCart(productName);;
		CartPage cartPage =productCatalog.goToCart();
		
		Boolean match = cartPage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		CheckoutPage checkout =cartPage.goToCheckOut();
		checkout.selectCountry(country);
		ConfirmationScreen confirmScreen=checkout.submitPage();
		String cnfrmMessage =confirmScreen.confirmMessage();
		Assert.assertTrue(cnfrmMessage.equalsIgnoreCase(message));
		
		}
	
	@Test(dependsOnMethods= {"submitOrders"})
	public void orderList()
	{
		ProductCatalogue productCatalog= landingPage.loginApplication("yuvasri1@gmail.com", "Aa123123");
		OrderPage orderPage=productCatalog.goToOrdersPage();
		Assert.assertTrue(orderPage.verifyProductsDisplay(productName));
	}

}


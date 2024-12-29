package rabinaqueendom.pageObjects;



import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import rabinaqueendom.AbstractComponent.AbstractComponent;

public class CartPage extends AbstractComponent {
	
		WebDriver driver;
	
		public CartPage(WebDriver driver)
		{
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//div[@class='cartSection']/h3")
		List<WebElement> cartProducts;
		
		@FindBy(xpath="//button[text()='Checkout']")
		WebElement checkout;
		
		public Boolean VerifyProductDisplay(String productName)
		{
		
		Boolean match = cartProducts.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase(productName));
		return match;
		
}

		public Boolean VerifyProductNotDisplay(String productName)
		{
		
		Boolean match = cartProducts.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase(productName));
		return match;
		
}
		public CheckoutPage goToCheckOut()
		{
			checkout.click();
			return new CheckoutPage(driver);
		}
		public CheckoutPage goToCheckOut1()
		{
			checkout.click();
			return new CheckoutPage(driver);
		}
}

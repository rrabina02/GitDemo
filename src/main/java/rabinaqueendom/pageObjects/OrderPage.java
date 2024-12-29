package rabinaqueendom.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import rabinaqueendom.AbstractComponent.AbstractComponent;

public class OrderPage extends AbstractComponent {
	WebDriver driver;

	public OrderPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
	}
	
	@FindBy(css="tr td:nth-child(3)")
	List<WebElement> orderProducts;
	
	
	public Boolean verifyProductsDisplay(String productName)
	{
		Boolean productMatch =orderProducts.stream().anyMatch(product->product.getText().equalsIgnoreCase(productName));
		return productMatch;
	}
	

}

package rabinaqueendom.AbstractComponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import rabinaqueendom.pageObjects.CartPage;
import rabinaqueendom.pageObjects.OrderPage;

public class AbstractComponent {
	WebDriver driver;
	public AbstractComponent(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(css="[routerlink*='cart']")
	WebElement cartHeader;
	//driver.findElement(By.cssSelector("[routerlink*=\"cart\"]")).click();
	
	@FindBy(css="button[routerlink='/dashboard/myorders']")
	WebElement orderHeader;
	
public void waitForElementToAppear(By findBy)
	{

	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
}

public void waitForWebElementToAppear(WebElement findBy)
{

WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
wait.until(ExpectedConditions.visibilityOf(findBy));
}
public CartPage goToCart()
{
	cartHeader.click();
	CartPage cartPage = new CartPage(driver);
	return cartPage;
}

public OrderPage goToOrdersPage()
{
	orderHeader.click();
	OrderPage orderPage = new OrderPage(driver);
	return orderPage;
}


	//wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
	
	public void waitForElementToDisappear(WebElement ele) throws InterruptedException
	{
		Thread.sleep(1000);
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	public void scrollToElementToBeAppeared(WebElement element)
	{
		Actions a = new Actions(driver);
		a.scrollToElement(element).perform();
	}

}
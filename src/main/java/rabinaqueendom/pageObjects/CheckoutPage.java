package rabinaqueendom.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rabinaqueendom.AbstractComponent.AbstractComponent;

public class CheckoutPage extends AbstractComponent {
	WebDriver driver;
	public CheckoutPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@placeholder='Select Country']")
	WebElement countryName;
	@FindBy(xpath="(//button[contains(@class,'ta-item')])[2]")
	WebElement countryDropdown;
	@FindBy(css=".action__submit")
	WebElement submitButton;
	
	By countryToAppear =By.cssSelector(".ta-results");
	
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
	
	
	public void selectCountry(String country) {
		
		countryName.sendKeys(country);
		waitForElementToAppear(countryToAppear);
		countryDropdown.click();
		scrollToElementToBeAppeared(submitButton);
	}
	public ConfirmationScreen submitPage()
	{
		
		submitButton.click();
		return new ConfirmationScreen(driver);
		
	}

	
	
}

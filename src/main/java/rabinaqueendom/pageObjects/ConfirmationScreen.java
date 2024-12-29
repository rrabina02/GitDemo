package rabinaqueendom.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationScreen {

	WebDriver driver;
	public ConfirmationScreen(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	

	@FindBy(css=".hero-primary")
	WebElement confirmationMessage;
	
	public String confirmMessage()
	{
		String cnfrmMessage=confirmationMessage.getText();
		return cnfrmMessage;
	}

	
	
}

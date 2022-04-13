package suitelevellistener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage {
	
	@FindBy(id="pin")private WebElement PinBox;
	@FindBy(xpath="//button[@type='submit']")private WebElement Submit;
	
	// 2  constructor
	
	public PinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	// 3rd  Method
	
	public void EnterPin(String pin) {
		PinBox.sendKeys(pin);
	}
	public void clicksubmit() {
		Submit.click();
	}
}

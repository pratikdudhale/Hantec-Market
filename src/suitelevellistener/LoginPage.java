package suitelevellistener;



import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPage {
	
	
	@FindBy(id="userid")private WebElement ID;
	@FindBy(id="password")private WebElement passward;
	@FindBy(xpath="//button[@type='submit']")private WebElement Submit;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void EnterID(String uid) {
		ID.sendKeys(uid);
	}
	public void EnterPass(String pass)
	{
		passward.sendKeys(pass);
	}
	public void clicksubmit() {
		Submit.click();
	}


}

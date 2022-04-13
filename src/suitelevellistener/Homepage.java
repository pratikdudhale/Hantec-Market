package suitelevellistener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Homepage {
	
	@FindBy(xpath="//span[@class='user-id']")private WebElement userID;
@FindBy(xpath="//a[@target='_self']")private WebElement Logout;

public Homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public String ValidateID() {
	
	String ActualuserID = userID.getText();
	return ActualuserID;
	
	//we will verify uing Testng assert so not using if-else statement
	
//	if(ActualuserID.equals(expectedUserID)) {
//		System.out.println("UserId match TC is passes");
//	}
//	else {
//		System.out.println("userID not match TC failed");
//	}
}
	public void Clicklogout() throws InterruptedException {
		userID.click();
		Thread.sleep(2000);
	Logout.click();
	
	}

}

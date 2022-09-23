package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	@FindBy(id="username-input-box")
	WebElement user;
	

	public void enterUsername(String username) {
		enterValue(user, username);
	}
	
	@FindBy(id = "input-pw")
	WebElement pass;
	
	public void enterPassword(String password) {
		enterValue(pass, password);
	}
	@FindBy (xpath = "//button[@class='Login_signInButton__2M4u5']")
	WebElement loginButton;
	
	public void clickLoginButton() {
		clickAction(loginButton);
	}
	@FindBy (xpath = "(//span[@class='navDropdownText'])[4]")
	WebElement logoutdrop;
	
	public void clicklogoutdrop() {
		clickAction(logoutdrop);
	}
	@FindBy (xpath = "//div[@class='dropdown-menu show']")
	WebElement logout;
	
	public void clicklogout() {
		clickAction(logout);
	}
}

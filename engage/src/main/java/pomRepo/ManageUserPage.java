package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import generic.FrameworkConstants;

public class ManageUserPage extends BasePage {
	public ManageUserPage(WebDriver driver) {
		super(driver);
	}
	
	
	
	@FindBy(xpath="//a[@href=\"/users\"]")
	WebElement manageusers;
	

	public void clickManageUsers() {
		clickAction(manageusers);
	}
	
	@FindBy(xpath="//button[@title=\"Create User\"]")
	WebElement CreateUsers;
	

	public void clickCreateUsers() {
		clickAction(CreateUsers);
	}
	@FindBy (xpath = "//input[@name=\"userName\"]")
	WebElement username1;
	
	public void enterUsername1() {
		enterValue(username1, FrameworkConstants.username1);
	}
	public String geterrortext() {
		return username1.getText();
	}
	@FindBy (xpath = "//input[@name=\"password\"]")
	WebElement password1;
	
	public void enterPassword1() {
		enterValue(password1, FrameworkConstants.password1);
	}
	@FindBy (xpath = "//input[@name=\"passwordConfirm\"]")
	WebElement confpass1;
	
	public void enterConfpass1() {
		enterValue(confpass1, FrameworkConstants.confpass1);
	}
	@FindBy (xpath = "//input[@name=\"firstName\"]")
	WebElement firstname1;
	
	public void enterFirstname1() {
		enterValue(firstname1, FrameworkConstants.firstname1);
	}
	@FindBy (xpath = "//input[@name=\"lastName\"]")
	WebElement lastname1;
	
	public void enterLastname1() {
		enterValue(lastname1, FrameworkConstants.lastname1);
	}
	@FindBy (xpath = "//input[@name=\"email\"]")
	WebElement email;
	
	public void enterEmail() {
		enterValue(email, FrameworkConstants.email);
	}
	@FindBy (xpath = "//input[@name=\"phone\"]")
	WebElement phone;
	
	public void enterPhone() {
		enterValue(phone, FrameworkConstants.phone);
	}
	@FindBy (xpath = "//select[@id='role']")
	WebElement drop;
	public void clickRole() {
		clickAction(drop);
	}
	@FindBy (xpath = "//option[@value='CREATOR']")
	WebElement creator;
	public void clickRoleCreator() {
		clickAction(creator);
	}
	
	@FindBy (xpath = "(//button[@class=\"btn btn-primary\"])[2]")
	WebElement save;
	
	public void clicksave() {
		clickAction(save);
	}
	@FindBy (css = "button[class='btn-close']")
	WebElement close;
	
	public void clickclose() {
		clickAction(close);
	}
	@FindBy (xpath = "//div[text()='User saved successfully']")
	WebElement toastsucess;
	
	public String gettoasttext() {
		return toastsucess.getText();
	}
}

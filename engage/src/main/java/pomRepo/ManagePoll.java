package pomRepo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.FrameworkConstants;

public class ManagePoll extends BasePage{

	public ManagePoll(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@href=\"/poll/user\"]")
	WebElement managepoll;
	
	public void clickmanagepoll() {
		clickAction(managepoll);
	}
	@FindBy(xpath = "(//div[@class=\"ManagePolls_tableBtn__pmnx6 ManagePolls_tableMenuBtn__Jmgtc\"])[1]")
	WebElement action;
	
	public void clickaction() {
		clickAction(action);
	}
	@FindBy(xpath = "(//div[@class=\"ManagePolls_tableBtn__pmnx6 ManagePolls_tablePublishBtn__gvA+H\"])[1]")
	WebElement publish;
	
	public void clickpublish() {
		clickAction(publish);
	}
	
	@FindBy(xpath = "//img[@class='cursor-pointer']")
	WebElement copypoll;
	
	public void clickcopypoll() {
		clickAction(copypoll);
	}
	
	@FindBy(xpath = "//div[text()='JOIN AS A PARTICIPANT']")
	WebElement joinasparticipant;
	
	public void clickjoinasparticipant() {
		clickAction(joinasparticipant);
	}
	
	@FindBy(xpath="//input[@type='text']")
	WebElement guestname;
	public void enterguestname() {
		enterValue(guestname, FrameworkConstants.guestname1);
	}
	
	@FindBy(xpath="//input[@type='number']")
	WebElement pollcode;
	public void enterpollcode() {
		clickAction(pollcode);
		
		
	}
	@FindBy(xpath = "//button[text()='Enter Poll']")
	WebElement joinpoll;
	
	public void clickjoinpoll() {
		clickAction(joinpoll);
	}
	
	@FindBy(xpath = "//button[@class=\" Button_normalButton__vHTuv Button_midButton__uC3xe Button_midButtonFont__hOT+5\"]")
	WebElement sharenow;
	
	public void clickSharenow() {
		clickAction(sharenow);
	}
	
	@FindBy(xpath="(//img[@id=\"ICON_1\"])[1]")
	WebElement start1;
	
	public void clickStart1() {
		clickAction(start1);
	}
	@FindBy(xpath="//div[text()='Question #1 has been shared successfully.']")
	WebElement question1toast;
	
	public String getquestion1toast() {
		return question1toast.getText();
	}
	@FindBy(xpath="//div[text()='Question #2 has been shared successfully.']")
	WebElement question2toast;
	
	public String getquestion2toast() {
		return question2toast.getText();
	}
	@FindBy(xpath="//div[text()='Question #3 has been shared successfully.']")
	WebElement question3toast;
	
	public String getquestion3toast() {
		return question3toast.getText();
	}
	
	@FindBy(xpath="//span[text()='Question Done']")
	WebElement questiondone;
	
	public Boolean checkquestiondone() {
		return questiondone.isDisplayed();
	}
	
	@FindBy(xpath="(//img[@id=\"ICON_3\"])[1]")
	WebElement pause1;
	
	public void clickPause() {
		clickAction(pause1);
	}
	@FindBy(xpath="(//img[@id=\"ICON_2\"])[1]")
	WebElement lock1;
	
	public void clickLock() {
		clickAction(lock1);
	}
	@FindBy(xpath="(//img[@id=\"ICON_1\"])[3]")
	WebElement start3;
	
	public void clickStart3() {
		clickAction(start3);
	}
	@FindBy(xpath="(//img[@id=\"ICON_3\"])[3]")
	WebElement pause3;
	
	public void clickPause3() {
		clickAction(pause3);
	}
	@FindBy(xpath="(//img[@id=\"ICON_2\"])[3]")
	WebElement lock3;
	
	public void clickLock3() {
		clickAction(lock3);
	}
	@FindBy(xpath="(//img[@id=\"ICON_1\"])[2]")
	WebElement start2;
	
	public void clickStart2() {
		clickAction(start2);
	}
	@FindBy(xpath="(//img[@id=\"ICON_3\"])[2]")
	WebElement pause2;
	
	public void clickPause2() {
		clickAction(pause2);
	}
	@FindBy(xpath="(//img[@id=\"ICON_2\"])[2]")
	WebElement lock2;
	
	public void clickLock2() {
		clickAction(lock2);
	}
	
	@FindBy(xpath="//input[@placeholder='Find by Poll Title']")
	WebElement searchpoll;
	public void entersearchpoll() {
		enterValue(searchpoll, FrameworkConstants.searchpollvalue);
	}
	@FindBy(xpath = "//div[@class='ManagePolls_searchBoxSearchBtn__6T3n+']")
	WebElement searchbutton;
	public void clickpollsearch() {
		clickAction(searchbutton);
	}
	
	
	
	
}

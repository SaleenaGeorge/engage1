package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PollCreation extends BasePage{
	
	public PollCreation(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath ="//button[@class='navbar-toggler collapsed']")
	WebElement navbar;
	
	public void clickNavBar() {
		clickAction(navbar);
	}
	
	@FindBy (xpath = "(//span[@class='navDropdownText'])[1]")
	WebElement poll;
	
	public void clickPoll() {
		clickAction(poll);
	}
	
	@FindBy (xpath = "//a[@href=\"/create\"]")
	WebElement createpoll;
	
	public void clickCreatePoll() {
		clickAction(createpoll);
	}
	
	@FindBy (xpath = "//a[@href=\"/poll/user\"]")
	WebElement managepoll;
	
	public void clickManagePoll() {
		clickAction(managepoll);
	}
	
	
	@FindBy (xpath = "(//div[@class=\"container\"])[2]")
	WebElement multiplechoice;
	
	public void clickMultipleChoice() {
		clickAction(multiplechoice);
	}
	
	@FindBy(xpath = "//input[@class=\"poll-header-text focus-outline-none\"]")
	WebElement pollheader;
	
	public void enterPollHeader(String header) {
		enterValue(pollheader, header);
	}
	
	@FindBy (xpath = "//textarea[@class=\"poll-sub-text focus-outline-none\"]")
	WebElement polldesc;
	
	public void enterPollDesc(String desc) {
		enterValue(polldesc, desc);
	}
	
	@FindBy(xpath = "(//input[@class=\"poll-sub-text focus-outline-none\"])[1]")
	WebElement mcq;
	
	public void enterMcq(String mcquestion) {
		enterValue(mcq, mcquestion);
	}
	@FindBy(xpath = "(//input[@class=\"poll-sub-text focus-outline-none\"])[2]")
	WebElement mcqoption1;
	
	public void enterMcqoption1(String mcq1option) {
		enterValue(mcqoption1, mcq1option);
	}
	@FindBy(xpath = "(//input[@class=\"poll-sub-text focus-outline-none\"])[3]")
	WebElement mcqoption2;
	
	public void enterMcqoption2(String mcq2option) {
		enterValue(mcqoption2, mcq2option);
	}
	@FindBy(xpath = "(//input[@class=\"poll-sub-text focus-outline-none\"])[4]")
	WebElement mcqoption3;
	
	public void enterMcqoption3(String mcq3option) {
		enterValue(mcqoption3, mcq3option);
	}
	@FindBy(xpath = "(//input[@class=\"poll-sub-text focus-outline-none\"])[5]")
	WebElement mcqoption4;
	
	public void enterMcqoption4(String mcq4option) {
		enterValue(mcqoption4, mcq4option);
	}
	@FindBy(xpath = "(//div[@class='radio-outer-circle unselected'])[2]")
	WebElement correctoption;
	
	public void clickcorrectoption() {
		clickAction(correctoption);
	}
	@FindBy(xpath = "//button[@title='New Question']")
	WebElement newquestionbutton;
	
	public void clicknewquestion() {
		clickAction(newquestionbutton);
	}
	
	@FindBy(xpath="(//div[@class='nav-item dropdown'])[8]")
	WebElement changequestiondrop;
	
	public void changequestion() {
		clickAction(changequestiondrop);
	}
	@FindBy(xpath="(//a[@class='poll-navdropdown-item dropdown-item'])[1]")
	WebElement shortans;
	
	public void clickshortans() {
		clickAction(shortans);
	}
	
	@FindBy(xpath = "//input[@placeholder='Type short answer question here.']")
	WebElement saq;
	
	public void entersaq(String saquestion) {
		enterValue(saq, saquestion);
	}
	
	@FindBy(xpath = "//input[@placeholder='Correct Answer']")
	WebElement sa;
	
	public void entersa(String sanswer) {
		enterValue(sa, sanswer);
	}
	@FindBy(xpath="(//div[@class='nav-item dropdown'])[11]")
	WebElement changequestiondrop2;
	
	public void changequestion2() {
		clickAction(changequestiondrop2);
	}
	@FindBy(xpath="(//a[@class='poll-navdropdown-item dropdown-item'])[5]")
	WebElement tf;
	
	public void clicktf() {
		clickAction(tf);
	}
	@FindBy(xpath = "//input[@placeholder='Type true or false question here.']")
	WebElement tfq;
	
	public void entertfq(String tfquestion) {
		enterValue(tfq, tfquestion);
	}
	@FindBy(xpath = "(//div[@class='radio-outer-circle unselected'])[5]")
	WebElement correctoptiontf;
	
	public void clickcorrectoptiontf() {
		clickAction(correctoptiontf);
	}
	@FindBy(xpath="(//div[@class='nav-item dropdown'])[14]")
	WebElement changequestiondrop3;
	
	public void changequestion3() {
		clickAction(changequestiondrop3);
	}
	@FindBy(xpath="(//a[@class='poll-navdropdown-item dropdown-item'])[9]")
	WebElement fitb;
	
	public void clickfitb() {
		clickAction(fitb);
	}
	@FindBy(xpath = "(//div[@class='fitb-input-col margin-vertical-auto no-padding col'])[1]")
	WebElement fitbq;
	
	public void enterfitbq(String fitbquestion) {
		enterValue(fitbq, fitbquestion);
	}
	@FindBy(xpath = "(//button[@id='add-button-container'])[1]")
	WebElement addblank;
	
	public void clickaddblank() {
		clickAction(addblank);
	}
	@FindBy(xpath = "(//input[@class='fitb-bold focus-outline-none '])")
	WebElement blankcorrectans;
	
	public void enterblankcorrectans(String blankcorrectanswer) {
		enterValue(blankcorrectans, blankcorrectanswer);
	}
	@FindBy (xpath = "//button[@title=\"Save Poll\"]")
	WebElement savePollButton;
	
	public void clickSavePollButton() {
		clickAction(savePollButton);
	}

}

package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PollCreation extends BasePage{
	
	public PollCreation(WebDriver driver) {
		super(driver);
	}
	
	
	
	
	
	
	@FindBy(xpath = "//input[@class=\"poll-header-text focus-outline-none\"]")
	WebElement pollheader;
	
	public void enterPollHeader(String header) {
		enterValue(pollheader, header);
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
	@FindBy(xpath = "(//div[@class='radio-outer-circle unselected'])[1]")
	WebElement correctoption;
	
	public void clickcorrectoption() {
		clickAction(correctoption);
	}
	@FindBy(xpath = "//button[@title='Add Question']")
	WebElement newquestionbutton;
	
	public void clicknewquestion() {
		clickAction(newquestionbutton);
	}
	@FindBy(xpath = "//div[text()='Question 2']")
	WebElement question2;
	
	public void clickquestion2() {
		clickAction(question2);
	}
	
	@FindBy(xpath="(//div[@class='nav-item dropdown'])[2]")
	WebElement changequestiondrop;
	
	public void changequestion() {
		clickAction(changequestiondrop);
	}
	@FindBy(xpath="//a[text()='Short Answer']")
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
	@FindBy(xpath = "//div[text()='Question 3']")
	WebElement question3;
	
	public void clickquestion3() {
		clickAction(question3);
	}
	@FindBy(xpath="//a[text()='True or False']")
	WebElement tf;
	
	public void clicktf() {
		clickAction(tf);
	}
	@FindBy(xpath = "//input[@placeholder='Type true or false question here.']")
	WebElement tfq;
	
	public void entertfq(String tfquestion) {
		enterValue(tfq, tfquestion);
	}
	@FindBy(xpath = "(//div[@class='radio-outer-circle unselected'])[4]")
	WebElement correctoptiontf;
	
	public void clickcorrectoptiontf() {
		clickAction(correctoptiontf);
	}
	
	@FindBy(xpath="(//a[text()='Fill in the Blank']")
	WebElement fitb;
	
	public void clickfitb() {
		clickAction(fitb);
	}
	@FindBy(xpath = "//a[text()='Fill in the Blank']")
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

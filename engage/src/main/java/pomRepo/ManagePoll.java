package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.FrameworkConstants;

public class ManagePoll extends BasePage{

	public ManagePoll(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class=\"ManagePolls_tablePublishBtn__gvA+H\"][1]")
	WebElement go;
	
	public void clickgo() {
		clickAction(go);
	}
	
	@FindBy(xpath = "//button[@class=\" Button_normalButton__vHTuv Button_midButton__uC3xe Button_midButtonFont__hOT+5\"]")
	WebElement sharenow;
	
	public void clickSharenow() {
		clickAction(sharenow);
	}
	
	@FindBy(id = "ICON_1")
	WebElement start;
	
	public void clickStart() {
		clickAction(start);
	}
	
	@FindBy(id = "ICON_3")
	WebElement pause;
	
	public void clickPause() {
		clickAction(pause);
	}
	@FindBy(id = "ICON_2")
	WebElement lock;
	
	public void clickLock() {
		clickAction(lock);
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

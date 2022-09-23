package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pomRepo.ManagePoll;
import pomRepo.PollCreation;

public class MnagePollsTestcase  extends BaseTest{
	
	@Test
	public void dropdown() throws InterruptedException {
     PollCreation pollcreation= new PollCreation(driver);
     
     pollcreation.clickPoll();
     pollcreation.clickManagePoll();
     
     ManagePoll managepoll=new ManagePoll(driver);
     managepoll.clickgo();
     managepoll.clickSharenow();
     Thread.sleep(2000);
     managepoll.clickStart();
     Thread.sleep(11000);
     
	}
	@Test
	public void searchpolltestcase() throws InterruptedException {
		PollCreation pollcreation= new PollCreation(driver);
	     
	     pollcreation.clickPoll();
	     pollcreation.clickManagePoll();
	     
	     ManagePoll managepoll=new ManagePoll(driver);
	     managepoll.entersearchpoll();
	     Thread.sleep(2000);
	     managepoll.clickpollsearch();
	     Thread.sleep(2000);
}
}
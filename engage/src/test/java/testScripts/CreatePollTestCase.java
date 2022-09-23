package testScripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.ExcelLibrary;
import pomRepo.PollCreation;
import pomRepo.ManagePoll;

public class CreatePollTestCase  extends BaseTest{
	
	@Test(dataProvider = "Register")
	public void registerTestCase(String header,String desc, String mcqquestion, String mcq1option, String mcq2option,String mcq3option,String mcq4option,String saquestion,String sanswer,String tfquestion,String fitbquestion,String blankcorrectanswer) throws InterruptedException {
		PollCreation pollcreation=new PollCreation(driver);
		Thread.sleep(2000);
		pollcreation.clickPoll();
		pollcreation.clickCreatePoll();
		pollcreation.clickMultipleChoice();
		pollcreation.enterPollHeader(header);
		pollcreation.enterPollDesc(desc);
		pollcreation.enterMcq(mcqquestion);
		pollcreation.enterMcqoption1(mcq1option);
		pollcreation.enterMcqoption2(mcq2option);
		pollcreation.enterMcqoption3(mcq3option);
		pollcreation.enterMcqoption4(mcq4option);
		pollcreation.clickcorrectoption();
		pollcreation.clicknewquestion();
		Thread.sleep(2000);
		pollcreation.changequestion();
		pollcreation.clickshortans();
		pollcreation.entersaq(saquestion);
		pollcreation.entersa(sanswer);
		pollcreation.clicknewquestion();
		pollcreation.changequestion2();
		pollcreation.clicktf();
		pollcreation.entertfq(tfquestion);
		pollcreation.clickcorrectoptiontf();
		//pollcreation.clicknewquestion();
		//pollcreation.changequestion3();;
		//pollcreation.clickfitb();
		//pollcreation.enterfitbq(fitbquestion);
		//pollcreation.clickaddblank();
		//pollcreation.enterblankcorrectans(blankcorrectanswer);
		
		pollcreation.clickSavePollButton();
		
		
		
	}
	
	@DataProvider(name = "Register")
	public Object[][] testData() throws IOException {
		ExcelLibrary lib=new ExcelLibrary();
		
			return lib.readMultipleData("Register");
		
		
	}
	
	

}

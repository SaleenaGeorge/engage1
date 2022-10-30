package testScripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.ExcelLibrary;
import generic.ScreenshotMethod;
import pomRepo.PollCreation;
import pomRepo.ManagePoll;

public class CreatePollTestCase  extends BaseTest{
	
	@Test(dataProvider = "Register")
	public void registerTestCase(String header,String desc, String mcqquestion, String mcq1option, String mcq2option,String mcq3option,String mcq4option,String saquestion,String sanswer,String tfquestion,String fitbquestion,String blankcorrectanswer) throws InterruptedException, IOException {
		PollCreation pollcreation=new PollCreation(driver);
		Thread.sleep(2000);
		
		
		
		pollcreation.enterPollHeader(header);
		
		pollcreation.enterMcq(mcqquestion);
		pollcreation.enterMcqoption1(mcq1option);
		pollcreation.enterMcqoption2(mcq2option);
		pollcreation.enterMcqoption3(mcq3option);
		pollcreation.enterMcqoption4(mcq4option);
		pollcreation.clickcorrectoption();
		pollcreation.clicknewquestion();
		Thread.sleep(2000);
		pollcreation.clickquestion2();
		pollcreation.changequestion();
		pollcreation.clickshortans();
		pollcreation.entersaq(saquestion);
		pollcreation.entersa(sanswer);
		pollcreation.clicknewquestion();
		pollcreation.clickquestion3();
		pollcreation.changequestion();
		pollcreation.clicktf();
		pollcreation.entertfq(tfquestion);
		pollcreation.clickcorrectoptiontf();
		//pollcreation.clicknewquestion();
		//pollcreation.changequestion3();;
		//pollcreation.clickfitb();
		//pollcreation.enterfitbq(fitbquestion);
		//pollcreation.clickaddblank();
		//pollcreation.enterblankcorrectans(blankcorrectanswer);
		Thread.sleep(2000);
		pollcreation.clickSavePollButton();
		
		Thread.sleep(10000);
		
		
		
	}
	
	@DataProvider(name = "Register")
	public Object[][] testData() throws IOException {
		ExcelLibrary lib=new ExcelLibrary();
		
			return lib.readMultipleData("Register");
		
		
	}
	
	

}

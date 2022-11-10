package testScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.ExcelLibrary;
import generic.FrameworkConstants;
import generic.ScreenshotMethod;
import pomRepo.PollCreation;
import pomRepo.ManagePoll;

public class CreategradedPollTestCase  extends BaseTest{
	
	@Test(dataProvider = "Register")
	public void registerTestCase(String header,String desc, String mcqquestion, String mcq1option, String mcq2option,String mcq3option,String mcq4option,String saquestion,String sanswer,String tfquestion,String fitbquestion,String blankcorrectanswer) throws InterruptedException, IOException {
		
		
		PollCreation pollcreation=new PollCreation(driver);
		Thread.sleep(2000);
		
		
		
		pollcreation.enterPollHeader(header);
		
		pollcreation.enterMcq(mcqquestion);
		
		File file = new File(FrameworkConstants.IMAGE_PATH1);
		WebElement image=driver.findElement(By.xpath("//input[@class='browse-box']"));
		image.sendKeys(file.getAbsolutePath());
	
		
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
		
		File file2 = new File(FrameworkConstants.IMAGE_PATH2);
		
		image.sendKeys(file2.getAbsolutePath());
		
		pollcreation.entersa(sanswer);
		pollcreation.clicknewquestion();
		pollcreation.clickquestion3();
		pollcreation.changequestion();
		pollcreation.clicktf();
		pollcreation.entertfq(tfquestion);
		
		File file3 = new File(FrameworkConstants.IMAGE_PATH3);
		
		image.sendKeys(file3.getAbsolutePath());
	
		pollcreation.clickcorrectoptiontf();
		pollcreation.clicknewquestion();
		pollcreation.clickquestion4();
		pollcreation.changequestion();
		pollcreation.clickfit();
		pollcreation.enterfitbq(fitbquestion);
		pollcreation.clickaddblank();
		pollcreation.enterblankcorrectans(blankcorrectanswer);
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

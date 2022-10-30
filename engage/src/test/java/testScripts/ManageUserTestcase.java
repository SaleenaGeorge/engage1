package testScripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.ScreenshotMethod;
import pomRepo.ManageUserPage;

public class ManageUserTestcase extends BaseTest {
	
	@Test
	public void createuser() throws InterruptedException, IOException {
		ManageUserPage mup=new ManageUserPage(driver);
		
	
		mup.clickManageUsers();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		mup.clickCreateUsers();
		mup.enterUsername1();
		mup.enterPassword1();
		mup.enterConfpass1();
		mup.clickRole();
		mup.clickRoleCreator();
	
		
		
		mup.enterFirstname1();
		mup.enterLastname1();
		mup.enterEmail();
		mup.enterPhone();
		Thread.sleep(2000);
		mup.clicksave();
		
		Thread.sleep(10000);
		
		SoftAssert sa=new SoftAssert();
		
		//Check the toast message
	
		String actualtoastmessage=mup.gettoasttext();
		String expectedtoastmessage="User saved successfully";
		sa.assertEquals(actualtoastmessage, expectedtoastmessage);
		sa.assertAll();
		}
	
	@Test
	public void createusersame() throws InterruptedException, IOException {
		ManageUserPage mup=new ManageUserPage(driver);
		
	
		mup.clickManageUsers();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		mup.clickCreateUsers();
		mup.enterUsername1();
		mup.enterPassword1();
		mup.enterConfpass1();
		mup.clickRole();
		mup.clickRoleCreator();
	
		
		
		mup.enterFirstname1();
		mup.enterLastname1();
		mup.enterEmail();
		mup.enterPhone();
		Thread.sleep(2000);
		mup.clicksave();
		
		Thread.sleep(10000);
		SoftAssert sa=new SoftAssert();
		//check error message
		
		String actualerrormessage=mup.geterrortext();
		String expectederrormessage="The user name already exists in database";
		sa.assertEquals(actualerrormessage, expectederrormessage);
		
		mup.clickclose();
		sa.assertAll();
		}
}
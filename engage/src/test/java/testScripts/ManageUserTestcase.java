package testScripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pomRepo.ManageUserPage;

public class ManageUserTestcase extends BaseTest {
	
	@Test
	public void createuser() throws InterruptedException {
		ManageUserPage mup=new ManageUserPage(driver);
		
		mup.clickAdmin();
		mup.clickManageUsers();
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
		
	}

}

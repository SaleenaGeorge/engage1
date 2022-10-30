package testScripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import generic.ScreenshotMethod;
import pomRepo.CoursesPage;

public class coursetestcase extends BaseTest {
	
	@Test
	public void createCourseme() throws InterruptedException, IOException{
		CoursesPage cp=new CoursesPage(driver);
		Thread.sleep(2000);
		
		cp.clickCreateCourses();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		cp.enterCoursecode();
		cp.enterCoursename();
		cp.enterInstructorname();
		cp.enterdate();
		Thread.sleep(2000);
		cp.clickcreate();
		
		Thread.sleep(4000);
		cp.clickclose();
	}

}

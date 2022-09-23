package testScripts;

import org.testng.annotations.Test;

import pomRepo.CoursesPage;

public class coursetestcase extends BaseTest {
	
	@Test
	public void createCourseme() throws InterruptedException{
		CoursesPage cp=new CoursesPage(driver);
		cp.clickCourses();
		cp.clickCreateCourses();
		cp.enterCoursecode();
		cp.enterCoursename();
		cp.enterInstructorname();
		cp.enterdate();
		Thread.sleep(2000);
		cp.clickcreate();
	}

}

package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.FrameworkConstants;

public class CoursesPage extends BasePage {
	public CoursesPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	@FindBy(xpath="(//span[@class='navDropdownText'])[2]")
	WebElement courses;
	

	public void clickCourses() {
		clickAction(courses);
	}
	
	@FindBy(xpath="//a[@href=\"/home/create\"]")
	WebElement createcourses;
	

	public void clickCreateCourses() {
		clickAction(createcourses);
	}
	@FindBy (xpath = "(//input[@class=\"form-control\"])[1]")
	WebElement coursecode;
	
	public void enterCoursecode() {
		enterValue(coursecode, FrameworkConstants.coursecode
				);
	}
	@FindBy (xpath = "(//input[@class=\"form-control\"])[2]")
	WebElement coursename;
	
	public void enterCoursename() {
		enterValue(coursename, FrameworkConstants.coursename);
	}
	@FindBy (xpath = "(//input[@class=\"form-control\"])[3]")
	WebElement instructorname;
	
	public void enterInstructorname() {
		enterValue(instructorname, FrameworkConstants.instructorname);
	}
	@FindBy (xpath = "//input[@type='date']")
	WebElement date;
	
	public void enterdate() {
		enterValue(date, FrameworkConstants.date);
	}
	@FindBy (xpath = "//button[@class=\"modal-button-submit\"]")
	WebElement create;
	
	public void clickcreate() {
		clickAction(create);
	}
}


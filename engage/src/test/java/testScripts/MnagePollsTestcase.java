package testScripts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.FrameworkConstants;
import generic.ScreenshotMethod;
import pomRepo.ManagePoll;
import pomRepo.PollCreation;

public class MnagePollsTestcase  extends BaseTest{
	
	@Test
	public void dropdown() throws InterruptedException, IOException {
     
     
     ManagePoll managepoll=new ManagePoll(driver);
     managepoll.clickmanagepoll();
     Alert alt=driver.switchTo().alert();
     alt.accept();
     managepoll.clickaction();
     managepoll.clickpublish();
     managepoll.clickpublishwithoutcourse();
     Thread.sleep(2000);
     managepoll.clickcopypoll();
     Thread.sleep(2000);
     
     
     ChromeOptions o= new ChromeOptions();
     o.addArguments("−−incognito");
     DesiredCapabilities c = DesiredCapabilities.chrome();
     c.setCapability(ChromeOptions.CAPABILITY, o);
     WebDriver driver = new ChromeDriver(o);
    
     driver.get(FrameworkConstants.URL);
     driver.manage().window().maximize(); 
     driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
     
     
     
     driver.findElement(By.xpath("//div[text()='JOIN AS A PARTICIPANT']")).click();
    Thread.sleep(2000);
   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("guestname1");
    driver.findElement(By.xpath("//input[@type='number']")).click();
   Actions action = new Actions(driver);
   action.keyDown( Keys.CONTROL ).sendKeys( "v" ).keyUp( Keys.CONTROL ).build().perform();
     
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[text()='Enter Poll']")).click();
     
    // managepoll.clickjoinasparticipant();
   //  Thread.sleep(2000);
    // managepoll.enterguestname();
    // managepoll.enterpollcode();
    // Actions action = new Actions(driver);
    // action.keyDown( Keys.CONTROL ).sendKeys( "v" ).keyUp( Keys.CONTROL ).build().perform();
     //managepoll.clickjoinpoll();
     
    // driver.switchTo().window(MainWindow);
     managepoll.clickSharenow();
     Thread.sleep(2000);
     //share question 1
     managepoll.clickStart1();
     
     SoftAssert sa=new SoftAssert();
		
		//Check the toast message
	
		String actualtoastmessage=managepoll.getquestion1toast();
		System.out.println(actualtoastmessage);
		String expectedtoastmessage="Success!\n"
				+ "Question #1 has been shared successfully.";
		sa.assertEquals(actualtoastmessage, expectedtoastmessage);
	
	String getreadytimer=driver.findElement(By.xpath("//div[@class='get-ready-timer-value']")).getText();
	System.out.println(getreadytimer);
	
    driver.findElement(By.xpath("//input[@id='MCSS0']")).click();
    driver.findElement(By.xpath("//button[@id='sub-btn']")).click();
    
    String actualwelldone=driver.findElement(By.xpath("//div[@class='pop-up-card card']")).getText();
	System.out.println(actualwelldone);
	String expectedwelldone="Well Done! Correct.\n"
			+ "Class results in a few moments.";
	sa.assertEquals(actualwelldone, expectedwelldone);
    
     
     Thread.sleep(10000);
        
    Boolean yesdone= managepoll.checkquestiondone();
    sa.assertEquals(yesdone, true);
    sa.assertAll();
    
   // String classresult=driver.findElement(By.xpath("//*[@id='everything']/div[2]/div[2]/div/svg/g[2]/g[4]/text[1]")).getText();
	//System.out.println(classresult);
    //share question 2
	managepoll.clickStart2();
	String actualtoastmessage2=managepoll.getquestion2toast();
	System.out.println(actualtoastmessage2);
	String expectedtoastmessage2="Success!\n"
			+ "Question #2 has been shared successfully.";
	sa.assertEquals(actualtoastmessage2, expectedtoastmessage2);

String getreadytimer2=driver.findElement(By.xpath("//div[@class='get-ready-timer-value']")).getText();
System.out.println(getreadytimer2);

driver.findElement(By.xpath("//textarea[@placeholder='Type short answer here.']")).sendKeys("123");
driver.findElement(By.xpath("//button[@id='sub-btn']")).click();

String actualwelldone2=driver.findElement(By.xpath("//div[@class='pop-up-card card']")).getText();
System.out.println(actualwelldone2);
String expectedwelldone2="Not quite the answer we were looking for.\n"
		+ "Correct answer and Class results will appear in a few moments.";
sa.assertEquals(actualwelldone2, expectedwelldone2);

 
 Thread.sleep(10000);
    
Boolean yesdone2= managepoll.checkquestiondone();
sa.assertEquals(yesdone, true);
sa.assertAll();

//SHARE 3 QUESTION

managepoll.clickStart3();
String actualtoastmessage3=managepoll.getquestion3toast();
System.out.println(actualtoastmessage3);
String expectedtoastmessage3="Success!\n"
		+ "Question #3 has been shared successfully.";
sa.assertEquals(actualtoastmessage3, expectedtoastmessage3);

String getreadytimer3=driver.findElement(By.xpath("//div[@class='get-ready-timer-value']")).getText();
System.out.println(getreadytimer3);

driver.findElement(By.xpath("//input[@id='TF0']")).click();
driver.findElement(By.xpath("//button[@id='sub-btn']")).click();

String actualwelldone3=driver.findElement(By.xpath("//div[@class='pop-up-card card']")).getText();
System.out.println(actualwelldone3);
String expectedwelldone3="Well Done! Correct.\n"
		+ "Class results in a few moments.";
sa.assertEquals(actualwelldone3, expectedwelldone3);


Thread.sleep(10000);

Boolean yesdone3= managepoll.checkquestiondone();
sa.assertEquals(yesdone, true);
sa.assertAll();

	}
	@Test
	public void searchpolltestcase() throws InterruptedException, IOException {
		
	     
	     ManagePoll managepoll=new ManagePoll(driver);
	     managepoll.clickmanagepoll();
	     Alert alt=driver.switchTo().alert();
	     alt.accept();
	     managepoll.entersearchpoll();
	     Thread.sleep(2000);
	     managepoll.clickpollsearch();
	 
	     Thread.sleep(2000);
}
}
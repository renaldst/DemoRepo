package StepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import POM.JIRAPagePOM;
import POM.LoginPagePOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class creatingFormattingTicket {
	
	WebDriver driver;
	LoginPagePOM LoginPom;
	JIRAPagePOM JIRAPom;
	
	@Given("^user opens browser$")
	public void user_opens_browser(){
		System.setProperty("webdriver.gecko.driver",
				"D:\\Selenium Testing (Java)\\For Firefox 53.0.3 (With Firebug and FirePath)\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://agile-jira.pearson.com/login.jsp");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		LoginPom = new LoginPagePOM(driver);
		JIRAPom = new JIRAPagePOM(driver);
	    
	}

	@When("^user is on JIRA homepage$")
	public void user_is_on_JIRA_homepage() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Log in - Pearson Agile - JIRA", title);

	}

	@Then("^enters username and password$")
	public void enters_username_and_password()throws InterruptedException{
		LoginPom.sendkeysLoginFormUsername("renatrak");
		Thread.sleep(2000);
		LoginPom.sendkeysLoginFormPassword("Secure5RT");
		Thread.sleep(2000);
	    
	}

	@Then("^user clicks on Submit button$")
	public void user_clicks_on_Submit_button(){
		LoginPom.clickLoginFormSubmit();
	    
	}

	@Then("^clicks on Create button to create JIRA ticket$")
	public void clicks_on_Create_button_to_create_JIRA_ticket(){
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		JIRAPom.clickCreateButton();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	   
	}

	@Then("^user enters information for JIRA ticket$")
	public void user_enters_information_for_JIRA_ticket() throws InterruptedException, AWTException {
		JIRAPom.sendkeysSummary("Formatting");
		Thread.sleep(2000);
		JIRAPom.sendkeysEnvironment("Windows 7//Chrome \nWindows 10//Edge \niPad//Safari\n"
				+ "Mac//Safari \nWindows 8.1//FireFox \nSamsung Tab//Chrome");
		Thread.sleep(2000);
		JIRAPom.sendkeysDescription("The formatting is incorrect. \nUsername: BigEnglish4_01\nPassword: Password1"
				+ " \n\nLocations: \n- *Level 4, Unit 1, Lesson 7, Homework* - The highlighted"
				+ " words should be in italics \n\nRenalds");
		Thread.sleep(2000);
		JIRAPom.sendkeysLabel("HQA-BigEnglish4");
		Thread.sleep(2000);
		JIRAPom.clickAcceptLabel();
		Thread.sleep(2000);
		JIRAPom.sendkeysLabel("Batch1");
		Thread.sleep(2000);
		JIRAPom.clickAcceptLabel();
		Thread.sleep(2000);
		JIRAPom.clickSeverety();
		Thread.sleep(2000);
		JIRAPom.clickLowSeverety();
		Thread.sleep(2000);
		JIRAPom.clickFoundInPhase();
		Thread.sleep(2000);
		JIRAPom.clickTest();
		Thread.sleep(2000);
		JIRAPom.clearAssigneeField();
		Thread.sleep(2000);
		JIRAPom.sendkeysAssignee("Edwards, Sherice");
		Thread.sleep(2000);
		JIRAPom.AssignToSherice();
		Thread.sleep(2000);
		JIRAPom.clickPriorityField();
		Thread.sleep(2000);
		JIRAPom.clearPriorityField();
		Thread.sleep(2000);
		JIRAPom.sendkeysPriority("Trivial");
		Thread.sleep(2000);
		JIRAPom.clickReleaseNotes();

		driver.findElement(By.xpath("//.[contains(@class,'issue-drop-zone__button')]")).click();

		StringSelection ss = new StringSelection("C:\\Users\\RT\\Desktop\\things.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// Ctrl + v
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
	    
	}

	@Then("^user creates JIRA ticket$")
	public void user_creates_JIRA_ticket(){
	    
	}

}

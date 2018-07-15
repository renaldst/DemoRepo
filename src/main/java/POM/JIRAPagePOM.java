package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JIRAPagePOM {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(@id, 'create_link')]")
	WebElement CreateButtonClick;
	
	@FindBy(xpath="//.[contains(@id, 'summary')]")
	WebElement Summary;
	
	@FindBy(xpath=".//*[@id='environment']")
	WebElement Environment;
	
	@FindBy(xpath=".//*[@id='description']")
	WebElement Description;
	
	@FindBy(xpath=".//*[@id='labels-textarea']")
	WebElement Label;
	
	@FindBy(xpath=".//*[@class='aui-list-item-link']")
	WebElement AcceptLabel;
	
	@FindBy(id="customfield_10080")
	WebElement ClickSeverity;
	
	@FindBy(xpath=".//*[@value='10086']")
	WebElement ClickLowSeverity;
	
	@FindBy(xpath=".//*[@id='customfield_15032']")
	WebElement ClickFoundPhase;
	
	@FindBy(xpath=".//*[@value='20270']")
	WebElement ClickTestPhase;
	
	@FindBy(xpath="//*[@id='assignee-field']")
	WebElement AssigneeField;
	
	@FindBy(xpath="//li[contains(@id, 'edwards')]")
	WebElement AssignToShericeE;
	
	@FindBy(xpath="//.[contains(@id, 'priority-field')]")
	WebElement ClickPriorityButton;
	
	@FindBy(xpath=".//*[@id='customfield_16030']")
	WebElement ClickReleaseNotes;
	
	public JIRAPagePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickCreateButton() {
		CreateButtonClick.click();
	}
	
	public void sendkeysSummary(String environment) {
		Summary.sendKeys(environment);
	}
	
	public void sendkeysEnvironment(String summary) {
		Environment.sendKeys(summary);
	}
	
	public void sendkeysDescription(String description) {
		Description.sendKeys(description);
	}
	
	public void sendkeysLabel(String label) {
		Label.sendKeys(label);
	}
	
	public void clickAcceptLabel() {
		AcceptLabel.click();
	}
	
	public void clickSeverety() {
		ClickSeverity.click();
	}
	
	public void clickLowSeverety() {
		ClickLowSeverity.click();
	}
	
	public void clickFoundInPhase() {
		ClickFoundPhase.click();
	}
	
	public void clickTest() {
		ClickTestPhase.click();
	}
	
	public void clearAssigneeField() {
		AssigneeField.clear();
	}
	
	public void sendkeysAssignee(String assignee) {
		AssigneeField.sendKeys(assignee);
	}
	
	public void AssignToSherice() {
		AssignToShericeE.click();
	}
	
	public void clickPriorityField() {
		ClickPriorityButton.click();
	}
	
	public void clearPriorityField() {
		ClickPriorityButton.clear();
	}
	
	public void sendkeysPriority(String priority) {
		ClickPriorityButton.sendKeys(priority);
	}
	
	public void clickReleaseNotes() {
		ClickReleaseNotes.click();
	}
}

package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class POMPractice {

	@FindBy(id = "name")
	WebElement element;
	
	@FindAll({@FindBy(name = "user_password"), @FindBy(xpath = "//input[@type='text']")})
	WebElement ele;
	
	public POMPractice(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		SeleniumUtility sUtil = new SeleniumUtility();
		
		WebDriver driver = new ChromeDriver();
		sUtil.navigateToApplication(driver, "http://localhost:8888/");
		sUtil.maximizeWindow(driver);
		sUtil.implicitWait(driver, 15);
		Thread.sleep(2000);
		POMPractice p = new POMPractice(driver);
		p.ele.sendKeys("robin");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.ele.sendKeys("robin");		//StaleElementReferenceException
		

	}

}

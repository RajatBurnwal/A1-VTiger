package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class FetchingDataFromPropertiesFile {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
//		FileInputStream fis = new FileInputStream("C:\\Users\\rajat burnwal\\Desktop\\CommonTestData.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		String value = prop.getProperty("url");
//		String UN = prop.getProperty("username");
//		String PWD=prop.getProperty("password");
		PropertiesUtility pUtil = new PropertiesUtility();
		String value = pUtil.getDataFromPropertiesFile("url");
		driver.get(value);
		String UN = pUtil.getDataFromPropertiesFile("username");
		String PWD = pUtil.getDataFromPropertiesFile("password");
//		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys(UN, Keys.TAB, PWD);

	}

}

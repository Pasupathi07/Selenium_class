package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Capgemini");
		driver.findElementById("createLeadForm_firstName").sendKeys("Pasupathi");
		driver.findElementById("createLeadForm_lastName").sendKeys("Navukkarasu");
		WebElement market = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd = new Select(market);
		//dd.selectByVisibleText("Road and Track");
		List<WebElement> allOptions = dd.getOptions();
		int size = allOptions.size();
		dd.selectByIndex(size -1);
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dd2 = new Select(industry);
		dd2.getOptions().get(3).click();
		driver.findElementByClassName("smallSubmit").click();
	}

}

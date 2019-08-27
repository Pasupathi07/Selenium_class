package week5.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends projectSpecificMethods {
	@DataProvider(name="fetchData")
	public Object[][] setupData(){
		Object[][] data = new Object[2][3];
		data[0][0]= "testleaf";
		data[0][1]= "Pasupathi";
		data[0][2]= "N";
		
		data[1][0]= "testleaf";
		data[1][1]= "Karthi";
		data[1][2]= "R";
		
		return data;
		
	}

@Test(dataProvider = "fetchData")
	public void createLead(String cName,String fName,String lName) {
		/*System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		*/
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		/*WebElement market = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd = new Select(market);
		//dd.selectByVisibleText("Road and Track");
		List<WebElement> allOptions = dd.getOptions();
		int size = allOptions.size();
		dd.selectByIndex(size -1);
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dd2 = new Select(industry);
		dd2.getOptions().get(3).click();*/
		driver.findElementByClassName("smallSubmit").click();
		driver.close();
	}

}

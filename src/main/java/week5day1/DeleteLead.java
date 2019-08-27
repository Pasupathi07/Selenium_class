package week5day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead extends projectSpecificMethods {
@Test
	public void deleteLead() throws InterruptedException{
		/*System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();*/
		login();
		driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
		driver.findElementByXPath("//a[@href = '/crmsfa/control/findLeads']").click();
		driver.findElementByXPath("(//span[@class ='x-tab-strip-text '])[3]").click();
		driver.findElementByXPath("(//input[@name ='emailAddress'])[1]").sendKeys("gmail.com");
		driver.findElementByXPath("//button[text() ='Find Leads']").click();
		Thread.sleep(5000);
		WebElement table = driver.findElementByXPath("(//table[@class ='x-grid3-row-table'])[1]");
		WebElement row = table.findElements(By.tagName("tr")).get(0);
		String leadId = row.findElements(By.tagName("td")).get(0).getText();
		System.out.println(leadId);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		driver.findElementByClassName("subMenuButtonDangerous").click();
		driver.findElementByXPath("//a[text() = 'Find Leads']").click();
		driver.findElementByXPath("//input[@name = 'id']").sendKeys(leadId);
		driver.findElementByXPath("(//td[@class = 'x-btn-center'])[7]").click();
		String text = driver.findElementByXPath("//div[text()='No records to display']").getText();
		System.out.println(text);
		if(text.equals("No records to display")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		driver.close();

	}

}

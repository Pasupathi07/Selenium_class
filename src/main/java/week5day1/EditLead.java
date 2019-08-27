package week5day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead extends projectSpecificMethods {
@Test
	public  void editLead() throws InterruptedException {
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
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("View Lead"))
		{
			System.out.println("I confirm");
		}
		driver.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Accenture");
		driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();
		System.out.println(driver.findElementByXPath("(//span[@class='tabletext'])[3]").getText());
		if(driver.findElementByXPath("(//span[@class='tabletext'])[3]").getText().contains("Accenture")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		driver.close();
		
/*		WebElement table = driver.findElementByXPath("//tr[@class='x-grid3-hd-row']/ancestor::table");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		WebElement firstRow = table.findElements(By.tagName("tr")).get(0);
		firstRow.findElements(By.tagName("td")).get(0).click();*/

	}
	

}

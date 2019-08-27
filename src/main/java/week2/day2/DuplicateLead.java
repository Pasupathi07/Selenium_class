package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
		driver.findElementByXPath("//a[@href = '/crmsfa/control/findLeads']").click();
		driver.findElementByXPath("(//span[@class ='x-tab-strip-text '])[3]").click();
		driver.findElementByXPath("(//input[@name ='emailAddress'])[1]").sendKeys("gmail.com");
		driver.findElementByXPath("//button[text() ='Find Leads']").click();
		Thread.sleep(5000);
		WebElement table = driver.findElementByXPath("(//table[@class ='x-grid3-row-table'])[1]");
		WebElement row = table.findElements(By.tagName("tr")).get(0);
		String leadName = row.findElements(By.tagName("td")).get(2).getText();
		System.out.println(leadName);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		driver.findElementByClassName("subMenuButton").click();
		String title = driver.findElementById("sectionHeaderTitle_leads").getText();
		System.out.println(title);
		if(title.equals("Duplicate Lead")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
				}
		driver.findElementByClassName("smallSubmit").click();
		String name = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(name);
		if(name.equals(leadName)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
				}
		
	}

}


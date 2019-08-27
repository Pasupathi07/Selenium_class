package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
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
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles.size());
		List<String> handList = new ArrayList<String>(handles);
		for(String winHand:handList) {
			System.out.println(winHand);
		}
		System.out.println(driver.getTitle());
		driver.switchTo().window(handList.get(1));
		System.out.println(driver.getTitle());
		driver.findElementByName("firstName").sendKeys("N");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		String fromLead = driver.findElementByXPath("(//a[@class='linktext'])[1]").getText();
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		driver.switchTo().window(handList.get(0));
		//To Lead 
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Set<String> handles2 = driver.getWindowHandles();
		List<String> handList2 = new ArrayList<String>(handles2);
		driver.switchTo().window(handList2.get(1));
		driver.findElementByName("firstName").sendKeys("Karthik");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		driver.switchTo().window(handList.get(0));
		driver.findElementByClassName("buttonDangerous").click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElementByXPath("//a[text() = 'Find Leads']").click();
		driver.findElementByXPath("//input[@name = 'id']").sendKeys(fromLead);
		driver.findElementByXPath("(//td[@class = 'x-btn-center'])[7]").click();
		String text = driver.findElementByXPath("//div[text()='No records to display']").getText();
		System.out.println(text);
		if(text.equals("No records to display")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
}
}
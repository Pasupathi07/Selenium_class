package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class createLeadSteps {
public ChromeDriver driver;
	@Given("Open the chrome Browser")
	public void open_the_chrome_Browser() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("Maximize the browser")
	public void maximize_the_browser() {
		driver.manage().window().maximize();	
	}

	@Given("Set the Timeouts")
	public void set_the_Timeouts() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Given("Load URL")
	public void load_URL() throws InterruptedException {
		driver.get("http://leaftaps.com/opentaps");
		Thread.sleep(5000);
	}

	@Given("Enter the Username as (.*)")
	public void enter_the_Username_as_DemoSalesManager(String data) {
		driver.findElementById("username").sendKeys(data);
	}

	@Given("Enter the Password as (.*)")
	public void enter_the_Password_as_crmsfa(String data) {
		driver.findElementById("password").sendKeys(data);
	}

	@Given("Click on Login Button")
	public void click_on_Login_Button() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Given("Click on CRM\\/SFA")
	public void click_on_CRM_SFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@Given("Click on Create Lead")
	public void click_on_Create_Lead() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@Given("Enter the company name as (.*)")
	public void enter_the_company_name_as_Accenture(String data) {
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
	}

	@Given("Enter the Firstname as (.*)")
	public void enter_the_Firstname_as_Pasupathi(String data) {
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
	}

	@Given("Enter Lastname as (.*)")
	public void enter_Lastname_as_N(String data) {
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
		
	}

	@When("User click  on Create Lead Button")
	public void user_click_on_Create_Lead_Button() {
		driver.findElementByClassName("smallSubmit").click();
	}

	@Then("Verify whether the new lead has been created")
	public void verify_whether_the_new_lead_has_been_created() {
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("View Lead")) {
			System.out.println("Pass");
		}
		
	}
	
}

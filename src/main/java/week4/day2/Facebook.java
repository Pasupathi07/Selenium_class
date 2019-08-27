package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//FB URL
		driver.get("https://www.facebook.com/");
		//Login
		driver.findElementById("email").clear();
		driver.findElementById("email").sendKeys("pasupathi.navukkarasu");
		driver.findElementById("pass").clear();
		driver.findElementById("pass").sendKeys("valarmathi");
		driver.findElementByXPath("//input[@value ='Log In']").click();
		Thread.sleep(5000);
		//Search
		driver.findElementByXPath("//input[@role ='combobox']").sendKeys("TestLeaf",Keys.ENTER);
		Thread.sleep(40000);
		driver.findElementByXPath("(//li[@role='presentation'])[7]").click();
		//verify testleaf is displayed
		if((driver.findElementByLinkText("TestLeaf").getText()).equals("TestLeaf")) {
			System.out.println("Matched");
		}else {
			System.out.println("Not Matched");
		}
		driver.findElementByLinkText("TestLeaf").click();
		//Getting text of a like button
		Thread.sleep(40000);
		String button = driver.findElementByXPath("//button[text()='Like']").getText();
		System.out.println(button);
		if(button.equals("Like")) {
			driver.findElementByXPath("//button[text()='Like']").click();
		}
		//Verification of tiltle
		if(driver.getTitle().contains("TestLeaf")) {
			System.out.println("Matched");
		}else {
			System.out.println("Not Matched");
		}
		//Like Count
		String likeCount = driver.findElementByXPath("//div[@class ='clearfix _ikh']//div[contains(text(),'people like')]").getText().replaceAll("\\D", "");
		System.out.println(Integer.parseInt(likeCount));
		
		
}
}
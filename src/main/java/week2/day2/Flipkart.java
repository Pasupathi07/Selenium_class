package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement furniture = driver.findElementByXPath("//span[text()='Home & Furniture']");
		Actions builder = new Actions(driver);
		builder.moveToElement(furniture).perform();
		builder.moveToElement(driver.findElementByXPath("//a[@title='Paintings']")).click().perform();
		//builder.moveToElement(furniture).pause(2000).click(driver.findElementByXPath("//a[@title='Paintings']")).perform();
//		builder.moveToElement(driver.findElementByXPath("//a[@title='Paintings']")).perform();
	}

}

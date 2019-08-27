package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElementByLinkText("REGISTER").click();
		driver.findElementById("userName").sendKeys("Sakthipck");
		driver.findElementById("usrPwd").sendKeys("Sakthipck123");
		driver.findElementById("cnfUsrPwd").sendKeys("Sakthipck123");
		/*WebElement security = driver.findElement(By.xpath("(//div[@class = 'ui-dropdown-trigger ui-state-default ui-corner-right'])[1]"));
		Select dd1 = new Select(security);
		dd1.getOptions().get(4).click();
		driver.findElementByClassName("form-control ng-pristine ng-invalid ng-touched").sendKeys("INDIA");
		WebElement language = driver.findElementByXPath("//label[text() ='Select Preferred Language']");
		Select dd2 = new Select(language) ;
		dd2.getOptions().get(0).click();*/
		driver.findElementById("firstName").sendKeys("Sakthi");
		driver.findElementById("M").click();
		driver.findElementByXPath("(//input[@autocomplete ='off'])[1]").sendKeys("02-01-1995");
		driver.findElementByXPath("(//input[@value='U'])[1]").click();
		WebElement nation = driver.findElementByXPath("//select[@formcontrolname='resCountry']");
		Select dd4 = new Select(nation);
		dd4.getOptions().get(1).click();
			

	}

}

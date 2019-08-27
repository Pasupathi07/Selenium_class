package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("TPJ",Keys.TAB);
		driver.findElementById("buttonFromTo").click();
		Thread.sleep(5000);
		WebElement table = driver.findElementByXPath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']");
		List<WebElement> rows1 = table.findElements(By.tagName("tr"));
		WebElement table2 = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> rows2 = table2.findElements(By.tagName("tr"));
		System.out.println(rows1.size()+rows2.size());
		System.out.println(table.findElements(By.tagName("td")).size());
		WebElement lastrow = table2.findElements(By.tagName("tr")).get(rows2.size()-1);
		String trainNum = lastrow.findElements(By.tagName("td")).get(0).getText();
		System.out.println(trainNum);
		
		
		

	}

}

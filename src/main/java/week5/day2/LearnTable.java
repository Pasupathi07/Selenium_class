package week5.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("url");
		// Printing TableHeader
		// locate the table
		WebElement headertable = driver.findElementByXPath("table Xpath");
		// row of table
		List<WebElement> row = headertable.findElements(By.tagName("tr"));
		//Column of Table
		List<WebElement> column = row.get(0).findElements(By.tagName("td"));
		for(WebElement header: column) {
			System.out.println(header);
		}
		// Printing All the Data in Table
		// locate the table
		WebElement tableData = driver.findElementByXPath("table Xpath");
		// row of table
		List<WebElement> rows = tableData.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		//Column of Table
		for(int i=0;i<=rows.size();i++) {
		List<WebElement> columnData = rows.get(i).findElements(By.tagName("td"));
		for(WebElement cell: columnData) {
			System.out.println(cell);
		}
		}		
		

	}

}

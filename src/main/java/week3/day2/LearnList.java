package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS",Keys.ENTER);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("TPJ",Keys.ENTER);
		driver.findElementById("buttonFromTo").click();
		Thread.sleep(5000);
		driver.findElementById("chkSelectDateOnly").click();
		WebElement table1 = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> row1 = table1.findElements(By.tagName("tr"));
		System.out.println(row1.size()); 
		List<String> trainList = new ArrayList<String>();
		for(int i=0;i<=row1.size()-1;i++) {
			WebElement row = table1.findElements(By.tagName("tr")).get(i);
			String trainName = row.findElements(By.tagName("td")).get(1).getText();
			System.out.println(trainName);
			trainList.add(trainName);
		}
		for(String allTrain:trainList) {
			System.out.println(allTrain);
		}
		System.out.println(trainList.size());
		Collections.sort(trainList);	
		driver.findElementByXPath("//a[@title = 'Click here to sort on Train Name']").click();
		WebElement table2 = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> row2 = table2.findElements(By.tagName("tr"));
		List<String> trainList1 = new ArrayList<String>();
		for(int j=0;j<=row2.size()-1;j++) {
			WebElement row = table2.findElements(By.tagName("tr")).get(j);
			String trainName = row.findElements(By.tagName("td")).get(1).getText();
			System.out.println(trainName);
			trainList1.add(trainName);
		}
		if(trainList.equals(trainList1)) {
			System.out.println("Pass");
		}
	}

}

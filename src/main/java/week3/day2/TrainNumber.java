package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrainNumber {
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
		HashSet<String> trainList = new HashSet<String>();
		for(int i=0;i<=row1.size()-1;i++) {
			WebElement row = table1.findElements(By.tagName("tr")).get(i);
			String trainNumber = row.findElements(By.tagName("td")).get(0).getText();
			System.out.println(trainNumber);
			trainList.add(trainNumber);
		}
		System.out.println(trainList.size());
		for(String allTrain:trainList) {
			System.out.println(allTrain);
		}
		if(row1.size()==trainList.size()){
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}

	}

}

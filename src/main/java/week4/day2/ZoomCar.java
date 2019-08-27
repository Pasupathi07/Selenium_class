package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//ZoomCar URL
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Searching for a car
		driver.findElementByClassName("search").click();
		//Click on popular Destination
		driver.findElementByXPath("(//div[@class='items'])[1]").click();
		driver.findElementByClassName("proceed").click();
		//Select the Date
		driver.findElementByXPath("//div[@class = 'day picked low-price']/following-sibling::div").click();
		String pickupDate1 = driver.findElementByXPath("(//div[@class = 'label time-label'])[1]").getText();
		driver.findElementByClassName("proceed").click();
		//Confirm the date selected is as tommorrow and click okie
		String pickupDate2 = driver.findElementByXPath("(//div[@class = 'label time-label'])[1]").getText();
		if(pickupDate1.equals(pickupDate2)) {
			System.out.println("Date is Matched");
		}else {
			System.out.println("Date isn't Matched");
		}
		driver.findElementByClassName("proceed").click();
		Thread.sleep(5000);
		//Number of results
		List<WebElement> carList = driver.findElementsByXPath("//div[@class='details']/h3");
		System.out.println(carList.size());
		//Prices of car
		List<Integer> priceList = new ArrayList<Integer>();
		List<WebElement> price = driver.findElementsByXPath("(//div[@class = 'price'])");
		for (WebElement pr : price) {
			String replaceAll = pr.getText().replaceAll("\\D", "");
			priceList.add(Integer.parseInt(replaceAll));
		}
		/*for(int i=0;i<price.size();i++) {
		String replaceAll = price.get(i).getText().replaceAll("\\D", "");
		priceList.add(replaceAll);
		}*/
		System.out.println(priceList);
		Integer max = Collections.max(priceList);
		System.out.println(max);
		//List of Cars
		List<String> carNameList = new ArrayList<String>();
		for (WebElement cl : carList) {
			String name = cl.getText();
			carNameList.add(name);
		}
		System.out.println(carNameList.get(priceList.indexOf(max)));
		driver.close();
	}

}

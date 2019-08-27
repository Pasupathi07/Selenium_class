package co.leaftaps.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	public HomePage(){
	}
	public MyHome clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHome();
	}
}
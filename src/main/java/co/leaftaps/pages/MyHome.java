package co.leaftaps.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class MyHome extends ProjectSpecificMethods {
	
	public MyHome(){
	}
	public MyLeads clickLeads() {
		driver.findElementByLinkText("Leads").click();
		return new MyLeads();
	}
}

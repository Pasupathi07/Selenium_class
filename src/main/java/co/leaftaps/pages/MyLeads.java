package co.leaftaps.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class MyLeads extends ProjectSpecificMethods {
	
	public MyLeads(){
	}
	public CreateLead clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLead();
	}
}

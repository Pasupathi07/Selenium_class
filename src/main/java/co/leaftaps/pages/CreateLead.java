package co.leaftaps.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods {
	
	public CreateLead(){
	}
	public CreateLead enterCompanyName() {
		driver.findElementById("createLeadForm_companyName").sendKeys("Capgemini");
		return new CreateLead();
	}
	public CreateLead enterFirstName() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Pasupathi");
		return new CreateLead();
	}
	public CreateLead enterLastName() {
		driver.findElementById("createLeadForm_lastName").sendKeys("Navukkarasu");
		return new CreateLead();
	}
	public ViewLead clickSubmit() {
		driver.findElementByClassName("smallSubmit").click();
		return new ViewLead();
	}
}

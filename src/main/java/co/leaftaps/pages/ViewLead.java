package co.leaftaps.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class ViewLead extends ProjectSpecificMethods {
	
	public ViewLead(){
	}
	public ViewLead verifyFirstName() {
		String name = driver.findElementByClassName("tabletext").getText();
		if(name == "Pasupathi") {
			System.out.println(name);
		}
		return new ViewLead();
	}
}

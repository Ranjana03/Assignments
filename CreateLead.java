package paramaterClassroom;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends Setup1 {
	
	@DataProvider (name = "CreateLead1") //annotation
	public String[][] getData() {
		String[][] data = new String[3][3];
		data[0][0] = "TestLeaf1";
		data[0][1] = "Data1";
		data[0][2] = "Db1";
		
		data[1][0] = "TestLeaf2";
		data[1][1] = "Data2";
		data[1][2] = "Db2";
		
		data[2][0] = "TestLeaf3";
		data[2][1] = "Data3";
		data[2][2] = "Db3";
		
		return data;
			
		
	}
	
	@Test (dataProvider = "CreateLead1") //passing the dataprovider name annotation as arugument
	public void CreateLead1(String cpnyName, String fName, String lName) {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cpnyName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
		driver.close();
}
}








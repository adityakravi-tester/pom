package com.testleaf.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;

public class CreateLeadTest extends ProjectSpecificMethods{
  
  @BeforeTest
  public void setTestDataFile() {
    excelDataFile = "CreateLead";
  }
  
  @Test(dataProvider = "setData")
  public void testCreateLead(String company, String firstName, String lastName, String phoneNumber, String emailID) {
    new LoginPage(driver, property)
    .enterUserName(property.getProperty("username"))
    .enterPassword(property.getProperty("password"))
    .clickLoginButton()
    .clickCrmsfaLink()
    .clickLeadsTab()
    .clickCreateLeadLink()
    .enterCompanyName(company)
    .enterFirstName(firstName)
    .enterLastName(lastName)
    .enterPhoneNumber(phoneNumber)
    .enterEmailAddress(emailID)
    .clickCreateButton()
    .verifyFirstName();
  }
}

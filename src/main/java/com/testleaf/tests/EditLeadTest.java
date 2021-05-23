package com.testleaf.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;

public class EditLeadTest extends ProjectSpecificMethods{
  @BeforeTest
  public void setTestDataFile() {
    excelDataFile = "EditLead";
  }

  @Test(dataProvider = "setData")
  public void testCreateLead(String firstName, String companyName) throws InterruptedException {
    new LoginPage(driver, property)
    .enterUserName(property.getProperty("username"))
    .enterPassword(property.getProperty("password"))
    .clickLoginButton()
    .clickCrmsfaLink()
    .clickLeadsTab()
    .clickFindLeadsLink()
    .enterFirstName(firstName)
    .clickFindLeadsButton()
    .clickFoundLeadId()
    .clickEditButton()
    .updateCompanyName(companyName)
    .clickUpdateButton()
    .verifyCompanyUpdated(companyName);
  }
}

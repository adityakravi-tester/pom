package com.testleaf.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;

public class DeleteLeadTest extends ProjectSpecificMethods{
  @BeforeTest
  public void setTestDataFile() {
    excelDataFile = "DeleteLead";
  }
  
  @Test(dataProvider = "setData")
  public void testCreateLead(String phoneNumber) throws InterruptedException {
    new LoginPage(driver, property)
    .enterUserName(property.getProperty("username"))
    .enterPassword(property.getProperty("password"))
    .clickLoginButton()
    .clickCrmsfaLink()
    .clickLeadsTab()
    .clickFindLeadsLink()
    .clickPhoneTab()
    .enterPhoneNumber(phoneNumber)
    .clickFindLeadsButton()
    .captureLeadId()
    .clickFoundLeadId()
    .clickDeleteButton()
    .clickFindLeadsLink()
    .searchLead()
    .clickFindLeadsButton()
    .verifyLeadDeleted();
  }
}

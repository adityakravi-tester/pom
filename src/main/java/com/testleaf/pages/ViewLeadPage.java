package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import com.testleaf.base.ProjectSpecificMethods;
import org.testng.Assert;

public class ViewLeadPage extends ProjectSpecificMethods{
  
  public ViewLeadPage(ChromeDriver driver) {
    this.driver = driver;
  }
  
  public ViewLeadPage verifyFirstName() {
    String leadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
    Assert.assertEquals("Aditya", leadName,"Lead not created");
    return this;
  }

}

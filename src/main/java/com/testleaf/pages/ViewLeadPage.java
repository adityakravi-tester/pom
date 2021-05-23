package com.testleaf.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import com.testleaf.base.ProjectSpecificMethods;
import org.testng.Assert;

public class ViewLeadPage extends ProjectSpecificMethods{
  
  public ViewLeadPage(ChromeDriver driver, Properties property) {
    this.driver = driver;
    this.property = property;
  }
  
  public ViewLeadPage verifyFirstName() {
    String leadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
    Assert.assertEquals("Aditya", leadName,"Lead not created");
    return this;
  }
  
  public MyLeadsPage clickDeleteButton() {
    driver.findElement(By.linkText("Delete")).click();
    return new MyLeadsPage(driver, property);
  }

}

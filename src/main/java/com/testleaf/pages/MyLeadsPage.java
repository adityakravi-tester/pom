package com.testleaf.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{

  public MyLeadsPage(ChromeDriver driver, Properties property) {
    this.driver = driver;
    this.property = property;
  }
  
  public CreateLeadPage clickCreateLeadLink() {
    driver.findElement(By.linkText(property.getProperty("myleadspage.createlead.linktext"))).click();
    return new CreateLeadPage(driver, property);
  }
  
  public FindLeads clickFindLeadsLink() {
    driver.findElement(By.linkText("Find Leads")).click();
    return new FindLeads(driver, property);
  }
  
}

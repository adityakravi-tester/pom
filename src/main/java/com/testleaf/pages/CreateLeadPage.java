package com.testleaf.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import com.testleaf.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{

  public CreateLeadPage(ChromeDriver driver, Properties property) {
    this.driver = driver;
    this.property = property;
  }
  
  public CreateLeadPage enterCompanyName(String companyName) {
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
    return this;
  }
  
  public CreateLeadPage enterFirstName(String firstName) {
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
    return this;
  }
  
  public CreateLeadPage enterLastName(String lastName) {
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
    return this;
  }
  
  public CreateLeadPage enterPhoneNumber(String phoneNumber) {
    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNumber);
    return this;
  }
  
  public CreateLeadPage enterEmailAddress(String emailId) {
    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(emailId); 
    return this;
  }
  
  public ViewLeadPage clickCreateButton() {
    driver.findElement(By.name("submitButton")).click();
    return new ViewLeadPage(driver, property);
  }

}

package com.testleaf.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.testleaf.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods{
  
  public EditLeadPage(ChromeDriver driver, Properties property) {
    this.driver = driver;
    this.property = property;
  }
  
  public EditLeadPage updateCompanyName(String companyName) {
    WebElement companyNameField = driver.findElement(By.id("updateLeadForm_companyName"));
    companyNameField.clear();
    companyNameField.sendKeys(companyName);
    return this;
  }
  
  public ViewLeadPage clickUpdateButton() {
    driver.findElement(By.name("submitButton")).click();
    return new ViewLeadPage(driver, property);
  }
}

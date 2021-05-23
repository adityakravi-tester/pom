package com.testleaf.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class FindLeads extends ProjectSpecificMethods{
  
  public FindLeads(ChromeDriver driver, Properties property) {
    this.driver = driver;
    this.property = property;
  }

  public FindLeads clickPhoneTab() {
    driver.findElement(By.xpath("//span[text()='Phone']")).click();
    return this;
  }
  
  public FindLeads enterPhoneNumber(String phoneNumber) {
    driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
    return this;
  }
  
  public FindLeads clickFindLeadsButton() {
    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    return this;
  }
  
  public FindLeads captureLeadId() {
    return this;
  }
  
  public ViewLeadPage clickFoundLeadId() {
    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
    return new ViewLeadPage(driver, property);
  }
  
}

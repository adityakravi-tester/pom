package com.testleaf.pages;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class FindLeads extends ProjectSpecificMethods{
  
  private String leadId;
  
  private static ThreadLocal<String> localLeadId = new ThreadLocal<String>();
  
  public FindLeads(ChromeDriver driver, Properties property) {
    this.driver = driver;
    this.property = property;
  }
  
  public FindLeads enterFirstName(String firstName) {
    driver.findElementByXPath("(//input[@name='firstName' and @type='text'])[3]").sendKeys(firstName);
    return this;
  }

  public FindLeads clickPhoneTab() {
    driver.findElement(By.xpath("//span[text()='Phone']")).click();
    return this;
  }
  
  public FindLeads clickEmailTab() {
    driver.findElement(By.xpath("//span[text()='Phone']")).click();
    return this;
  }
  
  public FindLeads enterPhoneNumber(String phoneNumber) {
    driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
    return this;
  }
  
  public FindLeads clickFindLeadsButton() throws InterruptedException {
    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    Thread.sleep(3000);
    return this;
  }
  
  public FindLeads captureLeadId() {
    leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
    System.out.println("Lead id in capture lead: "+ leadId);
    localLeadId.set(leadId);
    return this;
  } 
  
  public ViewLeadPage clickFoundLeadId() {
    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
    return new ViewLeadPage(driver, property);
  }
  
  public FindLeads searchLead() {
    driver.findElement(By.xpath("//input[@name='id']")).sendKeys(localLeadId.get());
    return this;
  }
  
  public FindLeads verifyLeadDeleted() {
    String text = driver.findElement(By.className("x-paging-info")).getText();
    if (text.equals("No records to display")) {
      System.out.println("Text matched");
  } else {
      System.out.println("Text not matched/Multiple leads found with same input");
  }
    return this;
  }
  
}

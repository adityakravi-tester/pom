package com.testleaf.pages;

import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

  public HomePage(ChromeDriver driver) {
    this.driver = driver;
  }
  
  public MyHomePage clickCrmsfaLink() {
    driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
    return new MyHomePage(driver);
  }
}

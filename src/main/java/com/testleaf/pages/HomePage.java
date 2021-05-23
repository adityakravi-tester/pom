package com.testleaf.pages;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

  public HomePage(ChromeDriver driver, Properties property) {
    this.driver = driver;
    this.property = property;
  }
  
  public MyHomePage clickCrmsfaLink() {
    driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
    return new MyHomePage(driver,property);
  }
}

package com.testleaf.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import com.testleaf.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{

  public MyHomePage(ChromeDriver driver, Properties property) {
    this.driver = driver;
    this.property = property;
  }
  
  public MyLeadsPage clickLeadsTab() {
    driver.findElement(By.linkText(property.getProperty("myhomepage.lead.linktext"))).click();
    return new MyLeadsPage(driver, property);
  }
}

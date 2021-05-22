package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{

  public MyHomePage(ChromeDriver driver) {
    this.driver = driver;
  }
  
  public MyLeadsPage clickLeadsTab() {
    driver.findElement(By.linkText("Leads")).click();
    return new MyLeadsPage(driver);
  }
}

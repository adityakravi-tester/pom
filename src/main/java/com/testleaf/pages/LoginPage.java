package com.testleaf.pages;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

  public LoginPage(ChromeDriver driver, Properties property) {
    this.driver = driver;
    this.property = property;
  }

  public LoginPage enterUserName(String username) {
    driver.findElementById("username").sendKeys(username);
    return this;
  }

  public LoginPage enterPassword(String password) {
    driver.findElementById("password").sendKeys(password);
    return this;
  }

  public HomePage clickLoginButton() {
    driver.findElementByClassName("decorativeSubmit").click();
    return new HomePage(driver, property);
  }

}

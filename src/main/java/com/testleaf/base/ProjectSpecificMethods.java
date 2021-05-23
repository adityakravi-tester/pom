package com.testleaf.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {

  public ChromeDriver driver;
  public String excelDataFile;
  public Properties property;

  @Parameters({"language"})
  @BeforeMethod
  public void setup(String language) throws IOException {

    FileInputStream fis = new FileInputStream("./src/main/resources/" +language+ ".properties");

    property = new Properties();

    property.load(fis);

    WebDriverManager.chromedriver().setup();

    driver = new ChromeDriver();

    driver.manage().window().maximize();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("http://leaftaps.com/opentaps/control/login");

  }

  @AfterMethod
  public void tearDown() throws IOException {
    driver.close();
    //Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
  }

  @DataProvider(indices = {0})
  public String[][] setData(ITestContext context) throws IOException {
    // String name = this.getClass().getSimpleName();
    //    System.out.println("Test Name is: " + name);
    return new com.testleaf.utils.DataInputProvider().sendData(excelDataFile);
  }
}

package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {//using abstract, it is easy without creating an object
    protected WebDriver driver;
    protected SoftAssert softAssert;
    protected Actions actions;

//    @BeforeClass // singletondan dolayi ihtiyac kalmadi
//         public void setUpClass(){
//     WebDriverManager.chromedriver().setup();
//        //WebDriverManager.firefoxdriver().setup();
//    }

 @BeforeMethod
         public void setUpMethod(){
     //driver = new ChromeDriver();
     //driver=new FirefoxDriver();
     driver = Driver.getDriver();//Singletonla ilgili,  from Driver class, since method static, we called by class name..
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     actions = new Actions(driver);
     softAssert= new SoftAssert();



 }

//@AfterMethod
    public void tearDownMethod() {
    //driver.quit();
        Driver.closeDriver();

        softAssert.assertAll();
}



}

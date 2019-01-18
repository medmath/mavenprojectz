package com.cybertek.tests;

import com.cybertek.pages.HomePage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMessageValidationTest extends TestBase {
    HomePage homepage= new HomePage();


    @Test
    public void wrongEmailTEst(){

        driver.get(ConfigurationReader.getProperty("url"));
    //driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
    //driver.findElement(By.linkText("Sign in")).click();

//    WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
//    WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
//    username.sendKeys("admin");
//    password.sendKeys("test"+ Keys.ENTER);
    //String message=driver.findElement(By.id("ctl00_MainContent_status")).getText();

homepage.username.sendKeys("admin");
homepage.password.sendKeys("test"+Keys.ENTER);
    String message=homepage.errorMessage.getText();
    String expectedErrorMessage="Invalid Login or Password.";
    Assert.assertEquals(message,expectedErrorMessage);

}


@Test
    public void wrongPassword(){
    driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
    //driver.findElement(By.linkText("Sign in")).click();

    WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
    WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
    username.sendKeys("Tester");
    password.sendKeys("task"+Keys.ENTER);
    String message=driver.findElement(By.id("ctl00_MainContent_status")).getText();
    String expectedErrorMessage="Invalid Login or Password.";
    Assert.assertEquals(message,expectedErrorMessage);

}

@Test
public void blankUserName(){
    driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
    //driver.findElement(By.linkText("Sign in")).click();

    WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
    WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
    //username.sendKeys("Tester");
    password.sendKeys("test"+Keys.ENTER);
    String message=driver.findElement(By.id("ctl00_MainContent_status")).getText();
    String expectedErrorMessage="Invalid Login or Password.";
    Assert.assertEquals(message,expectedErrorMessage);

}

    @Test
    public void blankpassword(){
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        //driver.findElement(By.linkText("Sign in")).click();

        WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        username.sendKeys("Tester");
        //password.sendKeys("test"+Keys.ENTER);
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        String message=driver.findElement(By.id("ctl00_MainContent_status")).getText();
        String expectedErrorMessage="Invalid Login or Password.";
        Assert.assertEquals(message,expectedErrorMessage);

    }



    @Test
    public void blankuserName(){
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
homepage.login("","test");
        String message=homepage.errorMessage.getText();
        String expectedErrorMessage="Invalid Login or Password.";
        Assert.assertEquals(message,expectedErrorMessage);

    }


    @Test
    public void blankPassword(){
        homepage.open();
        homepage.login("Tester","");
        String message=homepage.errorMessage.getText();
        String expectedErrorMessage="Invalid Login or Password.";
        Assert.assertEquals(message,expectedErrorMessage);

    }


    @Test
    public void wrongpassword(){
        homepage.open();
        homepage.login("Tester","task");
        String message=homepage.errorMessage.getText();
        String expectedErrorMessage="Invalid Login or Password.";
        Assert.assertEquals(message,expectedErrorMessage);

    }

}

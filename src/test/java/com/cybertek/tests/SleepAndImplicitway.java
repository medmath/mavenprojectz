package com.cybertek.tests;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SleepAndImplicitway {
    WebDriver driver;


    @BeforeMethod
    public void setUp(){
        driver= Driver.getDriver();
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        Driver.closeDriver();
    }

    @Test
    public void testSleep() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.findElement(By.tagName("Button")).click();
        Thread.sleep(10000);
        System.out.println(driver.findElement(By.id("finish")).getText());
    }


    @Test
    public void implicitWait(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// it is successful
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.findElement(By.tagName("Button")).click();
        //Thread.sleep(10000);
        System.out.println(driver.findElement(By.id("finish")).getText());

    }


    @Test
    public void implicitWait2(){
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //driver.findElement(By.id("message"))
        //click on remove button
        driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();
        System.out.println(driver.findElement(By.id("message")).getText());
        //click on add button
    driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button")).click();
    //verify checkbox is displayed
        System.out.println(driver.findElement(By.id("message")).isDisplayed());
        System.out.println(driver.findElement(By.id("message")).getText());
    }



}

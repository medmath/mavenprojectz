package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SWitchOptions {

    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/tinymce");
    }


//        @AfterMethod
//    public void cleanUp(){
//driver.quit();
//    }


        @Test
        public void switchByElement(){
            WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
            //driver.switchTo().frame(iframe);
            driver.switchTo().frame(iframe);
            //<p>Your content goes here.</p>
            driver.findElement(By.tagName("body")).sendKeys("  dde dde dde  ddd");

////icteki html den usttekine gectim..
//            driver.switchTo().parentFrame();// current framin parentina goturur
//            driver.findElement(By.linkText("Elemental Selenium")).click();

        }

    @Test
    public void switchById() {
//driver.switchTo().frame("mce_0_ifr");
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.tagName("body")).sendKeys(" dde dde dde  ddd");
    }

    @Test
    public void switchByIndex() {
    driver.switchTo().frame(0);
        driver.findElement(By.tagName("body")).sendKeys(" dde dde dde  ddd");

    }


    }


package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//1. Open browser
//2. Go to Mercury Tours application
//3. Verify that Round Trip is selected by default
//4. Verify that One Way is not selected by default
//5. Click one way
//6. Verify that Round Trip selected not selected
//7. Verify that One Way is selected
public class MercuryToursradiobutton {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://newtours.demoaut.com/");
        //<input type="text" name="userName" size="10">
        WebElement userName = driver.findElement(By.name("userName"));
        userName.sendKeys("name");
        //<input type="password" name="password" size="10">
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123456");

        password.submit();
        //<input type="radio" name="tripType" value="roundtrip" checked="">
        //<input type="radio" name="tripType" value="oneway">
        WebElement roundTrip = ((ChromeDriver) driver).findElementByXPath("//input[@value='roundtrip']");
        if (roundTrip.isSelected()) {
            System.out.println("ROUNDTRIP is selected as default");
            //button[@type='submit']
            //input[@value='roundtrip']
            WebElement oneWay = ((ChromeDriver) driver).findElementByXPath("//input[@value='oneway']");
            System.out.println("After clicking one way ");
            oneWay.click();
            if (oneWay.isSelected()) {
                System.out.println("ONEWAY is selected ");
            }
            if (!roundTrip.isSelected()) {
                System.out.println("ROUNDTRIP is not selected ");

            }
        }
    }
}

package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Checkboxes {
    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver","/Users/vedat/Documents/selenium dependencies/drivers/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
    //driver.get("https://the-internet.herokuapp.com");
        driver.get("https://the-internet.herokuapp.com/forgot_password");
        //System.out.println(driver.getClass());

//<input type="text" name="email" id="email">
        WebElement input=driver.findElement(By.id("email"));
        //input.sendKeys("somemeail@somemeail.com"+ Keys.ENTER);// they have the same effect
        input.sendKeys("somemeail@somemeail.com");
        input.submit();

        //String expected = "Your e-mail's been sent!";
        //<div id="content" class="large-12 columns">
        //        Your e-mail's been sent!
        //
        //      </div>
//        String actual=driver.findElement(By.id("content")).getText();
//        System.out.println(actual);
//
//        if(actual.equals(expected)){
//            System.out.println("PASS");
//        }else{
//            System.out.println("FAIL");
        }
    }
//}

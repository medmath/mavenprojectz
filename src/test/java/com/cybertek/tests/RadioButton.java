package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioButton {
    public static void main(String[] args) {
        //verify blue and red button not checked
        //check blue
        //verify blue checked, red not checked
        //check red
        //verify red checked, blue not checked

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwRadioButton");
        //<input type="radio" name="color" value="on" id="gwt-debug-cwRadioButton-color-blue-input" tabindex="0">
        WebElement blue=driver.findElement(By.id("gwt-debug-cwRadioButton-color-blue-input"));

        System.out.println("blue: "+blue.isSelected());
        //<input type="radio" name="color" value="on" id="gwt-debug-cwRadioButton-color-red-input" tabindex="0">
       WebElement red=driver.findElement(By.id("gwt-debug-cwRadioButton-color-red-input"));
        System.out.println("red: "+red.isSelected());
        blue.click();
//        System.out.println("clicking on red");
//        System.out.println("blue: "+blue.isSelected());
//        System.out.println("red: "+red.isSelected());
//        blue.click();
//        red.click();
//        System.out.println("clicking on red");
//        System.out.println("blue: "+blue.isSelected());
//        System.out.println("red: "+red.isSelected());
    }
}

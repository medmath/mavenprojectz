package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ReallyCheckBoxes {
    public static void main(String[] args) {
        //go to samples.gwtproject.org/samples
        //http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox
        //select monday
        //verify monday is selected
        //unselect monday
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        //<input type="checkbox" value="on" id="gwt-debug-cwCheckBox-Monday-input" tabindex="0">
        WebElement monday=driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));

        //System.out.println(monday.isSelected());
        monday.click();
        //System.out.println(monday.isSelected());
        monday.click();
        //System.out.println(monday.isSelected());
//        if(!monday.isSelected()){
//            System.out.println("Monday is selected: "+monday.isSelected());
//        };


//if monday is not selected then select monday
  //      if(!monday.isSelected()){
//            monday.click();
//        }
//        System.out.println(monday.isSelected());




    }
}

package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//DAYS
//1. open browser
//2. go to http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox
//3. Randomly select days of the week. As soon as you check any day, print the name of the
//day and uncheck immediately.
//After you check and uncheck Friday for the third time, exit the program
//NOTE: Remember some checkboxes are not selectable. You need to find a way to ignore them
//when they are randomly selected. It has to be dynamic. Do not hard code Saturday and Sunday.
//Use values of certain attributes.
public class Days {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
    //<input type="checkbox" value="on" id="gwt-debug-cwCheckBox-Monday-input" tabindex="0">
        WebElement Monday=driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));
        WebElement Tuesday=driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        WebElement Wednesday=driver.findElement(By.id("gwt-debug-cwCheckBox-Wednesday-input"));
        WebElement Thursday=driver.findElement(By.id("gwt-debug-cwCheckBox-Thursday-input"));
        WebElement Friday=driver.findElement(By.id("gwt-debug-cwCheckBox-Friday-input"));
        //WebElement Saturday=driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));
        //WebElement Sunday=driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-input"));
//<label for="gwt-debug-cwCheckBox-Saturday-input" id="gwt-debug-cwCheckBox-Saturday-label">Saturday</label>
        int count=0;
        Tuesday.click();
        Thursday.click();

        Friday.click();
        Friday.click();
        Friday.click();
        Friday.click();
        Friday.click();
        if(Monday.isSelected()){
            System.out.println("Monday is checked");
            Monday.click();
        }if(Tuesday.isSelected()){
            System.out.println("Tuesday is checked");
            Tuesday.click();
        }if(Wednesday.isSelected()){
            System.out.println("Wednesday is checked");
            Wednesday.click();
        }if(Thursday.isSelected()){
            System.out.println("Thursday is checked");
            Thursday.click();
        }if(Friday.isSelected()){
            System.out.println("Friday is checked");
            Friday.click();
        }
        if(Friday.isSelected())
            count++;

            if(count>=3)
                System.out.println(count);

            return;


    }
}

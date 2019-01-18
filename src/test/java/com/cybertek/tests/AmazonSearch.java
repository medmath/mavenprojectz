package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
    public static void main(String[] args) {

//1. open browser
//2. go to amazon
//3.enter search term and submit
//4.verify search box still contains the same search term
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    driver.get("https://amazon.com");
//<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="" class="nav-input" dir="auto" tabindex="19">
        WebElement input= driver.findElement(By.id("twotabsearchtextbox"));
       input.sendKeys("charger");
        input.submit();
//        WebElement searchButton1=driver.findElement(By.className("nav-input"));
//        searchButton1.click();
//<input type="text" id="twotabsearchtextbox" value="charger" name="field-keywords" autocomplete="off" placeholder="" class="nav-input" dir="auto" tabindex="19">

//        String searchButton="charger";
        String actual=driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");

        System.out.println(actual);
        // driver.findElement(By.id("twotabsearchtextbox")).getAttribute();

//        if(searchButton.equals(actual)){
//        System.out.println("PASS");
//    }else{
//        System.out.println("FAIL");
//    }
    }
}
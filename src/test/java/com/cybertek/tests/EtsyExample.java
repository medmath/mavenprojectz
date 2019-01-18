package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EtsyExample {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://etsy.com");
        WebElement input=driver.findElement(By.id("search-query"));
        System.out.println(input.getText());
        input.sendKeys("decal"+ Keys.ENTER);
        //System.out.println(input.getText());
        //input.submit();
        //<button class="btn btn-primary" type="submit" value="Search" aria-label="Search">
        //                    Search
        //            </button>
        //input.click();
        //WebElement submit=driver.findElement(By.)
    }

}

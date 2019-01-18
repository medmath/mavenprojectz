package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//DEPARTMENTS
//1. open browser
//2. go to https://amazon.com
//3. verify that default dropdown option is all
//4. verify that all options are sorted alphabetically
//5. Click on the menu icon on the left
//6. click on Full Store directory
//7. capture all of the main department names in the page. Examples for main department
//pages shown in the picture.
//8. verify that departments names are sorted alphabetically
//9. verify that all departments names are listed in the dropdown from step 2
//NOTE: To select all department names in step 7 you need to use findElements() method (pay
//attention s at the end of the method name). You can write one xpath which matches all the
//department names and findElements() will return them all as List<WebElement>.
public class Departments {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
}

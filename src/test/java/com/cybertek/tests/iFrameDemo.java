package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class iFrameDemo {


    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/tinymce");

        WebElement iframe= ((ChromeDriver) driver).findElementById("mce_0_ifr");
        driver.switchTo().frame(iframe);
        //<body id="tinymce" class="mce-content-body " onload="window.parent.tinymce.get('mce_0').fire('load');" contenteditable="true" spellcheck="false"><p>Your content goes here.</p></body>
    driver.findElement(By.id("tinymce")).sendKeys("hi hello.. ");

//driver.switchTo().parentFrame();
//driver.findElement(By.linkText("Elemental Selenium")).click();
//<a target="_blank" href="http://elementalselenium.com/">Elemental Selenium</a>

//driver.switchTo().defaultContent();









        /*WebElement iframe=driver.findElement(By.id("mce_0_ifr"));
        //driver.switchTo().frame(iframe);
        driver.switchTo().frame(iframe);
        //<p>Your content goes here.</p>
        driver.findElement(By.tagName("body")).sendKeys("  dde dde dde  ddd");

//icteki html den usttekine gectim..
        driver.switchTo().parentFrame();// current framin parentina goturur
        driver.findElement(By.linkText("Elemental Selenium")).click();

//<a target="_blank" href="http://elementalselenium.com/">Elemental Selenium</a>
   //driver.switchTo().defaultContent();// en bastakine goturur*/
    }
}
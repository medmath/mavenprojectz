package com.cybertek.tests;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitExample {
//WebDriver driver;

    @Test
    public void test() throws InterruptedException {
        //Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// birsey yapamadi.find element ile ilgili degil problem

        Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_controls");
        Driver.getDriver().findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();

        //Thread.sleep(10000);// bu calisti..
//explicit wait
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"input-example\"]/input")));

        Driver.getDriver().findElement(By.xpath("//*[@id=\"input-example\"]/input")).sendKeys("HEllo WOrld");
    }

}

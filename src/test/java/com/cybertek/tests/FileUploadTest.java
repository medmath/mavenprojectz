package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase {

    @Test
    public void test1() {
        driver.get("http://the-internet.herokuapp.com/upload");
        WebElement chosenElement = driver.findElement(By.id("file-upload"));//type input olmasi onemli.

        String path = "/Users/vedatcakmaktepe/Downloads/test.txt";
        chosenElement.sendKeys(path);


        driver.findElement(By.id("file-submit")).click();
        //Assert.assertTrue(driver.findElement(By.xpath("//*[.=‘File Uploaded!’]")).isDisplayed());


        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='content']/div/h3")).isDisplayed());
        //Assert.assertTrue(driver.findElement(By.xpath("//*[.=‘File Uploaded!’]")).isDisplayed());
    }
}
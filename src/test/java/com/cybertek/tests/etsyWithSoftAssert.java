package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class etsyWithSoftAssert extends TestBase {


    @Test
    public void test(){
        //SoftAssert softAssert = new SoftAssert();// no need to create because it is in TestBase


        driver.get("https://etsy.com");

        driver.findElement(By.id("search-query")).sendKeys("gift"+ Keys.ENTER);
//<button class="btn btn-primary" type="submit" value="Search" aria-label="Search">
//                    Search
//            </button>

driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        softAssert.assertTrue(driver.getTitle().contains("Gift"));



        softAssert.assertAll();
    }


}

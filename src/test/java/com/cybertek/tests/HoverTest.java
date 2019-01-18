package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTest extends TestBase {

    @Test
    public void test(){
        driver.get("https://www.amazon.com/");
       // <span class="nav-line-1">Hello. Sign in</span>
        WebElement signIn = driver.findElement(By.xpath("//span[.='Hello. Sign in']"));
        // moving the mouse on top of the given element
        actions.moveToElement(signIn).perform();

        driver.findElement(By.xpath("//span[.='Your Hearts']")).click();
//<span class="nav-text">Your Hearts</span>
        Assert.assertTrue(driver.getTitle().contains("Interesting"));

    }

    @Test
    public void test2(){
        driver.get("https://www.amazon.com/");
        WebElement help = driver.findElement(By.xpath("(//a[.='Help'])[2]"));

        actions.moveToElement(help).perform();
    }

@Test// right click()
    public void test3(){
    driver.get("https://www.amazon.com/");
    WebElement signIn = driver.findElement(By.xpath("//span[.='Hello. Sign in']"));
    actions.contextClick(signIn).build().perform();
}

}


//<a href="/gp/help/customer/display.html/ref=footer_gw_m_b_he?ie=UTF8&amp;nodeId=508510" class="nav_a">Help</a>
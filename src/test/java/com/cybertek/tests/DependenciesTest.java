package com.cybertek.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesTest {
//order is: alphabetically..first test is homepage test.. it passed but second test failed. third test couldnt be run, since it depends on the second test
    @Test
    public void login() {
        System.out.println("Login");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "login")
    public void zbuyStg() {
        System.out.println("Bye bye baby");
    }
    @Test
    public void homePage() {
        System.out.println("home page");
    }

    @Test(priority = 4)
    public void homePage2() {
        System.out.println("home page2");
    }

}

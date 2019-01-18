package com.cybertek.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MixedUpDependencies {


    @Test
    public void openBrowser(){
        System.out.println("opening browser");
    }
    @Test(dependsOnMethods = "openBrowser")
    public void logout(){
        System.out.println("logout");
        //Assert.assertTrue(false);
    }


    @AfterMethod
    public void cleanUp(){
        System.out.println("closing the browser");
    }



}

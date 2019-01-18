package com.cybertek.tests;

import org.testng.annotations.Test;

public class MoreDependenciesTest {
// because of dependency open browser executed first
    @Test
    public void openBrowser(){
        System.out.println("opening browser");
    }

    @Test(dependsOnMethods ="openBrowser")
    public void login(){
        System.out.println("login");
    }
    @Test(dependsOnMethods = "login")
    public void logout(){
        System.out.println("logout");
    }


}

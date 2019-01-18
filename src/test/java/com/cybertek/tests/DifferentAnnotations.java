package com.cybertek.tests;

import org.testng.annotations.*;

public class DifferentAnnotations {

@Test
    public void testOne(){
    System.out.println("This is test one");
}

@BeforeMethod
    public void beforeMethod(){
    System.out.println("This is before method");
}

    @Test
    public void testTwo(){
        System.out.println("This is test two");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This is before class");

    }

@AfterClass
public void afterClass() {
    System.out.println("This is after class");

}
@AfterMethod
public void afterMethod() {
    System.out.println("This is after method" +
            "");

}

}

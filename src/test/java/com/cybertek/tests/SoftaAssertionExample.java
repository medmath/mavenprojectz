package com.cybertek.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftaAssertionExample {

    @Test
    public void test1(){
        System.out.println("Starting");
        //Assert.assertTrue(false);
        System.out.println("done");
    }


    @Test
    public void test2(){
        SoftAssert softAssert= new SoftAssert();
        //System.out.println("starting");
        //softAssert.assertTrue(false);

       softAssert.assertEquals("google","etsy");
        System.out.println("done");


        softAssert.assertEquals(1,2);
        softAssert.assertEquals(-1,3);
        softAssert.assertAll();

    }


    @Test
    public void test3(){
        SoftAssert softAssert= new SoftAssert();
        System.out.println("starting");
        softAssert.assertTrue(false);
        //softAssert.assertTrue(true);
       // Assert.assertTrue(Boolean.parseBoolean("false"));// regular assert class// it stops the rest of the method

        System.out.println("done");
        softAssert.assertAll();




    }
}

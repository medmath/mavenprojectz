package com.cybertek.tests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OrderOfThings {
//ORDER IN TESTNG    tests are executing alphabetically
    @Test(priority=1)
    public void test1(){
        System.out.println("Executing 1");
    }

    @Ignore
    @Test(priority=2)
    public void atest2(){
        System.out.println("Executing 2");

    }

    @Test(priority=0)
    public void test3(){
        System.out.println("Executing 3");

    }

}

package com.cybertek.tests;

import org.testng.annotations.Test;

public class TestNGDemo {
    //we are going write test. it is done using annotations
//we dont need main method
    @Test
    public void testOne(){
        System.out.println("Hello World");

    String expected="a";
    String actual="b";

    if(expected.equals(actual)){
        System.out.println("PASS");
    }else{
        System.out.println("FAIL");
    }

    }
}

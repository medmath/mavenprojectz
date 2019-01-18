package com.cybertek.tests;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class AssertionsDemo {

    @Test
    public void test1(){
        String a="A";
        String b="A";

        Assert.assertEquals(a,b);


    }
@Ignore
    @Test
    public void test2(){
        String a="AA";
        String b="A";

        Assert.assertEquals(a,b);// takes first parameter actual, second one expected

    }

    @Test
    public void test6(){
        boolean b= 1==1;
        Assert.assertTrue(b);
    }

    @Test
    public void test3(){
        String a = "ADAFD";
        String b = "AAA";

        Assert.assertTrue(b.contains(a));

        Assert.assertTrue(true);
        System.out.println("DONE");
    }


    @Test
    public void test4(){
        String a = "ADAFD";
        String b = "AAA";

        Assert.assertTrue(b.contains(a),
                b + " should have contained "+ a);

    }


    @Test
    public void test5(){

        Assert.assertTrue(false);

    }

}


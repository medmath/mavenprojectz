package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

//SPORTS
//1. open browser
//2. go to http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwRadioButton
//3. verify that Football is selected by default and all others are not selected.
//4. Select a random sport
//5. Verify that all other options are not selected
public class Sports {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwRadioButton");
    //<input type="radio" name="sport" value="on" id="gwt-debug-cwRadioButton-sport-Football-input" tabindex="0" checked="">
  //<input type="radio" name="sport" value="on" id="gwt-debug-cwRadioButton-sport-Baseball-input" tabindex="0">
        WebElement football=driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Football-input"));
        System.out.println(football.getText());
        WebElement Baseball=driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Baseball-input"));
        WebElement Basketball=driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Basketball-input"));
        WebElement Hockey=driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Hockey-input"));
        WebElement Soccer=driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Soccer-input"));
        WebElement WaterPolo=driver.findElement(By.id("gwt-debug-cwRadioButton-sport-WaterPolo-input"));
//        WebElement football=driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Football-input"));








//        if(football.isSelected()){
//    System.out.println("football is selected");
//}else{
//    System.out.println("football is not selected");
//}
//
//if(!Baseball.isSelected()&&!Basketball.isSelected()&&!Hockey.isSelected()&&!Soccer.isSelected()&&!WaterPolo.isSelected()) {
//           System.out.println("The others are not selected");
//       }
//        Baseball.click();
//        System.out.println("Baseball clicked...");
//        if(Baseball.isSelected()){
//            System.out.println("Baseball is selected");
//        }else{
//            System.out.println("Baseball is not selected");
//        }
//
//        if(!football.isSelected()&&!Basketball.isSelected()&&!Hockey.isSelected()&&!Soccer.isSelected()&&!WaterPolo.isSelected()) {
//            System.out.println("The others are not selected");
//        }
/*
        List<WebElement> sp=new ArrayList<WebElement>();
        sp.add(football);
        sp.add(Baseball);
        sp.add(Basketball);
        sp.add(Hockey);
        sp.add(Soccer);
        sp.add(WaterPolo);
        System.out.println(sp);

        if(sp.get(0).isSelected()){
            System.out.println(sp.get(0)+" is selected");
            for(int i=1; i<6;i++){
                if(sp.get(i).isSelected());
                {
                    System.out.println(sp.get(i).getText() + " is selected");
                }
                }

        }else{
            System.out.println("Football is not selected");
        }*/

    }
}

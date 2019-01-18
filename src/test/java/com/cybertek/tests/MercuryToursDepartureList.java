package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

//1. Open browser
//2. Go to Mercury Tours application
//3. Login as a current user
//4. Verify that default Departing From value is Acapulco

//5. Verify that list of locations: Acapulco, Frankfurt,
//London, New York, Paris, Portland, San Francisco,
//Seattle, Sydney, Zurich
//6. Test Departing From dropdown functionality by changing
//different values
public class MercuryToursDepartureList {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com/");
        WebElement userName = driver.findElement(By.name("userName"));
        userName.sendKeys("name");
        //<input type="password" name="password" size="10">
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123456");

        password.submit();
        WebElement departFrom= ((ChromeDriver) driver).findElementByName("from" +
                "Port");
        Select list= new Select(departFrom);

        List<WebElement> options=list.getOptions();
        System.out.println(options.get(0).getText());
       if(options.get(0).getText().equals("Acapulco")){
          System.out.println("Default data of departing from is: Acapulco");
       }
        System.out.println("options.size()="+options.size());
        for (WebElement option:options) {
            System.out.println(option.getText());
        }
        //list.selectByVisibleText("Option 2");
        //list.selectByIndex(1);
        //list.selectByValue("2");

//        list.selectByVisibleText("London");
//        System.out.println("Selected option: "+list.getFirstSelectedOption().getText());
//
//        list.selectByIndex(5);
//        System.out.println("Selected option: "+list.getFirstSelectedOption().getText());

//        list.selectByValue("New York");
//        System.out.println("Selected option: "+list.getFirstSelectedOption().getText());

//<select name="toPort">
//<option value="Acapulco">Acapulco
//</option><option value="Frankfurt">Frankfurt
//</option><option value="London">London
//</option><option value="New York">New York
//</option><option value="Paris">Paris
//</option><option value="Portland">Portland
//</option><option value="San Francisco">San Francisco
//</option><option value="Seattle">Seattle
//</option><option value="Sydney">Sydney
//</option><option value="Zurich">Zurich
//</option></select>


        //WebElement selectElement=driver.findElement(By.id("dropdown"));
        ////        //2. create select object using the web element
        //       Select list= new Select(selectElement);// construction


    }
}

package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

//Launch new Browser
//Open “http://toolsqa.wpengine.com/automation-practice-form/”
//Select ‘Continents’ Drop down ( Use Id to identify the element )
//Select option ‘Europe’ (Use selectByIndex)
//Select option ‘Africa’ now (Use selectByVisibleText)
//Print all the options for the selected drop down and select one option of your choice
//Close the browser
public class DropDownBoxList {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");

//<select id="continents" class="input-xlarge" name="continents"><option>Asia</option><option>Europe</option><option>Africa</option><option>Australia</option><option>South America</option><option>North America</option><option>Antartica</option></select>
        WebElement element= ((ChromeDriver) driver).findElementById("continents");
        Select list= new Select(element);
        List<WebElement> options=list.getOptions();

        for(WebElement h:options){
            System.out.println("Option: "+h.getText());
        }
        list.selectByVisibleText("Europe");
        list.selectByIndex(6);
        //list.selectByValue("Africa");
        System.out.println(list.isMultiple());
//driver.close();
    }
}

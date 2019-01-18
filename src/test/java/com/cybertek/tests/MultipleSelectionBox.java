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
//Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
//Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
//Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
//Print and select all the options for the selected Multiple selection list.
//Deselect all options
//Close the browser
public class MultipleSelectionBox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
        //<select id="selenium_commands" class="input-xlarge" multiple="multiple" name="selenium_commands"><option>Browser Commands</option><option>Navigation Commands</option><option>Switch Commands</option><option>Wait Commands</option><option>WebElement Commands</option></select>
        WebElement element= ((ChromeDriver) driver).findElementById("selenium_commands");
        Select list=new Select(element);
        List<WebElement> options= list.getOptions();
        for(WebElement h:options){
            System.out.println("Option: "+h.getText());

            list.selectByIndex(0);
            list.selectByVisibleText("Navigation Commands");

            List<WebElement> selectedOnes=list.getAllSelectedOptions();

            //System.out.println("selected Commands are:"+ selectedOnes.getText());
//            for (WebElement k:
//                    selectedOnes) {
//                System.out.println("selected Commands are:"+ k.getText());
//
//            }
        }
    }
}

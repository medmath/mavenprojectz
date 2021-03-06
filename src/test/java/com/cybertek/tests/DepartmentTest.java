package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

// THIS TEST WILL FAIL

/*
1. open browser
2.go to https://amazon.com
3.verify that default dropdown option is all
4.verify that all options are sorted alphabetically
5.Click on the menu icon on the left
6.click on Full Store directory
7.capture all of the main department names in the page.
8.verify that departments names are sorted alphabetically
9.verify that all departments names are listed in the dropdown from step 4
 */
public class DepartmentTest {

    WebDriver driver;
    Select allDepartments;

    @BeforeClass
    public void setUpMethod() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://amazon.com");
    }


    // verify that default dropdown option is all
    @Test (priority = 0)
    public void testDefaultValue() {
        // finding the element with a select tag
        WebElement selectElement = driver.findElement(By.id("searchDropdownBox"));
        // create a Select class object
        allDepartments = new Select(selectElement);
        // get the current selected option
        String selectedOption = allDepartments.getFirstSelectedOption().getText();
        System.out.println(selectedOption);

                            //Actual, expected
        //Assert.assertEquals(selectedOption, "All");

    }

    //    4.verify that all options are sorted alphabetically
    @Test (priority = 1)
    public void sortAlphabetical(){
        // using the compare to method, we will compare each element in the list to the next one

        for (int i = 0; i < allDepartments.getOptions().size()-1; i++) {
            String current = allDepartments.getOptions().get(i).getText();
            String next = allDepartments.getOptions().get(i+1).getText();

            System.out.println("comparing: " + current + " with "+  next);

            Assert.assertTrue(current.compareTo(next)<=0);

        }
    }
// 5.Click on the menu icon on the left
//    6.click on Full Store directory
//      7.capture all of the main department names in the page.
//     8.verify that departments names are sorted alphabetically

    @Test
    public void mainDepartmentsTest() throws InterruptedException {
//        5.Click on the menu icon on the left

        driver.findElement(By.cssSelector("i.hm-icon.nav-sprite")).click();

        // click on Full Store directory
        // waiting because it is taking time for element to load and be clickable
        Thread.sleep(2000);
        //driver.findElement(By.cssSelector("a[href='/gp/site-directory?ref_=nav_em_T1_0_2_2_33__fullstore']")).click();
        driver.findElement(By.xpath("//*[@id='hmenu-content']/ul[32]/li[35]/a/div"));

////*[@id="hmenu-content"]/ul[32]/li[35]/a/div

        //<div>
        //              Full Store Directory
        //            </div>

        // capture all of the main department names in the page.

        List<WebElement> mainDepts = driver.findElements(By.cssSelector("h2.fsdDeptTitle"));

        for (WebElement option :
                mainDepts) {
            System.out.println(option.getText());
        }
    }


//    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }
}


//links
//http://the-internet.herokuapp.com/javascript_alerts (Links to an external site.)Links to an external site.
//https://sweetalert.js.org/ (Links to an external site.)Links to an external site.
//
//Pop ups
//
//https://sweetalert.js.org/ (Links to an external site.)Links to an external site.
//https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml (Links to an external site.)Links to an external site. Links to an external site.
//https://www.w3schools.com/howto/howto_css_modals.aspLinks to an external site.
//
//Windows
//http://the-internet.herokuapp.com/windowsLinks to an external site.
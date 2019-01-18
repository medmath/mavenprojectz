package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.TestBase;
import org.testng.annotations.Test;

public class LoginTestWithProperty extends TestBase {

    @Test
    public void readPropertyTest(){
        driver.get(ConfigurationReader.getProperty("url"));

        HomePage homePage=new HomePage();
        String username=ConfigurationReader.getProperty("Username");
        String password=ConfigurationReader.getProperty("Password");
        homePage.login(username,password);

    }


}

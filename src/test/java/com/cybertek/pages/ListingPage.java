package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ListingPage {
    public ListingPage(){//Driver.getDriver():webelement name
        PageFactory.initElements(Driver.getDriver(),this);// this means : current object
        //PageFactory.initElements(WebDriver,);
    }



}

package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

public HomePage(){//Driver.getDriver():webelement name
    PageFactory.initElements(Driver.getDriver(),this);// this means : current object
    //PageFactory.initElements(WebDriver,);

}



    @FindBy(id="ctl00_MainContent_username")
    public WebElement username;

    @FindBy(id="ctl00_MainContent_password")
    public WebElement password;

    @FindBy(id="ctl00_MainContent_login_button")
    public WebElement loginbutton;


    @FindBy(id="ctl00_MainContent_status")
    public WebElement errorMessage;


public void login(String username, String password){
this.username.sendKeys(username);
this.password.sendKeys(password);
loginbutton.click();
}

public void open(){
    Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
}


}

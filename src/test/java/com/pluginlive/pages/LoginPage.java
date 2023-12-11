package com.pluginlive.pages;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;

public class LoginPage extends BaseClass {
    public LoginPage() throws IOException {

        PageFactory.initElements(driver , this);
    }

    @FindBy(xpath = "//input[@type='email']")
    private WebElement txtUserName;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement txtPassword;

    @FindBy(id = "checked")
    private WebElement checkboxTermsandCondition;

    public WebElement getTxtPassword() {
        return txtPassword;
    }

    public WebElement getCheckboxTermsandCondition() {
        return checkboxTermsandCondition;
    }

    public WebElement getBtnLogin() {
        return btnLogin;
    }

    public WebElement getBtnForgot() {
        return btnForgot;
    }

    @FindBy(xpath = "//button[@class='button']")
    private WebElement btnLogin;

    public WebElement getTxtUserName() {
        return txtUserName;
    }

    @FindBy (xpath = "//*[@class='forgot-button']")
    private WebElement btnForgot;



    public void  Login(String userName, String password) throws AWTException {
 implicitywait();
 sendkeys(getTxtUserName(),userName);
 sendkeys(getTxtPassword(),password);
 click(checkboxTermsandCondition);
 click(btnLogin);


   }



}

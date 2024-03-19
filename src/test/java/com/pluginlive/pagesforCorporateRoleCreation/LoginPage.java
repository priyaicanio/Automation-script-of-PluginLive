package com.pluginlive.pagesforCorporateRoleCreation;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;

public class LoginPage extends BaseClass {
    public LoginPage() throws IOException {

        PageFactory.initElements(driver, this);
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

    @FindBy(xpath = "//*[@class='forgot-button']")
    private WebElement btnForgot;

    @FindBy(xpath = "(//div[@class=\"error\"])[1]")
    private WebElement errormsgInvalidusername;

    @FindBy(xpath = "(//div[@class=\"error\"])[2]")
    private WebElement errormsgInvalidpassword;

    public WebElement getErrormsgInvalidusername() {
        return errormsgInvalidusername;
    }

    public WebElement getErrormsgInvalidpassword() {
        return errormsgInvalidpassword;
    }

    public WebElement getErrormsgTermsandConditions() {
        return errormsgTermsandConditions;
    }

    @FindBy(xpath = "(//div[@class=\"error\"])[3]")
    private WebElement errormsgTermsandConditions;


    public void Login(String userName, String password) throws AWTException, InterruptedException {
        implicitywait();
        refresh();
        Thread.sleep(2000);
        sendkeys(getTxtUserName(), userName);
        sendkeys(getTxtPassword(), password);
        click(getCheckboxTermsandCondition());
        click(getBtnLogin());
    }

    public void negativeloginscenario() {
        implicitywait();
        sendkeys(getTxtUserName(), "priya@icanio.com");
        sendkeys(getTxtPassword(), "Priya@2606");
        click(getCheckboxTermsandCondition());
        click(getBtnLogin());

    }

    public String errormsg() throws InterruptedException {
        Thread.sleep(2000);
        visibilityOf(getErrormsgInvalidusername());
        return getText(getErrormsgInvalidusername());

    }

}

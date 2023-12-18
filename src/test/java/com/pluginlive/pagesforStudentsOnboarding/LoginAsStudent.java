package com.pluginlive.pagesforStudentsOnboarding;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginAsStudent extends BaseClass {


    public LoginAsStudent() throws IOException {
        super();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name=\"email\"]")
    private WebElement emailId;

    @FindBy (xpath = "//input[@name=\"psw\"]")
private WebElement password;

    @FindBy (xpath = "//input[@id='checked']")
    private WebElement agreeTermsAndCondition;

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement loginButton;

    public WebElement getEmailId() {
        return emailId;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getAgreeTermsAndCondition() {
        return agreeTermsAndCondition;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public void loginasstudent(String emailid, String password) throws InterruptedException {
        sendkeys(getEmailId(),emailid);
        Thread.sleep(2000);
        sendkeys(getPassword(),password);
        Thread.sleep(2000);
        click(getAgreeTermsAndCondition());
        Thread.sleep(2000);
        click(getLoginButton());


    }






}

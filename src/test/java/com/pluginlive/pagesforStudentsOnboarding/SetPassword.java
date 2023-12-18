package com.pluginlive.pagesforStudentsOnboarding;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class SetPassword extends BaseClass {
    public SetPassword() throws IOException {
        super();
        PageFactory.initElements(driver,this);
    }


    @FindBy (xpath = "//span[text()='New Password *']")
    private WebElement newPassword;

    @FindBy (xpath = "//span[text()='Confirm Password *']")
    private WebElement confirmPassword;

    @FindBy (xpath = "//div[text()='Submit']")
    private WebElement submitButton;

    public WebElement getNewPassword() {
        return newPassword;
    }

    public WebElement getConfirmPassword() {
        return confirmPassword;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public void setNewPassword(String newPassword , String confirmPassword){
        sendkeys(getNewPassword(), newPassword);
        sendkeys(getConfirmPassword(), confirmPassword);
        scrolldown(getSubmitButton());
        click(getSubmitButton());
    }




}

package com.pluginlive.pagesforStudentsOnboarding;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class SetPassword extends BaseClass {
    public SetPassword() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "(//input[@type=\"password\"])[1]")
    private WebElement newPassword;

    @FindBy(xpath = "(//input[@type=\"password\"])[2]")
    private WebElement confirmPassword;

    @FindBy(xpath = "//div[text()='Submit']")
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

    public void setNewPassword(String newPassword, String confirmPassword) throws InterruptedException, IOException {
        switchchildwindow();
        implicitywait();
        Thread.sleep(5000);
        sendkeys(getNewPassword(), newPassword);
        Thread.sleep(1000);
        click(getConfirmPassword());
        sendkeys(getConfirmPassword(), confirmPassword);
        Thread.sleep(1000);
        scrolldown(getSubmitButton());
        click(getSubmitButton());

    }


}

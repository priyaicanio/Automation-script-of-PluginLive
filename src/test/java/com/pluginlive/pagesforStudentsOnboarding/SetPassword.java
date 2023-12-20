package com.pluginlive.pagesforStudentsOnboarding;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class SetPassword extends BaseClass {
    public SetPassword() throws IOException {
        super();
        PageFactory.initElements(driver,this);
    }


    @FindBy (xpath = "(//input[@class=\"sc-gotJSS TlbII\"])[1]")
    private WebElement newPassword;

    @FindBy (xpath = "(//input[@class=\"sc-gotJSS TlbII\"])[2]")
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

    public void setNewPassword(String newPassword , String confirmPassword) throws InterruptedException {
        implicitywait();
        scrolldown(getNewPassword());
       sendkeys(getNewPassword(),newPassword);
        Thread.sleep(1000);
        click(getConfirmPassword());
        sendkeys(getConfirmPassword(), confirmPassword);
        Thread.sleep(1000);
        scrolldown(getSubmitButton());
        click(getSubmitButton());

    }


}

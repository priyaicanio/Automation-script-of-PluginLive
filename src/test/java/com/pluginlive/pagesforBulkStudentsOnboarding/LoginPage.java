package com.pluginlive.pagesforBulkStudentsOnboarding;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class LoginPage extends BaseClass {

    public LoginPage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[text()='Register']")
    private WebElement registerButton;


    public WebElement getRegisterButton() {
        return registerButton;
    }


    public void register() throws InterruptedException {
        Thread.sleep(1000);
//        visibilityOf(getRegisterButton());
        System.out.println("Before clicking register");
        click(getRegisterButton());
        System.out.println("After clicking register");
    }
}

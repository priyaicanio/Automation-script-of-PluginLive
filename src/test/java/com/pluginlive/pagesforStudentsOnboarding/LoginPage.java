package com.pluginlive.pagesforStudentsOnboarding;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends BaseClass {

    public LoginPage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[contains(text(), 'Register')]")
    private WebElement registerButton;


    public WebElement getRegisterButton() {
        return registerButton;
    }


    public void register() throws InterruptedException {
        scrolldown(getRegisterButton());
        Thread.sleep(3000);
        visibilityOf(getRegisterButton());
        click(getRegisterButton());
    }

}




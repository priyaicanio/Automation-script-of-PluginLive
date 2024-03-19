package com.pluginlive.pagesforCorporateDriveCreation;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ViewRolePage extends BaseClass {


    public ViewRolePage() throws IOException {
        super();
        PageFactory.initElements(driver, this);

    }

    @FindBy (xpath = "//span[@class=\"sc-gyChMU fVPMOY\"]")
    private WebElement corporatedriveNotification;

    @FindBy (xpath = "//div[text()='View & Confirm']")
    private WebElement viewandconfirmButton;

    @FindBy (xpath = "//div[text()='Confirm']")
    private WebElement confirmButton;

    public WebElement getCorporatedriveNotification() {
        return corporatedriveNotification;
    }

    public WebElement getViewandconfirmButton() {
        return viewandconfirmButton;
    }

    public WebElement getConfirmButton() {
        return confirmButton;
    }

    public void driveconfirmation() throws InterruptedException {
        click(getCorporatedriveNotification());
        Thread.sleep(1000);
        click(getViewandconfirmButton());
        Thread.sleep(1000);
click(getConfirmButton());

    }





}

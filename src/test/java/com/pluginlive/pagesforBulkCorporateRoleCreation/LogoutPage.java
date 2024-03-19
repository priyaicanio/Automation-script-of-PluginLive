package com.pluginlive.pagesforBulkCorporateRoleCreation;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LogoutPage extends BaseClass {

    public LogoutPage() throws IOException {
        super();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//span[text()='P'])[1]")
    private WebElement profileDropdown;

    @FindBy(xpath = "//div[text()='Logout']")
    private WebElement logoutButton;

    @FindBy(xpath = "//span[text()='Confirm']")
    private WebElement confirmButton;

    public WebElement getProfileDropdown() {
        return profileDropdown;
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    public WebElement getConfirmButton() {
        return confirmButton;
    }

    public void logout() throws InterruptedException {
        click(getProfileDropdown());
        Thread.sleep(2000);
        click(getLogoutButton());
        Thread.sleep(1000);
        click(getConfirmButton());

    }


}

package com.pluginlive.pagesforInstituteRoleAccepting;

import com.pluginlive.base.BaseClass;
import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;


public class RolesPage extends BaseClass {


    public RolesPage() throws IOException {

        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder=\"Search by keyword\"]")
    private WebElement searchButton;
    @FindBy(xpath = "//div[@class=\"sc-dcJsrY kRyiKz\"]")
    private List<WebElement> rolesList;
    @FindBy(xpath = "(//button[@class=\"ant-btn ant-btn-default ant-btn-icon-only ant-btn-compact-item ant-btn-compact-last-item ant-dropdown-trigger\"])[1]")
    private WebElement downarrowButton;
    @FindBy(xpath = "//span[text()='Accept/Reject']")
    private WebElement acceptorrejectButton;


    @FindBy(xpath = "//span[text()='Accept Role']")
    private WebElement acceptbutton;

    public WebElement getAcceptbutton() {
        return acceptbutton;
    }

    public WebElement getRejectbutton() {
        return rejectbutton;
    }

    public WebElement getConfirmbutton() {
        return confirmbutton;
    }

    @FindBy(xpath = "//span[text()='Reject Role']")
    private WebElement rejectbutton;

    @FindBy(xpath = "//div[text()='Confirm']")
    private WebElement confirmbutton;


    public WebElement getSearchButton() {
        return searchButton;
    }

    public List<WebElement> getRolesList() {
        return rolesList;
    }

    public WebElement getDownarrowButton() {
        return downarrowButton;
    }

    public WebElement getAcceptorrejectButton() {
        return acceptorrejectButton;
    }


    public void search(String search) throws InterruptedException {
        click(getSearchButton());
        Thread.sleep(2000);
        sendkeys(getSearchButton(), search);
        Thread.sleep(2000);
        click(getDownarrowButton());
        Thread.sleep(2000);
        try {
            WebElement button = getAcceptorrejectButton();
            if (button != null && button.isEnabled()) {
                click(button);
            } else if (button != null) {
                System.out.println("Button is not enabled");
            }
        } catch (NoSuchElementException e) {
            System.err.println("Accept/Reject button not found: " + e.getMessage());
            driver.quit();
            return;
        }
        Thread.sleep(1000);
        click(getAcceptbutton());
        Thread.sleep(1000);
        click(getConfirmbutton());

    }


}

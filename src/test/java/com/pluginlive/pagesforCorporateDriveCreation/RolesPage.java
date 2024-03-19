package com.pluginlive.pagesforCorporateDriveCreation;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class RolesPage extends BaseClass {


    public RolesPage() throws IOException {
        PageFactory.initElements(driver, this);

    }

    int desiredIndex = 0;
    @FindBy(xpath = "//input[@placeholder=\"Search by keyword\"]")
    private WebElement searchbox;

    @FindBy(xpath = "(//span[text()='View'])[1]")
    private WebElement viewButton;

    @FindBy(xpath = "//p[text()='Freshers']")
    private WebElement freshersCard;

    @FindBy(xpath = "//div[text()='Create Drive']")
    private WebElement createDriveButton;

    @FindBy(xpath = "//div[text()='Campus Drive']")
    private WebElement campusDriveButton;

    @FindBy(xpath = "//input[@placeholder=\"Eg: Drive Name\"]")
    private WebElement driveName;

    @FindBy(xpath = "//input[@type=\"search\"]")
    private WebElement driveCity;

    @FindBy(xpath = "//div[text()='Add College']")
    private WebElement addCollege;

    @FindBy(xpath = "(//input[@type=\"radio\"])[4]")
    private WebElement driveInstitute;

    @FindBy(xpath = "//div[text()='Confirm']")
    private WebElement confirmButton;

    @FindBy(xpath = "//div[text()='Send a Request']")
    private WebElement sendaRequest;

    @FindBy(xpath = "//tr[@class=\"ant-table-row ant-table-row-level-0\"]")
    private List<WebElement> listofRoles;

    @FindBy(xpath = "//div[text()='Confirm']")
    private WebElement finalConfirmation;


    @FindBy(xpath = "//span[@class=\"ant-avatar ant-avatar-circle ant-avatar-image sc-kMjNwy ihweFl\"]")
    private WebElement profiledropdown;

    @FindBy(xpath = "//div[text()='Logout']")
    private WebElement logoutButton;

    public WebElement getProfiledropdown() {
        return profiledropdown;
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    public WebElement getLogoutConfirmButton() {
        return logoutConfirmButton;
    }

    @FindBy(xpath = "//span[text()='Confirm']")
    private WebElement logoutConfirmButton;


    public WebElement getFinalConfirmation() {
        return finalConfirmation;
    }

    public List<WebElement> getListofRoles() {
        return listofRoles;
    }

    public WebElement getSearchbox() {
        return searchbox;
    }

    public WebElement getViewButton() {
        return viewButton;
    }

    public WebElement getFreshersCard() {
        return freshersCard;
    }

    public WebElement getCreateDriveButton() {
        return createDriveButton;
    }

    public WebElement getCampusDriveButton() {
        return campusDriveButton;
    }

    public WebElement getDriveName() {
        return driveName;
    }

    public WebElement getDriveCity() {
        return driveCity;
    }

    public WebElement getAddCollege() {
        return addCollege;
    }

    public WebElement getDriveInstitute() {
        return driveInstitute;
    }

    public WebElement getConfirmButton() {
        return confirmButton;
    }

    public WebElement getSendaRequest() {
        return sendaRequest;
    }


    public void campusDrive(String search, String driveName, String driveCity) throws InterruptedException, AWTException {
        click(getSearchbox());
        Thread.sleep(1000);
        sendkeys(getSearchbox(), search);
        scrolldown(getViewButton());
        Thread.sleep(1000);
        click(getViewButton());
        Thread.sleep(1000);
        click(freshersCard);
        Thread.sleep(1000);
        click(getCreateDriveButton());
        Thread.sleep(1000);
        click(getCampusDriveButton());
        Thread.sleep(1000);
        sendkeys(getDriveName(), driveName);
        Thread.sleep(2000);
        sendkeys(getDriveCity(), driveCity);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(1000);
        click(getAddCollege());
        Thread.sleep(1000);
        click(getDriveInstitute());
        Thread.sleep(1000);
        click(getConfirmButton());
        Thread.sleep(1000);
        click(getSendaRequest());
        Thread.sleep(1000);
        click(getFinalConfirmation());

    }

    public void logout() throws InterruptedException {

        click(getProfiledropdown());
        Thread.sleep(1000);
        click(getLogoutButton());
        Thread.sleep(1000);
        click(getLogoutConfirmButton());

    }

}




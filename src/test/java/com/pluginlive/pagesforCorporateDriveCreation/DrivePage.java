package com.pluginlive.pagesforCorporateDriveCreation;

import com.pluginlive.base.BaseClass;
import io.cucumber.java.StepDefinitionAnnotation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class DrivePage extends BaseClass {
    public DrivePage() throws IOException {

        PageFactory.initElements(driver, this);
    }

    int desiredIndex = 0;
    @FindBy(xpath = "(//div[@class=\"sc-hOynoF bmOlrc\"])[2]")
    private WebElement driveNotificattion;

    @FindBy(xpath = "//div[text()='Schedule a Drive']")
    private WebElement scheduleDriveButton;

    public WebElement getDriveNotificattion() {
        return driveNotificattion;
    }

    public WebElement getScheduleDriveButton() {
        return scheduleDriveButton;
    }

    public List<WebElement> getDriveList() {
        return driveList;
    }

    @FindBy(xpath = "//div[@class=\"sc-dcJsrY sc-dGHkRN gdrQrr jHZFLo\"]")
    private List<WebElement> driveList;

    public WebElement getScheduleButton() {
        return scheduleButton;
    }

    @FindBy (xpath = "//div[text()='Schedule']")
    private WebElement scheduleButton;

    @FindBy (xpath = "//input[@placeholder=\"Start date\"]")
    private WebElement startDate;

    @FindBy (xpath = "//input[@placeholder=\"End date\"]")
    private WebElement EndDate;

    @FindBy (xpath = "//input[@id=\"startTime\"]")
    private WebElement startTime;

    @FindBy (xpath = "//input[@id=\"endTime\"]")
    private WebElement endTime;

    @FindBy(xpath = "//button[@form=\"confirmDrive\"]")
    private WebElement confirmDrive;

    public WebElement getStartDate() {
        return startDate;
    }

    public WebElement getEndDate() {
        return EndDate;
    }

    public WebElement getStartTime() {
        return startTime;
    }

    public WebElement getEndTime() {
        return endTime;
    }

    public WebElement getConfirmDrive() {
        return confirmDrive;
    }

    @FindBy (xpath = "//span[@class=\"ant-avatar ant-avatar-circle ant-avatar-image sc-ehixzo gWJrrG\"]")
    private WebElement instituteprofiledropdown;

    @FindBy (xpath = "//div[text()='Logout']")
    private WebElement instituteLogout;

    @FindBy (xpath = "//span[text()='Confirm']")
    private WebElement instituteConfirmButton;

    public List<WebElement> getDriveTiming() {
        return DriveTiming;
    }

    @FindBy (xpath = "//li[@class='ant-picker-time-panel-cell']")
    private List<WebElement> DriveTiming;


    public WebElement getInstituteprofiledropdown() {
        return instituteprofiledropdown;
    }

    public WebElement getInstituteLogout() {
        return instituteLogout;
    }

    public WebElement getInstituteConfirmButton() {
        return instituteConfirmButton;
    }

    public void drive() throws InterruptedException {
        Thread.sleep(1000);
        click(getDriveNotificattion());
    }

    public void driveList() throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i < getDriveList().size(); i++) {
            WebElement driveElement = getDriveList().get(i);
            String driveText = driveElement.getText();
            System.out.println("Drive " + (i + 1) + ": " + driveText);

            if (i == desiredIndex) {
                driveElement.click();
                break;
            }
        }
        click(getScheduleDriveButton());

    }

        public void confirmdrive(String drivestartDate, String driveendDate, String drivestartTime, String driveendTime) throws InterruptedException, AWTException {
        click(getScheduleButton());
        Thread.sleep(1000);
        sendkeys(getStartDate(),drivestartDate);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(1000);
        sendkeys(getEndDate(),driveendDate);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(1000);
        sendkeys(getStartTime(),drivestartTime);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(1000);
        sendkeys(getEndTime(),driveendTime);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(1000);
      click(getConfirmDrive());

    }

    public void institutelogout() throws InterruptedException {
        click(getInstituteprofiledropdown());
        Thread.sleep(1000);
        click(getInstituteLogout());
        Thread.sleep(1000);
       click(getInstituteConfirmButton());


    }

}



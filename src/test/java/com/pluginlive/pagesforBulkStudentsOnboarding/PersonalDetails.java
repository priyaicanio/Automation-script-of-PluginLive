package com.pluginlive.pagesforBulkStudentsOnboarding;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class PersonalDetails extends BaseClass {


    public PersonalDetails() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    String profilepic = readExcelData1("PersonalDetails", 1, 1);

    @FindBy(xpath = "//input[@id=\"uniRollNo\"]")
    private WebElement registrationNo;
    @FindBy(xpath = "//div[text()='Upload Photo *']")
    private WebElement uploadPhoto;

    @FindBy(xpath = "//input[@placeholder=\"DD/MM/YYYY\"]")
    private WebElement dob;

    @FindBy(xpath = "//input[@id=\"rc_select_0\"]")
    private WebElement sex;

    @FindBy(xpath = "//input[@aria-activedescendant=\"rc_select_0_list_2\"]")
    private WebElement female;

    @FindBy(xpath = "//input[@aria-activedescendant=\"rc_select_0_list_1\"]")
    private WebElement male;

    @FindBy(xpath = "//input[@id=\"permAddrLine1\"]")
    private WebElement permanentAddress;

    @FindBy(xpath = "//input[@id=\"permAddrLine2\"]")
    private WebElement permanentAddress2;

    @FindBy(xpath = "//input[@aria-controls=\"rc_select_2_list\"]")
    private WebElement country;

    @FindBy(xpath = "//input[@aria-controls=\"rc_select_3_list\"]")
    private WebElement state;

    @FindBy(xpath = "//input[@aria-controls=\"rc_select_4_list\"]")
    private WebElement city;

    public WebElement getSecondaryEmail() {
        return secondaryEmail;
    }


    @FindBy(xpath = "//input[@id=\"permPostCode\"]")
    private WebElement pinCode;

    @FindBy(xpath = "//input[@class=\"ant-checkbox-input\"]")
    private WebElement checkBoxSameasPermanentAddress;

    @FindBy(xpath = "//input[@id=\"secondaryEmail\"]")
    private WebElement secondaryEmail;

    @FindBy(xpath = "//div[text()='Save and Continue']")
    private WebElement saveAndContinue;

    public WebElement getRegistrationNo() {
        return registrationNo;
    }

    public WebElement getUploadPhoto() {
        return uploadPhoto;
    }

    public WebElement getDob() {
        return dob;
    }

    public WebElement getSex() {
        return sex;
    }

    public WebElement getFemale() {
        return female;
    }

    public WebElement getMale() {
        return male;
    }

    public WebElement getPermanentAddress() {
        return permanentAddress;
    }

    public WebElement getPermanentAddress2() {
        return permanentAddress2;
    }

    public WebElement getCountry() {
        return country;
    }

    public WebElement getState() {
        return state;
    }

    public WebElement getCity() {
        return city;
    }

    public WebElement getPinCode() {
        return pinCode;
    }

    public WebElement getCheckBoxSameasPermanentAddress() {
        return checkBoxSameasPermanentAddress;
    }

    public WebElement getSaveAndContinue() {
        return saveAndContinue;
    }

    public void personaldetails(String RegNo, String profilepic, String dob, String sex, String Addressline1, String Addressline2, String Country, String State, String City, String Pincode) throws InterruptedException, AWTException, IOException {
        Thread.sleep(2000);
        sendkeys(getRegistrationNo(), RegNo);
        Thread.sleep(2000);
        click(getDob());
        Thread.sleep(2000);
        sendkeys(getDob(), dob);
        Thread.sleep(2000);
        enterKey();
        click(getSex());
        Thread.sleep(2000);
        sendkeys(getSex(), sex);
        Thread.sleep(2000);
        enterKey();
        scrolldown(getPermanentAddress());
        Thread.sleep(2000);
        sendkeys(getPermanentAddress(), Addressline1);
        Thread.sleep(2000);
        sendkeys(getPermanentAddress2(), Addressline2);
        Thread.sleep(2000);
        sendkeys(getCountry(), Country);
        Thread.sleep(2000);
        enterKey();
        sendkeys(getState(), State);
        Thread.sleep(2000);
        enterKey();
        sendkeys(getCity(), City);
        Thread.sleep(2000);
        enterKey();
        sendkeys(getPinCode(), Pincode);
        Thread.sleep(2000);
        click(getCheckBoxSameasPermanentAddress());
        Thread.sleep(2000);
        scrolldown(getSaveAndContinue());
        Thread.sleep(2000);
        click(getSaveAndContinue());

    }

    public void clickAndContinue() throws InterruptedException {
        Thread.sleep(2000);
        scrolldown(getSaveAndContinue());
        Thread.sleep(2000);
        click(getSaveAndContinue());
    }
}

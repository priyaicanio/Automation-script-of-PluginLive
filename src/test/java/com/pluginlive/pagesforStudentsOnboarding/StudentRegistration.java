package com.pluginlive.pagesforStudentsOnboarding;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;

public class StudentRegistration extends BaseClass {
    public StudentRegistration() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id=\"firstName\"]")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id=\"lastName\"]")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id=\"email\"]")
    private WebElement email;

    @FindBy(xpath = "//input[@id=\"phoneNumber\"]")
    private WebElement phoneNumber;

    @FindBy(xpath = "//input[@name='radio'][@value='student']")
    private WebElement studentRadioButton;

    @FindBy(xpath = "//input[@value=\"working\"]")
    private WebElement currentlyEmployedRadioButton;

    @FindBy(xpath = "//input[@value=\"other\"]")
    private WebElement currentlyUnemployedRadioButton;

    @FindBy(xpath = "//input[@id=\"rc_select_1\"]")
    private WebElement selectState;

    @FindBy(xpath = "//input[@id=\"rc_select_2\"]")
    private WebElement selectCity;

    @FindBy(xpath = "//input[@id=\"rc_select_3\"]")
    private WebElement selectCollege;

    @FindBy(xpath = "//input[@id=\"rc_select_4\"]")
    private WebElement selectDegree;
    @FindBy(xpath = "//input[@id=\"rc_select_5\"]")
    private WebElement selectDepartment;

    @FindBy(xpath = "//input[@id=\"rc_select_6\"]")
    private WebElement specialisation;
    @FindBy(xpath = "//input[@id=\"rc_select_7\"]")
    private WebElement startMonth;

    @FindBy(xpath = "//input[@id=\"rc_select_8\"]")
    private WebElement startYear;
    @FindBy(xpath = "//input[@id=\"rc_select_9\"]")
    private WebElement endMonth;

    @FindBy(xpath = "//input[@id=\"rc_select_10\"]")
    private WebElement endYear;

    @FindBy(xpath = "//*[text()='Submit']")
    private WebElement submitButton;

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public WebElement getStudentRadioButton() {
        return studentRadioButton;
    }

    public WebElement getCurrentlyEmployedRadioButton() {
        return currentlyEmployedRadioButton;
    }

    public WebElement getCurrentlyUnemployedRadioButton() {
        return currentlyUnemployedRadioButton;
    }

    public WebElement getSelectState() {
        return selectState;
    }

    public WebElement getSelectCity() {
        return selectCity;
    }

    public WebElement getSelectCollege() {
        return selectCollege;
    }

    public WebElement getSelectDegree() {
        return selectDegree;
    }

    public WebElement getSelectDepartment() {
        return selectDepartment;
    }

    public WebElement getSpecialisation() {
        return specialisation;
    }

    public WebElement getStartMonth() {
        return startMonth;
    }

    public WebElement getStartYear() {
        return startYear;
    }

    public WebElement getEndMonth() {
        return endMonth;
    }

    public WebElement getEndYear() {
        return endYear;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    // @FindBy(xpath = "//div[@class=\"sc-fmRtwQ kIYJuE\"]//following-sibling::div")
    @FindBy(xpath = "//div[contains(text(), 'Thank you')]")
    private WebElement registrationSuccessMsg;

    public WebElement getRegistrationSuccessMsg() {
        return registrationSuccessMsg;
    }

    public void studentRegistration(String firstName, String lastName, String email, String phoneNumber, String state, String city, String college, String degree, String department, String startmonth, String startyear, String endmonth, String endyear) throws InterruptedException, AWTException {
        sendkeys(getFirstName(), firstName);
        sendkeys(getLastName(), lastName);
        sendkeys(getEmail(), email);
        sendkeys(getPhoneNumber(), phoneNumber);
        Thread.sleep(2000);
        scrolldown(getStudentRadioButton());
        Thread.sleep(2000);
        click(getStudentRadioButton());
        Thread.sleep(2000);

      sendkeys(getSelectState(), state);
        Thread.sleep(1000);
        enterKey();
        sendkeys(getSelectCity(), city);
        Thread.sleep(1000);
        enterKey();
        sendkeys(getSelectCollege(), college);
        Thread.sleep(2000);
        enterKey();
        sendkeys(getSelectDegree(), degree);
        Thread.sleep(5000);
        enterKey();
        sendkeys(getSelectDepartment(), department);
        Thread.sleep(2000);
        enterKey();
        sendkeys(getStartMonth(), startmonth);
        enterKey();
        sendkeys(getStartYear(), startyear);
        enterKey();
        sendkeys(getEndMonth(), endmonth);
        enterKey();
        sendkeys(getEndYear(), endyear);
        enterKey();
        Thread.sleep(3000);
        scrolldown(getSubmitButton());
        Thread.sleep(2000);
        click(getSubmitButton());

    }

    // Registration success msg

    public String registrationsuccessmsg() throws InterruptedException {
        Thread.sleep(3000);
        visibilityOf(getRegistrationSuccessMsg());
        return getText(getRegistrationSuccessMsg());

    }


}


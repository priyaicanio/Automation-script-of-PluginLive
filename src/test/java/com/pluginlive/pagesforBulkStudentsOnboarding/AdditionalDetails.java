package com.pluginlive.pagesforBulkStudentsOnboarding;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;

public class AdditionalDetails extends BaseClass {
    public AdditionalDetails() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='rc_select_65']")
    private WebElement caste;

    @FindBy(xpath = "//input[@id='rc_select_66']")
    private WebElement religion;

    @FindBy(xpath = "//input[@id=\"hobbie_0\"]")
    private WebElement hobbies;

    @FindBy(xpath = "//input[@id=\"language_0\"]")
    private WebElement language;

    public WebElement getLanguage2() {
        return language2;
    }

    @FindBy(xpath = "//input[@id=\"language_1\"]")
    private WebElement language2;


    @FindBy(xpath = "//div[text()='Add Languages']")
    private WebElement addLanguage;


    @FindBy(xpath = "//input[@type=\"checkbox\"]")
    private WebElement joblocationAnywhere;

    @FindBy(xpath = "//div[@aria-label=\"Enter Your Description here...\"]")
    private WebElement careerObjective;

    public WebElement getCaste() {
        return caste;
    }

    public WebElement getReligion() {
        return religion;
    }

    public WebElement getHobbies() {
        return hobbies;
    }

    public WebElement getLanguage() {
        return language;
    }

    public WebElement getAddLanguage() {
        return addLanguage;
    }

    public WebElement getJoblocationAnywhere() {
        return joblocationAnywhere;
    }

    public WebElement getCareerObjective() {
        return careerObjective;
    }

    @FindBy(xpath = "//div[text()='Save & Continue']")
    private WebElement saveAndContinueButton;

    public WebElement getSaveAndContinueButton() {
        return saveAndContinueButton;
    }

    public WebElement getWhatsappandmailnotification() {
        return whatsappandmailnotification;
    }

    @FindBy(xpath = "(//button[@type=\"button\"])[2]")
    private WebElement whatsappandmailnotification;


    public void additionaldetails(String caste, String religion, String Hobbies, String lang1, String lang2, String careerobj) throws AWTException, InterruptedException {
        Thread.sleep(2000);
        visibilityOf(getCaste());
        sendkeys(getCaste(), caste);
        Thread.sleep(1000);
        enterKey();
        sendkeys(getReligion(), religion);
        Thread.sleep(1000);
        enterKey();
        sendkeys(getHobbies(), Hobbies);
        Thread.sleep(1000);
        sendkeys(getLanguage(), lang1);
        Thread.sleep(1000);
        click(getAddLanguage());
        Thread.sleep(1000);
        sendkeys(getLanguage2(), lang2);
        click(getJoblocationAnywhere());
        Thread.sleep(1000);
        click(getCareerObjective());
        Thread.sleep(1000);
        sendkeys(getCareerObjective(), careerobj);
        Thread.sleep(1000);
        click(getSaveAndContinueButton());
        Thread.sleep(1000);
        click(getWhatsappandmailnotification());


    }


}

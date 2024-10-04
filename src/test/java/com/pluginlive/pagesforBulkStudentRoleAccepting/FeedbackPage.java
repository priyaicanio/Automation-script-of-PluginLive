package com.pluginlive.pagesforBulkStudentRoleAccepting;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;

public class FeedbackPage extends BaseClass {

    public FeedbackPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id=\"rc_select_0\"]")
    private WebElement informationAboutThisJobRole;

    @FindBy(xpath = "//div[text()='Next']")
    private WebElement nextButton;

    public WebElement getInformationAboutThisJobRole() {
        return informationAboutThisJobRole;
    }

    public WebElement getNextButton() {
        return nextButton;
    }

    @FindBy(xpath = "//div[@aria-posinset=\"4\"]")
    private WebElement starRating;

    @FindBy(xpath = "//div[text()='Great Platform']")
    private WebElement Aboutus;

    @FindBy(xpath = "//textarea[@placeholder=\"Want to share anything else ? Type here..\"]")
    private WebElement writtenFeedback;

    @FindBy(xpath = "//div[text()='Send Your Feedback']")
    private WebElement sendFeedbackButton;

    @FindBy(xpath = "//div[@class=\"sc-aXZVg sc-iHbSHJ lmnCGv brMIpi\"]")
    private WebElement Appliedsuccessfullmsg;

    @FindBy(xpath = "//button[@class=\"ant-btn ant-btn-primary sc-dtInlm bRDbTv\"]")
    private WebElement doneButton;

    public WebElement getJobresultlink() {
        return jobresultlink;
    }

    @FindBy(linkText = "result")
    private WebElement jobresultlink;


    public WebElement getDoneButton() {
        return doneButton;
    }

    public WebElement getAppliedsuccessfullmsg() {
        return Appliedsuccessfullmsg;
    }

    public WebElement getStarRating() {
        return starRating;
    }

    public WebElement getAboutus() {
        return Aboutus;
    }

    public WebElement getWrittenFeedback() {
        return writtenFeedback;
    }

    public WebElement getSendFeedbackButton() {
        return sendFeedbackButton;
    }

    public void feedback(String reference) throws InterruptedException, AWTException {
        implicitywait();
        Thread.sleep(2000);
       // elementSendKeysjs(getInformationAboutThisJobRole(),reference);
        sendkeys(getInformationAboutThisJobRole(), reference);
        Thread.sleep(3000);
        enter(driver);
        Thread.sleep(1000);
        elementclickjs(getNextButton());
        //click(getNextButton());


    }

    public void feedbackform(String feedback) throws InterruptedException {
        implicitywait();
        Thread.sleep(3000);
        elementclickjs(getStarRating());
        Thread.sleep(1000);
        elementclickjs(getAboutus());
        // click(getAboutus());
        Thread.sleep(1000);
        sendkeys(getWrittenFeedback(), feedback);
        Thread.sleep(1000);
        elementclickjs(getSendFeedbackButton());
       // click(getSendFeedbackButton());
    }

    public String appliedSuccessMsg() {
        String text = getText(getAppliedsuccessfullmsg());
        return text;
    }

    public void donebutton() throws InterruptedException {
        Thread.sleep(2000);
        elementclickjs(getDoneButton());
        //click(getDoneButton());
    }

}



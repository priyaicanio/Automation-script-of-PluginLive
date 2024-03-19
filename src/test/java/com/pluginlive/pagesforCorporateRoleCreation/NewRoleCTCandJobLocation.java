package com.pluginlive.pagesforCorporateRoleCreation;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class NewRoleCTCandJobLocation extends BaseClass {

    public NewRoleCTCandJobLocation() throws IOException {
        PageFactory.initElements(driver, this);
    }

    // Annually
    @FindBy(xpath = "//input[@value=\"ANNUALLY\"]")
    private WebElement radiobuttonAnnually;

    @FindBy(xpath = "//input[@value=\"MONTHLY\"]")
    private WebElement radiobuttonMonthly;
    @FindBy(xpath = "//input[@value=\"WEEKLY\"]")
    private WebElement radiobuttonWeekly;
    @FindBy(xpath = "//input[@value=\"DAILY\"]")
    private WebElement radiobuttonDaily;

    //Ctc range
    @FindBy(xpath = "//input[@value='Range']")
    private WebElement ctcRangeCheckbox;
    //Min range
    @FindBy(xpath = "//input[@id=\"tierOneMin\"]")
    private WebElement minRange;
    @FindBy(xpath = "//input[@id=\"tierOneMax\"]")
    private WebElement maxRange;

    public WebElement getCtcRangeCheckbox() {
        return ctcRangeCheckbox;
    }

    public WebElement getMinRange() {
        return minRange;
    }

    public WebElement getMaxRange() {
        return maxRange;
    }

    public WebElement getDifferentCTCOfEachTier() {
        return differentCTCOfEachTier;
    }

    //Difference CTC of each Tier
    @FindBy(xpath = "(//div[@class=\"ant-switch-handle\"])[1]")
    private WebElement differentCTCOfEachTier;

    //tier2 Range
    @FindBy(xpath = "//*[@id=\"rolesForm\"]/div[18]/div[1]/label/span[1]/input")
    private WebElement tier2CTCRange;

    @FindBy(xpath = "//input[@id='tierTwoMin']")
    private WebElement tier2MinRange;

    @FindBy(xpath = "//input[@id='tierTwoMax']")
    private WebElement tier2MaxRange;

    public WebElement getTier2CTCRange() {
        return tier2CTCRange;
    }

    public WebElement getTier2MinRange() {
        return tier2MinRange;
    }

    public WebElement getTier2MaxRange() {
        return tier2MaxRange;
    }

    public WebElement getTier3CTCRange() {
        return tier3CTCRange;
    }

    public WebElement getTier3MinRange() {
        return tier3MinRange;
    }

    public WebElement getTier3MaxRange() {
        return tier3MaxRange;
    }

    //tier 3 range
    @FindBy(xpath = "//*[@id=\"rolesForm\"]/div[19]/div[1]/label/span[1]/input")
    private WebElement tier3CTCRange;
    @FindBy(xpath = "//input[@id=\"tierThreeMin\"]")
    private WebElement tier3MinRange;
    @FindBy(xpath = "//input[@id=\"tierThreeMax\"]")
    private WebElement tier3MaxRange;

    public WebElement getRadiobuttonAnnually() {
        return radiobuttonAnnually;
    }

    public WebElement getRadiobuttonMonthly() {
        return radiobuttonMonthly;
    }

    public WebElement getRadiobuttonWeekly() {
        return radiobuttonWeekly;
    }

    public WebElement getRadiobuttonDaily() {
        return radiobuttonDaily;
    }

    public WebElement getRadiobuttonHourly() {
        return radiobuttonHourly;
    }

    @FindBy(xpath = "//input[@value=\"HOURLY\"]")
    private WebElement radiobuttonHourly;

    public WebElement getJobLocationAnywhere() {
        return jobLocationAnywhere;
    }

    @FindBy(xpath = "//input[@id='isAnyWhere']")
    private WebElement jobLocationAnywhere;

    public void radiobuttonAnnually() {
        click(getRadiobuttonAnnually());
    }

    public void radiobuttonMonthly() {
        click(getRadiobuttonMonthly());
    }

    public void radiobuttonWeekly() {
        click(getRadiobuttonWeekly());
    }

    public void radiobuttonDaily() {
        click(getRadiobuttonDaily());
    }

    public void radiobuttonHourly() {
        click(getRadiobuttonHourly());
    }

    public void differentCTCOfEachTier() {
        click(getDifferentCTCOfEachTier());
    }

    @FindBy(xpath = "(//input[@class=\"ant-select-selection-search-input\"])[4]")


    private WebElement jobLocation;


    @FindBy(xpath = "(//div[@class=\"ant-switch-handle\"])[2]")
    private WebElement allowHybrid;

    @FindBy(xpath = "//input[@id='hybridValue' or class='ant-input']")
    private WebElement wfoDays;


    public List<WebElement> getListOfWorkFromOffice() {
        return listOfWorkFromOffice;
    }

    @FindBy(xpath = "//div[@class='ant-select-item-option-content']")
    private List<WebElement> listOfWorkFromOffice;
    @FindBy(xpath = "//div[@name=\"Week\"]")
    private WebElement week;

    @FindBy(xpath = "//div[@name=\"Month\"]")
    private WebElement month;

    public WebElement getJobLocation() {
        return jobLocation;
    }

    public WebElement getAllowHybrid() {
        return allowHybrid;
    }

    public WebElement getWfoDays() {
        return wfoDays;
    }

    public WebElement getWeek() {
        return week;
    }

    public WebElement getMonth() {
        return month;
    }


    public WebElement getYear() {
        return year;
    }

    public WebElement getWorkFromOffice() {
        return workFromOffice;
    }

    @FindBy(xpath = "//div[@name=\"Year\"]")
    private WebElement year;

    public WebElement getOutside() {
        return outside;
    }

    @FindBy(xpath = "//div[@class='sc-eDvSVe sc-cPIbRQ dEWiNF esUDZh']")
    private WebElement outside;
    @FindBy(xpath = "//span[@class='ant-select-arrow']//parent::div[@class='ant-select ant-select-lg ant-select-in-form-item sc-cUEOzv jIOAnB ant-select-single ant-select-show-arrow']")
    private WebElement workFromOffice;


    public List<WebElement> getListOfJobLocation() {
        return listOfJobLocation;
    }

    @FindBy(xpath = "//div[@class=\"ant-select-item-option-content\"]")
    private List<WebElement> listOfJobLocation;


    public void ctcandJobLocation(String tier1MinRange, String tier1MaxRange, String jobLocation, String workFromOffice) throws InterruptedException, AWTException {
        scrolldown(getRadiobuttonAnnually());

        click(getRadiobuttonAnnually());
        sendkeys(getMinRange(), tier1MinRange);
        //sendkeys(getMaxRange(), tier1MaxRange);
        // click(getDifferentCTCOfEachTier());
        Thread.sleep(1000);
        click(getJobLocation());
        Thread.sleep(3000);
        sendkeys(getJobLocation(), jobLocation);
        Thread.sleep(3000);
        enterKey();


        Thread.sleep(1000);
        click(allowHybrid);
        Thread.sleep(1000);

        // if (!allowHybrid.isSelected()) {

        //       }

        click(getWfoDays());
        sendkeys(getWfoDays(), "10");
        click(getWorkFromOffice());
        Thread.sleep(1000);
        enterKey();

    }
}




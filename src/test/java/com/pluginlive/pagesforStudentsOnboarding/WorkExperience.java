package com.pluginlive.pagesforStudentsOnboarding;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class WorkExperience extends BaseClass {
    public WorkExperience() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    String bestperformancecertificate = readExcelData1("WorkExperience", 1, 15);


    public WebElement getSaveAndContinueButton() {
        return saveAndContinueButton;
    }

    @FindBy(xpath = "//button[@form=\"experienceForm\"]")
    private WebElement saveAndContinueButton;

    @FindBy(xpath = "//div[text()='Add Work Experience']")
    private WebElement addWorkExperiencebutton;

    @FindBy(xpath = "//input[@id=\"experience_0_title\"]")
    private WebElement experienceJobTitle;

    @FindBy(xpath = "//input[@id=\"rc_select_109\"]")
    private WebElement experienceCompanyName;

    @FindBy(xpath = "//input[@value=\"FULL_TIME\"]")
    private WebElement FulltimeJobType;

    @FindBy(xpath = "//input[@value=\"PART_TIME\"]")
    private WebElement ParttimeJobType;

    @FindBy(xpath = " //input[@id=\"rc_select_110\"]")
    private WebElement experienceStartMonth;

    @FindBy(xpath = " //input[@id=\"rc_select_111\"]")
    private WebElement experienceStartYear;

    @FindBy(xpath = "//input[@type=\"checkbox\"]")
    private WebElement experienceCheckboxCurrentlyWorking;

    @FindBy(xpath = "//input[@id=\"rc_select_112\"]")
    private WebElement experienceEndMonth;

    @FindBy(xpath = "//input[@id=\"rc_select_113\"]")
    private WebElement experienceEndYear;

    @FindBy(xpath = "//input[@id=\"rc_select_114\"]")
    private WebElement experienceFunction;

    @FindBy(xpath = "//input[@id=\"rc_select_115\"]")
    private WebElement experienceRole;

    @FindBy(xpath = "//input[@id=\"rc_select_116\"]")
    private WebElement experienceIndustry;

    @FindBy(xpath = "//div[@aria-label=\"Enter Your Description here...\"]")
    private WebElement experienceDescription;

    @FindBy(xpath = "//input[@id=\"rc_select_117\"]")
    private WebElement experienceSkills;

    @FindBy(xpath = "//div[text()='Add Awards']")
    private WebElement experienceAddAwards;

    @FindBy(xpath = "//input[@id=\"experience_0award+0_title\"]")
    private WebElement experienceAwardName;

    @FindBy(xpath = "//input[@placeholder=\"DD/MM/YYYY\"]")
    private WebElement experienceAwardReceivedDate;

    @FindBy(xpath = "(//div[@aria-label=\"Enter Your Description here...\"])[2]")
    private WebElement experienceAwardDescription;

    @FindBy(xpath = "//div[text()='Upload File']")
    private WebElement experienceAwardCertificateUpload;

    @FindBy(xpath = "//input[@id=\"rc_select_118\"]")
    private WebElement experienceNoticePeriod;

    @FindBy(xpath = "//input[@value=\"FULL_TIME\"]")
    private WebElement fulltime;

    @FindBy(xpath = "//input[@value=\"PART_TIME\"]")
    private WebElement parttime;

    public WebElement getFulltime() {
        return fulltime;
    }

    public WebElement getParttime() {
        return parttime;
    }

    public WebElement getExperienceNoticePeriod() {
        return experienceNoticePeriod;
    }

    public WebElement getAddWorkExperiencebutton() {
        return addWorkExperiencebutton;
    }

    public WebElement getExperienceJobTitle() {
        return experienceJobTitle;
    }

    public WebElement getExperienceCompanyName() {
        return experienceCompanyName;
    }

    public WebElement getFulltimeJobType() {
        return FulltimeJobType;
    }

    public WebElement getParttimeJobType() {
        return ParttimeJobType;
    }

    public WebElement getExperienceStartMonth() {
        return experienceStartMonth;
    }

    public WebElement getExperienceStartYear() {
        return experienceStartYear;
    }

    public WebElement getExperienceCheckboxCurrentlyWorking() {
        return experienceCheckboxCurrentlyWorking;
    }

    public WebElement getExperienceEndMonth() {
        return experienceEndMonth;
    }

    public WebElement getExperienceEndYear() {
        return experienceEndYear;
    }

    public WebElement getExperienceFunction() {
        return experienceFunction;
    }

    public WebElement getExperienceRole() {
        return experienceRole;
    }

    public WebElement getExperienceIndustry() {
        return experienceIndustry;
    }

    public WebElement getExperienceDescription() {
        return experienceDescription;
    }

    public WebElement getExperienceSkills() {
        return experienceSkills;
    }

    public WebElement getExperienceAddAwards() {
        return experienceAddAwards;
    }

    public WebElement getExperienceAwardName() {
        return experienceAwardName;
    }

    public WebElement getExperienceAwardReceivedDate() {
        return experienceAwardReceivedDate;
    }

    public WebElement getExperienceAwardDescription() {
        return experienceAwardDescription;
    }

    public WebElement getExperienceAwardCertificateUpload() {
        return experienceAwardCertificateUpload;
    }

    @FindBy(xpath = "//div[@class=\"sc-epfObs fbkGOY\"]")
    private WebElement clickOutside;

    public WebElement getClickOutside() {
        return clickOutside;
    }

    public void workexperience() throws InterruptedException {

        Thread.sleep(3000);
        click(getSaveAndContinueButton());

    }

    public void experienceandaward(String Jobtitle, String Companyname, String Startmonth, String Startyear, String Noticeperiod, String Function, String Role, String Industry, String Description, String Skill1, String Skill2, String Skill3, String Awardname, String AwardReceivedname, String AwardDescription, String workbestperformancecertificate) throws InterruptedException, AWTException {
        Thread.sleep(2000);
        click(getAddWorkExperiencebutton());
        Thread.sleep(2000);
        sendkeys(getExperienceJobTitle(), Jobtitle);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(1000);
        sendkeys(getExperienceCompanyName(), Companyname);
        Thread.sleep(3000);
        enterKey();
        Thread.sleep(1000);
        click(getFulltimeJobType());
        Thread.sleep(1000);
        sendkeys(getExperienceStartMonth(), Startmonth);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(1000);
        sendkeys(getExperienceStartYear(), Startyear);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        click(getExperienceCheckboxCurrentlyWorking());
        Thread.sleep(1000);
        sendkeys(getExperienceNoticePeriod(), Noticeperiod);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getExperienceFunction(), Function);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getExperienceRole(), Role);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getExperienceIndustry(), Industry);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getExperienceDescription(), Description);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getExperienceSkills(), Skill1);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getExperienceSkills(), Skill2);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getExperienceSkills(), Skill3);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        scrolldown(getExperienceAddAwards());
        Thread.sleep(2000);
        click(getExperienceAddAwards());
        Thread.sleep(2000);
        sendkeys(getExperienceAwardName(), Awardname);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getExperienceAwardReceivedDate(), AwardReceivedname);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getExperienceAwardDescription(), AwardDescription);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        click(getExperienceAwardCertificateUpload());
        Thread.sleep(1000);
        StringSelection ss = new StringSelection(bestperformancecertificate);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Robot r = new Robot();
        r.delay(1000);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.delay(1000);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.delay(1000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        enterKey();


    }


}

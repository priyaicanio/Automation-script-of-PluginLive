package com.pluginlive.pagesforBulkStudentsOnboarding;

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

    @FindBy(xpath = "//input[@id=\"experience_1_title\"]")
    private WebElement experienceJobTitle;

    @FindBy(xpath = "//input[@id=\"rc_select_50\"]")
    private WebElement experienceCompanyName;

    @FindBy(xpath = "//input[@value=\"FULL_TIME\"]")
    private WebElement FulltimeJobType;

    @FindBy(xpath = "//input[@value=\"PART_TIME\"]")
    private WebElement ParttimeJobType;

    @FindBy(xpath = " //input[@id=\"rc_select_51\"]")
    private WebElement experienceStartMonth;

    @FindBy(xpath = " //input[@id=\"rc_select_52\"]")
    private WebElement experienceStartYear;

    @FindBy(xpath = "//input[@type=\"checkbox\"]")
    private WebElement experienceCheckboxCurrentlyWorking;

    @FindBy(xpath = "//input[@id=\"rc_select_53\"]")
    private WebElement experienceEndMonth;

    @FindBy(xpath = "//input[@id=\"rc_select_54\"]")
    private WebElement experienceEndYear;

    @FindBy(xpath = "//input[@id=\"rc_select_55\"]")
    private WebElement experienceFunction;

    @FindBy(xpath = "//input[@id=\"rc_select_56\"]")
    private WebElement experienceRole;

    @FindBy(xpath = "//input[@id=\"rc_select_57\"]")
    private WebElement experienceIndustry;

    @FindBy(xpath = "//div[@aria-label=\"Enter Your Description here...\"]")
    private WebElement experienceDescription;

    @FindBy(xpath = "//input[@id=\"rc_select_58\"]")
    private WebElement experienceSkills;

    @FindBy(xpath = "//div[text()='Add Awards']")
    private WebElement experienceAddAwards;

    @FindBy(xpath = "//input[@id=\"experience_1award+0_title\"]")
    private WebElement experienceAwardName;

    @FindBy(xpath = "//input[@placeholder=\"DD/MM/YYYY\"]")
    private WebElement experienceAwardReceivedDate;

    @FindBy(xpath = "(//div[@aria-label=\"Enter Your Description here...\"])[2]")
    private WebElement experienceAwardDescription;

    @FindBy(xpath = "//div[text()='Upload File']")
    private WebElement experienceAwardCertificateUpload;

    @FindBy(xpath = "//input[@id=\"rc_select_59\"]")
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

    public void experienceandaward(String workJobtitle, String workCompanyname, String workStartmonth, String workStartyear, String workNoticeperiod, String workFunction, String workRole, String workIndustry, String workDescription, String workSkill1, String workSkill2, String workSkill3, String workAwardname, String workAwardReceivedname, String workAwardDescription, String workbestperformancecertificate) throws InterruptedException, AWTException {
        Thread.sleep(2000);
        click(getAddWorkExperiencebutton());
        Thread.sleep(2000);
        sendkeys(getExperienceJobTitle(), workJobtitle);
        Thread.sleep(1000);
        sendkeys(getExperienceCompanyName(), workCompanyname);
        Thread.sleep(3000);
        enterKey();
        Thread.sleep(1000);
        click(getFulltimeJobType());
        Thread.sleep(1000);
        sendkeys(getExperienceStartMonth(), workStartmonth);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(1000);
        sendkeys(getExperienceStartYear(), workStartyear);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        click(getExperienceCheckboxCurrentlyWorking());
        Thread.sleep(1000);
        sendkeys(getExperienceNoticePeriod(), workNoticeperiod);
        Thread.sleep(1000);
        sendkeys(getExperienceFunction(), workFunction);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getExperienceRole(), workRole);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getExperienceIndustry(), workIndustry);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getExperienceDescription(), workDescription);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getExperienceSkills(), workSkill1);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getExperienceSkills(), workSkill2);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getExperienceSkills(), workSkill3);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
scrolldown(getExperienceAddAwards());
Thread.sleep(2000);
               click(getExperienceAddAwards());
        Thread.sleep(2000);
        sendkeys(getExperienceAwardName(), workAwardname);
        Thread.sleep(1000);
        Thread.sleep(2000);
        sendkeys(getExperienceAwardReceivedDate(), workAwardReceivedname);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getExperienceAwardDescription(), workAwardDescription);
        Thread.sleep(1000);
        Thread.sleep(2000);
        click(getExperienceAwardCertificateUpload());
        Thread.sleep(1000);
        StringSelection ss = new StringSelection(workbestperformancecertificate);
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

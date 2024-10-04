package com.pluginlive.pagesforBulkStudentsOnboarding;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class ProjectAndInternship extends BaseClass {


    public ProjectAndInternship() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    public WebElement getSaveAndContinueButton() {
        return saveAndContinueButton;
    }

    String certificateimg = readExcelData1("ProjectandInternship", 1, 15);
    String internshipcertificate = readExcelData1("ProjectandInternship", 1, 30);

    @FindBy(xpath = "//div[text()='Save & Continue']")
    private WebElement saveAndContinueButton;

    // Add project
    @FindBy(xpath = "//div[text()='Add Project']")
    private WebElement addProject;

    @FindBy(xpath = "//input[@id=\"rc_select_32\"]")
    private WebElement companyName;

    @FindBy(xpath = "//input[@id=\"project_1_title\"]")
    private WebElement projectTitle;

    @FindBy(xpath = "//input[@id=\"rc_select_33\"]")
    private WebElement startMonth;

    @FindBy(xpath = "//input[@id=\"rc_select_34\"]")
    private WebElement startYear;

    @FindBy(xpath = "//input[@id=\"rc_select_35\"]")
    private WebElement endMOnth;

    @FindBy(xpath = "//input[@id=\"rc_select_36\"]")
    private WebElement endYear;

    @FindBy(xpath = "//input[@id=\"rc_select_37\"]")
    private WebElement function;

    @FindBy(xpath = "//input[@id=\"rc_select_38\"]")
    private WebElement role;

    @FindBy(xpath = "//input[@id=\"rc_select_39\"]")
    private WebElement industry;

    @FindBy(xpath = "//div[@aria-label=\"Enter Your Description here...\"]")
    private WebElement description;

    @FindBy(xpath = "//div[@class=\"ant-select-selection-overflow\"]")
    private WebElement skillsGained;
    @FindBy(xpath = "//input[@id=\"rc_select_40\"]")
    private WebElement skillsGainedValue;

    public WebElement getSkillsGainedValue() {
        return skillsGainedValue;
    }

    @FindBy(xpath = "//div[text()='Upload File']")
    private WebElement upload;

    public WebElement getAddProject() {
        return addProject;
    }

    public WebElement getCompanyName() {
        return companyName;
    }

    public WebElement getProjectTitle() {
        return projectTitle;
    }

    public WebElement getStartMonth() {
        return startMonth;
    }

    public WebElement getStartYear() {
        return startYear;
    }

    public WebElement getEndMOnth() {
        return endMOnth;
    }

    public WebElement getEndYear() {
        return endYear;
    }

    public WebElement getFunction() {
        return function;
    }

    public WebElement getRole() {
        return role;
    }

    public WebElement getIndustry() {
        return industry;
    }

    public WebElement getDescription() {
        return description;
    }

    public WebElement getSkillsGained() {
        return skillsGained;
    }

    public WebElement getUpload() {
        return upload;
    }

    // Add Internship
    @FindBy(xpath = "//div[text()='Add internship']")
    private WebElement addinternship;

    @FindBy(xpath = "//input[@id=\"rc_select_41\"]")
    private WebElement interncompanyName;

    @FindBy(xpath = "//input[@id=\"rc_select_42\"]")
    private WebElement internstartMonth;

    @FindBy(xpath = "//input[@id=\"rc_select_43\"]")
    private WebElement internStartYear;

    @FindBy(xpath = "//input[@id=\"rc_select_44\"]")
    private WebElement internEndMonth;

    @FindBy(xpath = "//input[@id=\"rc_select_45\"]")
    private WebElement internEndYear;

    @FindBy(xpath = "//input[@id=\"rc_select_46\"]")
    private WebElement internFunction;

    @FindBy(xpath = "//input[@id=\"rc_select_47\"]")
    private WebElement internRole;

    @FindBy(xpath = "//input[@id=\"rc_select_48\"]")
    private WebElement internIndustry;

    @FindBy(xpath = "(//div[@aria-label=\"Enter Your Description here...\"])[2]")
    private WebElement internDescription;
    @FindBy(xpath = "//div[@class=\"ant-select-selection-overflow\"]")
    private WebElement outsideclick;

    public WebElement getOutsideclick() {
        return outsideclick;
    }

    @FindBy(xpath = "//span[text() ='Eg.React.js']")
    private WebElement internSkills;

    @FindBy(xpath = "//div[text()='Upload File']")
    private WebElement internUpload;
    @FindBy(xpath = "//input[@id='rc_select_49']")
    private WebElement internshipSkillvalue;


    @FindBy(xpath = "//div[text()='Update']")
    private WebElement internshipUpdatebutton;

    public WebElement getInternOutside() {
        return internOutside;
    }

    @FindBy(xpath = "//div[@class=\"sc-aXZVg sc-fDpJdc kcDXFM eeIjhl\"]")
    private WebElement internOutside;

    public WebElement getAddinternship() {
        return addinternship;
    }

    public WebElement getInterncompanyName() {
        return interncompanyName;
    }

    public WebElement getInternstartMonth() {
        return internstartMonth;
    }

    public WebElement getInternStartYear() {
        return internStartYear;
    }

    public WebElement getInternEndMonth() {
        return internEndMonth;
    }

    public WebElement getInternEndYear() {
        return internEndYear;
    }

    public WebElement getInternFunction() {
        return internFunction;
    }

    public WebElement getInternRole() {
        return internRole;
    }

    public WebElement getInternIndustry() {
        return internIndustry;
    }

    public WebElement getInternDescription() {
        return internDescription;
    }

    public WebElement getInternSkills() {
        return internSkills;
    }

    public WebElement getInternUpload() {
        return internUpload;
    }

    public WebElement getInternshipSkillvalue() {
        return internshipSkillvalue;
    }

    public WebElement getInternshipUpdatebutton() {
        return internshipUpdatebutton;
    }

    public void addproject(String company, String projectTitle, String startMonth, String startYear, String endMOnth, String endYear, String function, String role, String industry, String description, String skill1, String skill2, String skill3, String skill4, String skill5, String projectcertificate) throws InterruptedException, AWTException {
        Thread.sleep(2000);
        click(getAddProject());
        Thread.sleep(3000);
        sendkeys(getCompanyName(), company);
        Thread.sleep(3000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getProjectTitle(), projectTitle);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getStartMonth(), startMonth);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getStartYear(), startYear);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getEndMOnth(), endMOnth);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getEndYear(), endYear);
        Thread.sleep(2000);
        enterKey();

        Thread.sleep(2000);
        sendkeys(getFunction(), function);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getRole(), role);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getIndustry(), industry);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getDescription(), description);
        Thread.sleep(5000);
        scrolldown(getSkillsGained());
        click(getSkillsGained());
        sendkeys(getSkillsGainedValue(), skill1);
        Thread.sleep(1000);
        enterKey();
        sendkeys(getSkillsGainedValue(), skill2);
        Thread.sleep(1000);
        enterKey();
        sendkeys(getSkillsGainedValue(), skill3);
        Thread.sleep(2000);
        enterKey();
        sendkeys(getSkillsGainedValue(), skill4);
        Thread.sleep(2000);
        enterKey();
        sendkeys(getSkillsGainedValue(), skill5);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(1000);
scrolldown(getUpload());
        Thread.sleep(1000);
        click(getUpload());
        Thread.sleep(2000);
        StringSelection ss = new StringSelection(certificateimg);
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


    public void addInternship(String interncompany, String internstartMonth, String internstartYear, String internendMOnth, String internendYear, String internfunction, String internrole, String internindustry, String interndescription, String internskill1, String internskill2, String internskill3, String internskill4, String internskill5, String interncertificate) throws InterruptedException, AWTException {
        scrolldown(getAddinternship());
        Thread.sleep(2000);
        click(getAddinternship());
        Thread.sleep(3000);
        sendkeys(getInterncompanyName(), interncompany);
        Thread.sleep(4000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getInternstartMonth(), internstartMonth);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getInternStartYear(), internstartYear);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getInternEndMonth(), internendMOnth);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getInternEndYear(), internendYear);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getInternFunction(), internfunction);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getInternRole(), internrole);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getInternIndustry(), internindustry);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getInternDescription(), interndescription);
        Thread.sleep(5000);
        scrolldown(getInternSkills());
        click(getInternshipSkillvalue());
        sendkeys(getInternshipSkillvalue(), internskill1);
        Thread.sleep(1000);
        enterKey();
        sendkeys(getInternshipSkillvalue(), internskill2);
        Thread.sleep(1000);
        enterKey();
        sendkeys(getInternshipSkillvalue(), internskill3);
        Thread.sleep(2000);
        enterKey();
        sendkeys(getInternshipSkillvalue(), internskill4);
        Thread.sleep(2000);
        enterKey();
        sendkeys(getInternshipSkillvalue(), internskill5);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(1000);
scrolldown(getInternUpload());
Thread.sleep(2000);

        click(getInternUpload());
        Thread.sleep(2000);
        StringSelection ss = new StringSelection(internshipcertificate);
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


    public void projectandinternship() throws InterruptedException {
        Thread.sleep(2000);
        click(getSaveAndContinueButton());
    }


}

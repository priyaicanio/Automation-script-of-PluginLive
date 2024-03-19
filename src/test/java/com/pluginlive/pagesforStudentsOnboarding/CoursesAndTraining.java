package com.pluginlive.pagesforStudentsOnboarding;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class CoursesAndTraining extends BaseClass {
    public CoursesAndTraining() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }


    String CourseCertificate = readExcelData1("CoursesAndTraining", 1, 10);

    public WebElement getSaveAndContinueButton() {
        return saveAndContinueButton;
    }

    @FindBy(xpath = "//button[@form=\"courseForm\"]")
    private WebElement saveAndContinueButton;

    @FindBy(xpath = "//div[text()='Add Courses & Training']")
    private WebElement addCoursesandTrainingButton;

    @FindBy(xpath = "//input[@id=\"course_0_organization\"]")
    private WebElement institutename;

    @FindBy(xpath = "//input[@id=\"rc_select_124\"]")
    private WebElement courseStartMonth;

    @FindBy(xpath = "//input[@id=\"rc_select_125\"]")
    private WebElement courseStartYear;

    @FindBy(xpath = "//input[@id=\"rc_select_126\"]")
    private WebElement courseEndMonth;

    @FindBy(xpath = "//input[@id=\"rc_select_127\"]")
    private WebElement courseEndYear;

    @FindBy(xpath = "//input[@id=\"course_0_title\"]")
    private WebElement CourseName;

    @FindBy(xpath = "//div[@aria-label=\"Enter Your Description here...\"]")
    private WebElement CourseDescription;

    @FindBy(xpath = "//input[@id=\"rc_select_128\"]")
    private WebElement CourseSkills;

    @FindBy(xpath = "//div[text()='Upload File']")
    private WebElement CourseCertificateUpload;

    @FindBy(xpath = "//div[@class=\"sc-epfObs fbkGOY\"]")
    private WebElement clickOutside;

    public WebElement getAddCoursesandTrainingButton() {
        return addCoursesandTrainingButton;
    }

    public WebElement getInstitutename() {
        return institutename;
    }

    public WebElement getCourseStartMonth() {
        return courseStartMonth;
    }

    public WebElement getCourseStartYear() {
        return courseStartYear;
    }

    public WebElement getCourseEndMonth() {
        return courseEndMonth;
    }

    public WebElement getCourseEndYear() {
        return courseEndYear;
    }

    public WebElement getCourseName() {
        return CourseName;
    }

    public WebElement getCourseDescription() {
        return CourseDescription;
    }

    public WebElement getCourseSkills() {
        return CourseSkills;
    }

    public WebElement getCourseCertificateUpload() {
        return CourseCertificateUpload;
    }

    public WebElement getClickOutside() {
        return clickOutside;
    }

    public void coursesandtraining() throws InterruptedException {
        Thread.sleep(3000);
        click(getSaveAndContinueButton());
    }

    public void addcourseandtraining(String instituteName, String Coursestartmonth, String Coursestartyear, String Courseendmonth, String Courseendyear, String CourseName, String CourseDescription, String skill1, String skill2, String skill3, String courseCertificate) throws InterruptedException, AWTException {
        Thread.sleep(2000);
        click(getAddCoursesandTrainingButton());
        sendkeys(getInstitutename(), instituteName);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(1000);
        sendkeys(getCourseStartMonth(), Coursestartmonth);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(1000);
        sendkeys(getCourseStartYear(), Coursestartyear);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(1000);
        sendkeys(getCourseEndMonth(), Courseendmonth);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(1000);
        sendkeys(getCourseEndYear(), Courseendyear);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(1000);
        sendkeys(getCourseName(), CourseName);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(1000);
        sendkeys(getCourseDescription(), CourseDescription);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(1000);
        sendkeys(getCourseSkills(), skill1);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(1000);
        sendkeys(getCourseSkills(), skill2);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(1000);
        sendkeys(getCourseSkills(), skill3);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(2000);
        scrolldown(getCourseCertificateUpload());
        Thread.sleep(2000);
        click(getCourseCertificateUpload());
        Thread.sleep(2000);
        StringSelection ss = new StringSelection(CourseCertificate);
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

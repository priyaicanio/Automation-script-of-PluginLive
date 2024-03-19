package com.pluginlive.pagesforBulkStudentsOnboarding;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class EducationalDetails extends BaseClass {

    public EducationalDetails() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    String tenthMarksheetimg = "C:\\Users\\ICANIO-10090\\Pictures\\10th Marksheet.jpg";
    String twelfthMarksheetimg = "C:\\Users\\ICANIO-10090\\Pictures\\12th Marksheet.jpg";
    @FindBy(xpath = "//input[@id=\"tenth_institutionName\"]")
    private WebElement tenthschoolname;
    @FindBy(xpath = "//input[@id=\"rc_select_8\"]")
    private WebElement tenthboard;

    @FindBy(xpath = "//input[@id=\"rc_select_9\"]")
    private WebElement tenthmonth;
    @FindBy(xpath = "//input[@id=\"rc_select_10\"]")
    private WebElement tenthYear;
    @FindBy(xpath = "//input[@id=\"tenth_marks\"]")
    private WebElement tenthpercentage;

    @FindBy(xpath = "//input[@id=\"rc_select_11\"]")
    private WebElement tenthState;

    @FindBy(xpath = "//input[@id=\"rc_select_12\"]")
    private WebElement tenthCity;

    public WebElement getTenthschoolname() {
        return tenthschoolname;
    }

    public WebElement getTenthboard() {
        return tenthboard;
    }

    public WebElement getTenthmonth() {
        return tenthmonth;
    }

    public WebElement getTenthYear() {
        return tenthYear;
    }

    public WebElement getTenthpercentage() {
        return tenthpercentage;
    }

    public WebElement getTenthState() {
        return tenthState;
    }

    public WebElement getTenthCity() {
        return tenthCity;
    }

    public WebElement getTenthMarksheetUpload() {
        return tenthMarksheetUpload;
    }

    @FindBy(xpath = "(//div[text()='Upload File'])[1]")
    private WebElement tenthMarksheetUpload;


    @FindBy(xpath = "//input[@id=\"twelfth_institutionName\"]")
    private WebElement twelfthSchlName;
    @FindBy(xpath = "//input[@id=\"rc_select_13\"]")
    private WebElement twelfthboard;

    @FindBy(xpath = "//input[@id=\"rc_select_14\"]")
    private WebElement twelfthMonth;

    @FindBy(xpath = "//input[@id=\"rc_select_15\"]")
    private WebElement twelfthYear;

    @FindBy(xpath = "//input[@id=\"twelfth_marks\"]")
    private WebElement twefthPercentage;

    @FindBy(xpath = "//input[@id=\"rc_select_16\"]")
    private WebElement twelfthSkills;
    @FindBy(xpath = "//input[@id=\"rc_select_17\"]")
    private WebElement twelfthState;
    @FindBy(xpath = "//input[@id=\"rc_select_18\"]")
    private WebElement twefthCity;
    @FindBy(xpath = "//div[text()='Upload File']")
    private WebElement twelfthUpload;

    public String getTenthMarksheetimg() {
        return tenthMarksheetimg;
    }

    public WebElement getTwelfthSchlName() {
        return twelfthSchlName;
    }

    public WebElement getTwelfthboard() {
        return twelfthboard;
    }

    public WebElement getTwelfthMonth() {
        return twelfthMonth;
    }

    public WebElement getTwelfthYear() {
        return twelfthYear;
    }

    public WebElement getTwefthPercentage() {
        return twefthPercentage;
    }

    public WebElement getTwelfthSkills() {
        return twelfthSkills;
    }

    public WebElement getTwelfthState() {
        return twelfthState;
    }

    public WebElement getTwefthCity() {
        return twefthCity;
    }

    public WebElement getTwelfthUpload() {
        return twelfthUpload;
    }

    public WebElement getUgPercentage() {
        return ugPercentage;
    }

    @FindBy(xpath = "//input[@id=\"ug_0_averageMarks\"]")
    private WebElement ugPercentage;
    @FindBy(xpath = "//input[@id=\"rc_select_30\"]")
    private WebElement ugskills;

    public WebElement getUgskills() {
        return ugskills;
    }

    public WebElement getSaveAndSubmitButton() {
        return saveAndSubmitButton;
    }

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement saveAndSubmitButton;
    @FindBy(xpath = "//div[@class=\"sc-epfObs fbkGOY\"]")
    private WebElement ugoutsideclick;

    public WebElement getUgoutsideclick() {
        return ugoutsideclick;
    }

    public void tenth(String schlname, String Board, String month, String year, String percentage, String state, String city) throws InterruptedException, AWTException {
        Thread.sleep(3000);
        visibilityOf(getTenthschoolname());

        click(getTenthschoolname());
        sendkeys(getTenthschoolname(), schlname);
        Thread.sleep(2000);
        sendkeys(getTenthboard(), Board);
        Thread.sleep(2000);
        sendkeys(getTenthmonth(), month);
        Thread.sleep(2000);
        enterKey();
        sendkeys(getTenthYear(), year);
        Thread.sleep(2000);
        enterKey();
        click(getTenthpercentage());
        selectall();
        Thread.sleep(2000);
        sendkeys(getTenthpercentage(), percentage);
        Thread.sleep(2000);
        sendkeys(getTenthState(), state);
        Thread.sleep(4000);
        enterKey();
        sendkeys(getTenthCity(), city);
        Thread.sleep(4000);
        enterKey();
        click(getTenthMarksheetUpload());
        Thread.sleep(2000);
        StringSelection ss = new StringSelection(tenthMarksheetimg);
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


    public void twelfth(String twelfthSchool, String twelfthBoard, String twelfthmonth, String twelfthyear, String twelfthpercentage, String twelfthSkills, String twelfthstate, String twelfthcity) throws InterruptedException, AWTException {
        Thread.sleep(2000);
        click(getTwelfthSchlName());
        sendkeys(getTwelfthSchlName(), twelfthSchool);
        Thread.sleep(2000);
        sendkeys(getTwelfthboard(), twelfthBoard);
        Thread.sleep(2000);
        sendkeys(getTwelfthMonth(), twelfthmonth);
        Thread.sleep(1000);
        enterKey();
        sendkeys(getTwelfthYear(), twelfthyear);
        Thread.sleep(1000);
        enterKey();
        click(getTwefthPercentage());
        selectall();
        Thread.sleep(1000);
        sendkeys(getTwefthPercentage(), twelfthpercentage);
        Thread.sleep(1000);
        sendkeys(getTwelfthSkills(), twelfthSkills);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(1000);
        sendkeys(getTwelfthState(), twelfthstate);
        Thread.sleep(4000);
        enterKey();
        sendkeys(getTwefthCity(), twelfthcity);
        Thread.sleep(5000);
        enterKey();
        click(getTwelfthUpload());
        Thread.sleep(2000);
        StringSelection ss = new StringSelection(twelfthMarksheetimg);
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

    public void ug(String ugskill1, String ugskill2, String ugskill3, String ugpercentage) throws AWTException, InterruptedException {


        scrolldown(getUgPercentage());

        click(getUgPercentage());
        selectall();
        Thread.sleep(1000);
        sendkeys(getUgPercentage(), ugpercentage);
        Thread.sleep(1000);
        sendkeys(getUgskills(), ugskill1);
        Thread.sleep(1000);
        enterKey();
        sendkeys(getUgskills(), ugskill2);
        Thread.sleep(1000);
        enterKey();
        sendkeys(getUgskills(), ugskill3);
        Thread.sleep(1000);
        enterKey();
        Thread.sleep(2000);
        scrolldown(getSaveAndSubmitButton());
        click(getSaveAndSubmitButton());

    }

    public void clickandcontinue() throws InterruptedException {
        Thread.sleep(2000);
        click(getSaveAndSubmitButton());
    }


}

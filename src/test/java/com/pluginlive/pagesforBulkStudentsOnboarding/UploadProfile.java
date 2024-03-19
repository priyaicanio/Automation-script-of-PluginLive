package com.pluginlive.pagesforBulkStudentsOnboarding;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class UploadProfile extends BaseClass {

    public UploadProfile() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    String profilepic = readExcelData1("BulkStudentOnboarding", 1, 18);


    public WebElement getUploadPhoto() {
        return uploadPhoto;
    }

    @FindBy(xpath = "//div[text()='Upload Photo *']")
    private WebElement uploadPhotoMandatory;
    @FindBy(xpath = "//div[text()='Upload Photo']")
    private WebElement uploadPhoto;

    public WebElement getUploadPhotoMandatory() {
        return uploadPhotoMandatory;
    }

    @FindBy(xpath = "//div[text()='Save and Continue']")
    private WebElement saveandcontinueButton;

    public WebElement getSaveandcontinueButton() {
        return saveandcontinueButton;
    }

    public void uploadphoto() throws InterruptedException, AWTException {
       click(getUploadPhotoMandatory());
       Thread.sleep(1000);
        click(getUploadPhoto());
        Thread.sleep(2000);
        StringSelection ss = new StringSelection(profilepic);
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
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(2000);
        visibilityOf(getSaveandcontinueButton());
        click(getSaveandcontinueButton());


    }


}

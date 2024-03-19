package com.pluginlive.pagesforStudentsOnboarding;

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

    String profilepic = readExcelData1("PersonalDetails", 1, 1);


    public WebElement getUploadPhoto() {
        return uploadPhoto;
    }

    @FindBy(xpath = "//div[text()='Upload Photo *']")
    private WebElement uploadPhoto;

    @FindBy(xpath = "//div[text()='Save and Continue']")
    private WebElement saveandcontinueButton;

    public WebElement getSaveandcontinueButton() {
        return saveandcontinueButton;
    }

    public void uploadphoto() throws InterruptedException, AWTException {
        click(getUploadPhoto());
        Thread.sleep(3000);
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
        Thread.sleep(1000);
        click(getSaveandcontinueButton());


    }


}

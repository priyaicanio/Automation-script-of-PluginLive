package com.pluginlive.pagesforStudentsOnboarding;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.webaudio.model.BaseAudioContext;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class UploadResume extends BaseClass {
    public UploadResume() throws IOException {
        PageFactory.initElements(driver, this);
    }

    String resumefile = readExcelData1("UploadResume", 1, 0);

    @FindBy(xpath = "//div[text()='Upload File']")
    private WebElement uploadResume;

    @FindBy(xpath = "//div[text()='Save and Continue']")
    private WebElement saveAndcontinue;

    public WebElement getUploadResume() {
        return uploadResume;
    }

    public WebElement getSaveAndcontinue() {
        return saveAndcontinue;
    }

    public void resume() throws InterruptedException, AWTException {
        click((getUploadResume()));
        Thread.sleep(2000);
        StringSelection ss1 = new StringSelection(resumefile);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
        Robot r1 = new Robot();
        r1.delay(1000);
        r1.keyPress(KeyEvent.VK_CONTROL);
        r1.keyPress(KeyEvent.VK_V);
        r1.delay(1000);
        r1.keyRelease(KeyEvent.VK_CONTROL);
        r1.keyRelease(KeyEvent.VK_V);
        r1.delay(1000);
        r1.keyPress(KeyEvent.VK_ENTER);
        r1.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        enterKey();

        Thread.sleep(2000);
        click(getSaveAndcontinue());
    }


}

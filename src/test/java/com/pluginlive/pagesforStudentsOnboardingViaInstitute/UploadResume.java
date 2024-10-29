package com.pluginlive.pagesforStudentsOnboardingViaInstitute;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;

public class UploadResume extends BaseClass {
    public UploadResume() throws IOException {
        super();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[text()='Upload File']")
    private WebElement uploadResume;

    @FindBy(xpath = "//div[text()='Skip']")
    private WebElement Skip;

    public WebElement getSkip() {
        return Skip;
    }

    @FindBy (xpath = "//div[text()='Save and Continue']")
    private WebElement saveAndcontinue;

    public WebElement getUploadResume() {
        return uploadResume;
    }

    public WebElement getSaveAndcontinue() {
        return saveAndcontinue;
    }

    public void resume() throws InterruptedException, AWTException {
        Thread.sleep(1000);
        click(getSkip());
    }




}

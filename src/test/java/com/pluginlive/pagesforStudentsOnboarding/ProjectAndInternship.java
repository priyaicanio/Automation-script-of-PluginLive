package com.pluginlive.pagesforStudentsOnboarding;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ProjectAndInternship extends BaseClass {


    public ProjectAndInternship() throws IOException {
        super();
        PageFactory.initElements(driver,this);
    }

    public WebElement getSaveAndContinueButton() {
        return saveAndContinueButton;
    }

    @FindBy (xpath = "//div[text()='Save & Continue']")
    private WebElement saveAndContinueButton;

    public void projectandinternship() throws InterruptedException {
        Thread.sleep(2000);
        click(getSaveAndContinueButton());
    }




}

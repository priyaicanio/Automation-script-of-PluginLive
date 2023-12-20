package com.pluginlive.pagesforStudentsOnboarding;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class WorkExperience extends BaseClass {
    public WorkExperience() throws IOException {
        super();
        PageFactory.initElements(driver,this);
    }

    public WebElement getSaveAndContinueButton() {
        return saveAndContinueButton;
    }

    @FindBy (xpath = "//button[@form=\"experienceForm\"]")
    private WebElement saveAndContinueButton;

   public void workexperience() throws InterruptedException {

       Thread.sleep(3000);
       click(getSaveAndContinueButton());

   }





}

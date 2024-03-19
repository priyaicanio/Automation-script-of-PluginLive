package com.pluginlive.pagesforBulkStudentRoleAccepting;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class QuestionnairePage extends BaseClass {
    public QuestionnairePage() throws IOException {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@value=\"Yes\"]")
    private WebElement yesOption;

    @FindBy(xpath = "//input[@value=\"No\"]")
    private WebElement noOption;

    @FindBy(xpath = "//div[text()='Finish']")
    private WebElement finishButton;

    public WebElement getYesOption() {
        return yesOption;
    }

    public WebElement getNoOption() {
        return noOption;
    }

    public WebElement getFinishButton() {
        return finishButton;
    }

    public void questionnaire() throws InterruptedException {
        implicitywait();
        Thread.sleep(2000);
        click(getYesOption());
        Thread.sleep(2000);
        click(getFinishButton());


    }

}

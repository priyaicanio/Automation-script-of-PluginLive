package com.pluginlive.pagesforBulkCorporateRoleCreation;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class QuestionnairePage extends BaseClass {

    public QuestionnairePage() throws IOException {
        super();
        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "(//button[@class=\"ant-btn ant-btn-secondary sc-ftTHYK kQoyeN\"])[2]")
    private WebElement addCustomQuestion;

    @FindBy(xpath = "(//div[@class=\"public-DraftStyleDefault-block public-DraftStyleDefault-ltr\"])[2]")
    private WebElement typeQuestion;


    @FindBy(xpath = "(//div[@class=\"ant-switch-handle\"])[4]")
    private WebElement multipleAnswer;

    @FindBy(xpath = "(//div[@class=\"ant-switch-handle\"])[5]")
    private WebElement mandatory;

    @FindBy(xpath = "(//div[@class=\"ant-switch-handle\"])[6]")
    private WebElement mixUpTheOption;

    @FindBy(xpath = "//input[@id=\"answer_0\"]")
    private WebElement option1;

    public WebElement getAddCustomQuestion() {
        return addCustomQuestion;
    }

    public WebElement getTypeQuestion() {
        return typeQuestion;
    }

    public WebElement getMultipleAnswer() {
        return multipleAnswer;
    }

    public WebElement getMandatory() {
        return mandatory;
    }

    public WebElement getMixUpTheOption() {
        return mixUpTheOption;
    }

    public WebElement getOption1() {
        return option1;
    }

    public WebElement getOption2() {
        return option2;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getAddOptionButton() {
        return addOptionButton;
    }

    @FindBy(xpath = "//input[@id=\"answer_1\"]")
    private WebElement option2;

    @FindBy(xpath = "//button[@form=\"addNewQuestion\"]")
    private WebElement saveButton;

    @FindBy(xpath = "//button[@fdprocessedid=\"0re7yj\"]")
    private WebElement addOptionButton;

    public WebElement getMakeCorrectforOption1() {
        return makeCorrectforOption1;
    }

    @FindBy(xpath = "(//button[@class=\"ant-btn ant-btn-text ant-btn-icon-only\"])[1]")
    private WebElement makeCorrectforOption1;

    @FindBy(xpath = "(//button[@class=\"ant-btn ant-btn-text ant-btn-icon-only\"])[2]")
    private WebElement makeCorrectionOption2;

    public WebElement getMakeCorrectionOption2() {
        return makeCorrectionOption2;
    }

    public void questionnaire(String question, String option1, String option2) throws InterruptedException {

        click(getAddCustomQuestion());
        click(getTypeQuestion());
        Thread.sleep(2000);
        sendkeys(getTypeQuestion(), question);
        click(getMandatory());
        Thread.sleep(2000);
        sendkeys(getOption1(), option1);
        click(getMakeCorrectforOption1());
        sendkeys(getOption2(), option2);
        Thread.sleep(2000);
        click(getSaveButton());


    }

}

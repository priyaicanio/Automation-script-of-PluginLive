package com.pluginlive.pagesforBulkCorporateRoleCreation;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;

public class InterviewWorkflowPage extends BaseClass {

    public InterviewWorkflowPage() throws IOException {
        super();

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder=\"Add Round Name\"]")
    private WebElement addRoundName;

    @FindBy(xpath = "//input[@value=\"ASSESMENT\"]")
    private WebElement assessment;

    @FindBy(xpath = "//input[@value=\"COGNITIVE\"]")
    private WebElement cognitive;

    public WebElement getCognitive() {
        return cognitive;
    }

    public WebElement getTechnical() {
        return technical;
    }

    public WebElement getCommunication() {
        return communication;
    }

    @FindBy(xpath = "//input[@value=\"TECHNICAL\"]")
    private WebElement technical;

    @FindBy(xpath = "//input[@value=\"COMUNICATION\"]")
    private WebElement communication;


    @FindBy(xpath = "//input[@value=\"GROUP\"]")
    private WebElement groupDiscussion;

    public WebElement getAddRoundName() {
        return addRoundName;
    }

    public WebElement getAssessment() {
        return assessment;
    }

    public WebElement getGroupDiscussion() {
        return groupDiscussion;
    }

    public WebElement getFaceToFace() {
        return faceToFace;
    }

    public WebElement getRoundDescription() {
        return roundDescription;
    }

    public WebElement getAddRounds() {
        return addRounds;
    }

    @FindBy(xpath = "//input[@value=\"FACE_TO_FACE\"]")
    private WebElement faceToFace;

    @FindBy(xpath = "(//div[@class=\"notranslate public-DraftEditor-content\"])[2]")
    private WebElement roundDescription;

    @FindBy(xpath = "(//button[@class=\"ant-btn ant-btn-secondary sc-ftTHYK kQoyeN\"])[3]")
    private WebElement addRounds;
    @FindBy(xpath = "//input[@value=\"DOMAIN_EXPERTS\"]")
    private WebElement domainExperts;

    @FindBy(xpath = "//input[@value=\"HR_ROUND\"]")
    private WebElement hrRound;

    @FindBy(xpath = "//button[@class=\"ant-btn ant-btn-primary sc-ftTHYK bIoQFB\"]")
    private WebElement previewAndPublish;

    public WebElement getPreviewAndPublish() {
        return previewAndPublish;
    }

    public WebElement getSaveAsDraft() {
        return saveAsDraft;
    }

    @FindBy(xpath = "//button[@class=\"ant-btn ant-btn-secondary sc-ftTHYK ftetyB\"]")
    private WebElement saveAsDraft;

    @FindBy(xpath = "(//button[@class=\"ant-btn ant-btn-primary sc-ftTHYK bIoQFB\"])[2]")
    private WebElement publish;

    @FindBy(xpath = "(//button[@class=\"ant-btn ant-btn-primary sc-ftTHYK bIoQFB\"])[3]")
    private WebElement rankingPublish;

    @FindBy(xpath = "//input[@value=\"All\"]")
    private WebElement allColleges;

    public WebElement getRankingPublish() {
        return rankingPublish;
    }

    public WebElement getAllColleges() {
        return allColleges;
    }

    public WebElement getSelectColleges() {
        return selectColleges;
    }

    @FindBy(xpath = "//input[@value=\"Select Collages\"]")
    private WebElement selectColleges;

    public WebElement getConfirmButton() {
        return confirmButton;
    }

    public WebElement getCloseButton() {
        return closeButton;
    }

    @FindBy(xpath = "(//button[@class=\"ant-btn ant-btn-primary sc-ftTHYK bIoQFB\"])[4]")
    private WebElement confirmButton;

    public WebElement getWarningConfirmButton() {
        return warningConfirmButton;
    }

    @FindBy(xpath = "(//button[@class=\"ant-btn ant-btn-primary sc-ftTHYK bIoQFB\"])[5]")
    private WebElement warningConfirmButton;
    @FindBy(xpath = "(//button[@class=\"ant-btn ant-btn-secondary sc-ftTHYK ftetyB\"])[4]")
    private WebElement closeButton;

    @FindBy(xpath = "//input[@class=\"ant-input ant-input-borderless\"]")
    private WebElement searchCollege;

    public WebElement getSearchCollege() {
        return searchCollege;
    }

    @FindBy(xpath = "//span[text()='Select']")
    private WebElement selectButton1;
    @FindBy(xpath = "(//span[text()='Select'])[2]")
    private WebElement selectButton2;

    @FindBy(xpath = "(//span[text()='Select'])[3]")
    private WebElement selectButton3;

    public WebElement getSelectButton1() {
        return selectButton1;
    }

    public WebElement getSelectButton2() {
        return selectButton2;
    }

    public WebElement getSelectButton3() {
        return selectButton3;
    }

    public WebElement getPublish() {
        return publish;
    }

    public WebElement getDomainExperts() {
        return domainExperts;
    }

    public WebElement getHrRound() {
        return hrRound;
    }

    public void interviewprocess(String Roundname1, String Round1Description, String Roundname2, String Round2Description, String Roundname3, String Round3Description, String clgName, String clgName1, String clgName2) throws InterruptedException, AWTException {
//Round1
        click(getAddRoundName());
        sendkeys(getAddRoundName(), Roundname1);
        Thread.sleep(2000);
        click(getAssessment());
        click(getCommunication());
        click(getRoundDescription());
        Thread.sleep(2000);
        sendkeys(getRoundDescription(), Round1Description);
        Thread.sleep(2000);
        click(getAddRounds());

        //Round2
        click(getAddRoundName());
        sendkeys(getAddRoundName(), Roundname2);
        Thread.sleep(2000);
        click(getFaceToFace());
        click(getDomainExperts());
        click(getRoundDescription());
        Thread.sleep(2000);
        sendkeys(getRoundDescription(), Round2Description);
        Thread.sleep(2000);
        click(getAddRounds());


//Round3
        click(getAddRoundName());
        sendkeys(getAddRoundName(), Roundname3);
        Thread.sleep(2000);
        click(getGroupDiscussion());
        click(getRoundDescription());
        Thread.sleep(2000);
        sendkeys(getRoundDescription(), Round3Description);
        Thread.sleep(3000);
        click(getAddRounds());
        refresh();

// Publishing the role
        click(getPreviewAndPublish());
        Thread.sleep(2000);
        click(getPublish());
        Thread.sleep(2000);
        click(getRankingPublish());
        Thread.sleep(2000);
        click(getSelectColleges());
        Thread.sleep(2000);
        sendkeys(getSearchCollege(), clgName);
        Thread.sleep(2000);
        click(getSelectButton1());
        Thread.sleep(1000);
        click(getSearchCollege());
        selectall();
        sendkeys(getSearchCollege(), clgName1);
        Thread.sleep(2000);
        click(getSelectButton1());
        Thread.sleep(1000);
        click(getSearchCollege());
        selectall();
        sendkeys(getSearchCollege(), clgName2);
        Thread.sleep(2000);
        click(getSelectButton1());
        Thread.sleep(1000);
        click(getConfirmButton());
        Thread.sleep(2000);
        click(getWarningConfirmButton());


    }


}

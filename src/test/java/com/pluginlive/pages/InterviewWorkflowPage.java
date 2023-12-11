package com.pluginlive.pages;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class InterviewWorkflowPage extends BaseClass {

    public InterviewWorkflowPage() throws IOException {
        super();

        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//input[@placeholder=\"Add Round Name\"]")
    private WebElement addRoundName;

    @FindBy (xpath = "//input[@value=\"ASSESMENT\"]")
    private WebElement assessment;

    @FindBy (xpath = "//input[@value=\"COGNITIVE\"]")
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

    @FindBy (xpath = "//input[@value=\"TECHNICAL\"]")
    private WebElement technical;

    @FindBy (xpath = "//input[@value=\"COMUNICATION\"]")
    private WebElement communication;


    @FindBy (xpath = "//input[@value=\"GROUP\"]")
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

    @FindBy (xpath = "//input[@value=\"FACE_TO_FACE\"]")
    private WebElement faceToFace;

    @FindBy (xpath = "(//div[@class=\"notranslate public-DraftEditor-content\"])[2]")
 private  WebElement roundDescription;

    @FindBy (xpath =  "(//button[@class=\"ant-btn ant-btn-secondary sc-ftTHYK kQoyeN\"])[3]")
   private  WebElement addRounds;
@FindBy (xpath = "//input[@value=\"DOMAIN_EXPERTS\"]")
private WebElement domainExperts;

@FindBy (xpath = "//input[@value=\"HR_ROUND\"]")
private WebElement hrRound;

@FindBy (xpath = "//button[@class=\"ant-btn ant-btn-primary sc-ftTHYK bIoQFB\"]")
private WebElement previewAndPublish;

    public WebElement getPreviewAndPublish() {
        return previewAndPublish;
    }

    public WebElement getSaveAsDraft() {
        return saveAsDraft;
    }

    @FindBy (xpath = "//button[@class=\"ant-btn ant-btn-secondary sc-ftTHYK ftetyB\"]")
private WebElement saveAsDraft;

    @FindBy (xpath = "(//button[@class=\"ant-btn ant-btn-primary sc-ftTHYK bIoQFB\"])[2]")
    private WebElement publish;

    @FindBy (xpath = "(//button[@class=\"ant-btn ant-btn-primary sc-ftTHYK bIoQFB\"])[3]")
    private WebElement rankingPublish;

    @FindBy (xpath = "//input[@value=\"All\"]")
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

    @FindBy (xpath = "//input[@value=\"Select Collages\"]")
    private WebElement selectColleges;

    public WebElement getConfirmButton() {
        return confirmButton;
    }

    public WebElement getCloseButton() {
        return closeButton;
    }

    @FindBy (xpath = "//div[@class=\"sc-iBYQkv lgqJFl\"]//parent::button[@class=\"ant-btn ant-btn-primary sc-ftTHYK cTaHPE\"]")
    private WebElement confirmButton;

    @FindBy (xpath = "(//button[@class=\"ant-btn ant-btn-secondary sc-ftTHYK ftetyB\"])[4]")
private  WebElement closeButton;


    public WebElement getPublish() {
        return publish;
    }

    public WebElement getDomainExperts() {
        return domainExperts;
    }

    public WebElement getHrRound() {
        return hrRound;
    }

    public void interviewprocess() throws InterruptedException {
//Round1
    click(getAddRoundName());
    sendkeys(getAddRoundName(),"Assessment");
    Thread.sleep(3000);
    click(getAssessment());
   click(getCommunication());
   click(getRoundDescription());
   Thread.sleep(3000);
   sendkeys(getRoundDescription(),"All The Best Do Well");
   Thread.sleep(3000);
   click(getAddRounds());

 //Round2
    click(getAddRoundName());
    sendkeys(getAddRoundName(),"Technical Round");
    Thread.sleep(3000);
    click(getFaceToFace());
    click(getDomainExperts());
    click(getRoundDescription());
    Thread.sleep(3000);
    sendkeys(getRoundDescription(),"Must Have knowledge regarding the job position");
    Thread.sleep(3000);
    click(getAddRounds());


//Round3
        click(getAddRoundName());
        sendkeys(getAddRoundName()," HR Discussion");
        Thread.sleep(3000);
        click(getGroupDiscussion());
        click(getRoundDescription());
        Thread.sleep(3000);
        sendkeys(getRoundDescription(),"Discussion regarding the Location, Shift and Package also About the Company");
        Thread.sleep(3000);

// Publishing the role
        click(getPreviewAndPublish());
        Thread.sleep(3000);
        click(getPublish());
        Thread.sleep(3000);
     click(getRankingPublish());
        Thread.sleep(3000);
click(getSelectColleges());
Thread.sleep(3000);

click(getConfirmButton());






















    }



























}

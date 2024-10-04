package com.pluginlive.pagesforBulkCorporateRoleCreation;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class NewRoleJobDetailsPage extends BaseClass {
    public NewRoleJobDetailsPage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    //Add new role
    @FindBy(xpath = "//div[text()='Add New Role']")
    private WebElement addNewRole;

    //Job Details
    @FindBy(xpath = "//div[@id='jobDetails_jobFunction']//child::input[@class='ant-select-selection-search-input']")
    private WebElement jobDetails;

    public WebElement getJobDetails() {
        return jobDetails;
    }

    public List<WebElement> getJobDetailsFunctions() {
        return jobDetailsFunctions;
    }

    @FindBy(xpath = "//div[@class='ant-select-item-option-content']")
    // @FindBy(xpath = "//span[@class='ant-select-item-option-state']")
    private List<WebElement> jobDetailsFunctions;


    @FindBy(xpath = "//div[@id='jobDetails_jobTitle']//child::input[@class=\"ant-select-selection-search-input\"]")
    private WebElement jobTitle;
//@FindBy(xpath = "//*[@class='ant-picker-cell-inner']")

    @FindBy(xpath = "//div[@class='ant-select-item ant-select-item-option']")
    private List<WebElement> listfunction;

    public List<WebElement> getListfunction() {
        return listfunction;
    }

    @FindBy(xpath = "(//table[@class=\"ant-picker-content\"])[1]")
    private List<WebElement> listStartdate;

    public List<WebElement> getListStartdate() {
        return listStartdate;
    }

    public List<WebElement> getListEnddate() {
        return listEnddate;
    }

    @FindBy(xpath = "(//table[@class=\"ant-picker-content\"])[1]")
    private List<WebElement> listEnddate;

    public List<WebElement> getJobDetailsTitle() {
        return jobDetailsTitle;
    }

    @FindBy(xpath = "//div[@class='ant-select-item-option-content']")
    private List<WebElement> jobDetailsTitle;

    //jobtype//1.Internship
    @FindBy(xpath = "//input[@value='INTERN']")
    private WebElement jobTypeInternship;
    //2.fresher
    @FindBy(xpath = "//input[@value='ENTRY']")
    private WebElement jobTypeFresher;

    //3.Experienced/lateral
    @FindBy(xpath = "//input[@value='EXPERIENCED']")
    private WebElement jobTypeExperienced;

    //Employment Type //1.Onroll
    @FindBy(xpath = "//input[@value='ONROLL']")
    private WebElement employmentTypeOnroll;
    //2.Contract
    @FindBy(xpath = "//input[@value='CONTRACT']")
    private WebElement employmentTypeContract;
    //3.FullTime
    @FindBy(xpath = "//input[@value='FULL_TIME']")
    private WebElement employmentTypeFullTime;
    //4.PartTime
    @FindBy(xpath = "//input[@value='PART_TIME']")
    private WebElement employmentTypePartTime;

    //Job Description
    @FindBy(xpath = "(//div[@class=\"notranslate public-DraftEditor-content\"])[1]")
    private WebElement jobDescription;

    //No. of. candidates to be hired
    @FindBy(xpath = "//input[@id='jobDetails_numberOfCandidates']")
    private WebElement NoofCandidates;
    // Application start date
    @FindBy(xpath = "//input[@id='startDate']")
    private WebElement applicationStartDate;

    public WebElement getNextstartdatebutton() {
        return nextstartdatebutton;
    }

    public WebElement getNextenddatebutton() {
        return nextenddatebutton;
    }

    // Arrow for next button start date
    @FindBy(xpath = "(//button[@class=\"ant-picker-header-next-btn\"])[1]")
    private WebElement nextstartdatebutton;
    // Arrow for next button end date
    @FindBy(xpath = "(//button[@class=\"ant-picker-header-next-btn\"])[2]")
    private WebElement nextenddatebutton;


    // Application End date
    @FindBy(xpath = "//input[@id='endDate']")
    private WebElement applicationEndDate;


    public WebElement getAddNewRole() {
        return addNewRole;
    }

    public WebElement getJobTitle() {
        return jobTitle;
    }

    public WebElement getJobTypeInternship() {
        return jobTypeInternship;
    }

    public WebElement getJobTypeFresher() {
        return jobTypeFresher;
    }

    public WebElement getJobTypeExperienced() {
        return jobTypeExperienced;
    }

    public WebElement getEmploymentTypeOnroll() {
        return employmentTypeOnroll;
    }

    public WebElement getEmploymentTypeContract() {
        return employmentTypeContract;
    }

    public WebElement getEmploymentTypeFullTime() {
        return employmentTypeFullTime;
    }

    public WebElement getEmploymentTypePartTime() {
        return employmentTypePartTime;
    }

    public WebElement getJobDescription() {
        return jobDescription;
    }

    public WebElement getNoofCandidates() {
        return NoofCandidates;
    }

    public WebElement getApplicationStartDate() {
        return applicationStartDate;
    }


    public WebElement getApplicationEndDate() {
        return applicationEndDate;
    }

    public String newRolemsg() {
        String text = getText(getAddNewRole());
        return text;
    }


    //for (int i = 0; i < getJobDetailsFunctions().size(); i++) {
    //  if (getJobDetailsFunctions().get(i).getText().equals(function)) {
    //   WebElement functionText = getJobDetailsFunctions().get(i);
    //actionclick(functionText);
    //    }
    //}
    //click(getJobTitle());
    // for (int i = 0; i < getJobDetailsTitle().size(); i++) {
    //   if (getJobDetailsTitle().get(i).getText().equals(jobTitle)) {
    //     getJobDetailsTitle().get(i).click();
    //}
    //}
    public void jobDetails(String function, String jobTitle, String jobDescription, String noOfcandidates, String startdate, String enddate) throws InterruptedException, AWTException {
        click(getJobDetails());
        Thread.sleep(3000);
        sendkeys(getJobDetails(), function);
        Thread.sleep(5000);
        enterKey();
        elementclickjs(getJobTitle());
        //click(getJobTitle());
        Thread.sleep(1000);
        sendkeys(getJobTitle(), jobTitle);
        Thread.sleep(1000);

        enterKey();
        elementclickjs(getJobTypeFresher());
       // click(getJobTypeFresher());
        click(getEmploymentTypeOnroll());
        click(getEmploymentTypeFullTime());
        Thread.sleep(1000);
        click(getJobDescription());
        sendkeys(getJobDescription(), jobDescription);
        click(getNoofCandidates());
        sendkeys(getNoofCandidates(), noOfcandidates);
        click(getApplicationStartDate());
        selectall();

        Thread.sleep(1000);
        sendkeys(getApplicationStartDate(), startdate);
        Thread.sleep(1000);
        enterKey();
        click(getApplicationEndDate());
        selectall();
        Thread.sleep(1000);
        sendkeys(getApplicationEndDate(), enddate);
        Thread.sleep(1000);
        enterKey();

    }
}



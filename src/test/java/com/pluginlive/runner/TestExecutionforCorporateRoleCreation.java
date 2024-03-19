package com.pluginlive.runner;

import com.pluginlive.base.BaseClass;
import com.pluginlive.pagemanager.PageObjectManagerCorporateRoleCreation;
import com.pluginlive.pagemanager.PageObjectManagerInstituteRoleAccepting;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExecutionforCorporateRoleCreation extends BaseClass {
    PageObjectManagerCorporateRoleCreation pom = new PageObjectManagerCorporateRoleCreation();

    //Constructor
    public TestExecutionforCorporateRoleCreation() throws IOException {
    }

    @BeforeClass
    public void beforeExecution() throws FileNotFoundException, IOException {
        System.out.println("Execution Starts");
        getdriver(getPropertyFileValue("browser"));
        enterurl(getPropertyFileValue("url"));
        maximizewindow();
        implicitywait();
    }

    @BeforeMethod
    public void beforemethod() {
        long starttime = System.currentTimeMillis();
        System.out.println(starttime);
    }

    @Test(priority = -1)
    //  @Test (enabled = false)
    public void positivetestlogin() throws IOException, AWTException, InterruptedException {
        System.out.println("Login process begins");
        pom.getLoginPage().Login(readExcelData("CorporateLogin", 1, 0), readExcelData("CorporateLogin", 1, 1));
    }

    @Test(priority = -3)
//@Test(enabled = false)
    public void negativelogin() throws IOException {
        pom.getLoginPage().negativeloginscenario();
    }

    @Test(priority = -2)
    //   @Test(enabled = false)

    public void loginerrormsg() throws IOException, InterruptedException {
        String actualUsernameErrorText = pom.getLoginPage().errormsg();
        String exceptedUsernameErrorText = "An account with email priya@icanio.com not exists.";
        Assert.assertEquals(actualUsernameErrorText, exceptedUsernameErrorText);
    }

    @Test(priority = 0)
    //  @Test(enabled = false)
    public void loginmsg() throws IOException {
        implicitywait();
        WebElement actual = pom.getDashboardPage().getLoginsuccessmsg();
        String actualText = actual.getText();
        String exceptedText = "Hello, Priya";
        Assert.assertEquals(exceptedText, actualText);
    }

    @Test(priority = 1)
    // @Test(enabled = false)

    public void selectroles() throws IOException {
        pom.getDashboardPage().selectRoles();
    }

    @Test(priority = 2)
    //  @Test(enabled = false)

    public void newRole() throws IOException {
        implicitywait();
        pom.getRolesPage().clicknewRole();
    }

    @Test(priority = 3)
    //@Test(enabled = false)
    public void newRoleMsg() throws IOException {
        String actualText = "Add New Role";
        WebElement excepted = pom.getNewRoleJobDetailsPage().getAddNewRole();
        String exceptedText = excepted.getText();
        Assert.assertEquals(actualText, exceptedText);
    }

//@Test (priority = 4)

    //public  void jobDetails() throws IOException {
    //  implicitywait();
    //pom.getNewRoleJobDetailsPage().joblist();
//}
    @Test(priority = 4)
//@Test(enabled = false)

    public void jobDetails() throws IOException, InterruptedException, AWTException {
        implicitywait();
        Thread.sleep(3000);
        pom.getNewRoleJobDetailsPage().jobDetails(readExcelData("JobDetails", 1, 0), readExcelData("JobDetails", 1, 1), readExcelData("JobDetails", 1, 2), readExcelData("JobDetails", 1, 3), readExcelData("JobDetails", 1, 4), readExcelData("JobDetails", 1, 5));
    }

    @Test(priority = 5)
    // @Test(enabled = false)

    public void ctcandJobLocation() throws IOException, InterruptedException, AWTException {
        pom.getNewRoleCTCandJobLocation().ctcandJobLocation(readExcelData("CTCandJobLocation", 1, 0), readExcelData("CTCandJobLocation", 1, 1), readExcelData("CTCandJobLocation", 1, 2), readExcelData("CTCandJobLocation", 1, 3));
        Thread.sleep(3000);
    }

    @Test(priority = 6)
    // @Test(enabled = false)

    public void

    eligibilityCriteria() throws IOException, InterruptedException, AWTException {
        implicitywait();
        Thread.sleep(3000);
        pom.getEligibilityCriteria().eligibilityCriteria(readExcelData("EligibilityCriteria", 1, 0), readExcelData("EligibilityCriteria", 1, 1), readExcelData("EligibilityCriteria", 1, 2), readExcelData("EligibilityCriteria", 1, 3), readExcelData("EligibilityCriteria", 1, 4), readExcelData("EligibilityCriteria", 1, 5), readExcelData("EligibilityCriteria", 1, 6), readExcelData("EligibilityCriteria", 1, 7), readExcelData("EligibilityCriteria", 1, 8), readExcelData("EligibilityCriteria", 1, 9), readExcelData("EligibilityCriteria", 1, 10), readExcelData("EligibilityCriteria", 1, 11), readExcelData("EligibilityCriteria", 1, 12), readExcelData("EligibilityCriteria", 1, 13), readExcelData("EligibilityCriteria", 1, 14));
    }


    @Test(priority = 7)
    //@Test(enabled = false)

    public void questionnaire() throws IOException, InterruptedException {
        pom.getQuestionnairePage().questionnaire(readExcelData("Questionnaire", 1, 0), readExcelData("Questionnaire", 1, 1), readExcelData("Questionnaire", 1, 2));
    }

    @Test(priority = 8)
    //@Test(enabled = false)

    public void interviewworkflow() throws IOException, InterruptedException, AWTException {
        pom.getInterviewWorkflowPage().interviewprocess(readExcelData("InterviewWorkflow", 1, 0), readExcelData("InterviewWorkflow", 1, 1), readExcelData("InterviewWorkflow", 1, 2), readExcelData("InterviewWorkflow", 1, 3), readExcelData("InterviewWorkflow", 1, 4), readExcelData("InterviewWorkflow", 1, 5), readExcelData("InterviewWorkflow", 1, 6), readExcelData("InterviewWorkflow", 1, 7), readExcelData("InterviewWorkflow", 1, 8));
    }

    @AfterMethod
    public void aftermethod() {
        long endtime = System.currentTimeMillis();

        System.out.println(endtime);
    }

    @AfterClass
    public void afterexecution() {
        System.out.println("Execution ends");
    }

}



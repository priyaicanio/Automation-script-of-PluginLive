package com.pluginlive.runner;

import com.pluginlive.base.BaseClass;
import com.pluginlive.pagemanager.PageObjectManager;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExecution extends BaseClass {
    PageObjectManager pom = new PageObjectManager();

    //Constructor
    public TestExecution() throws IOException {
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
    public void testlogin() throws IOException, AWTException {
        System.out.println("Login process begins");
        pom.getLoginPage().Login(readExcelData("CorporateLogin", 1, 0), readExcelData("CorporateLogin", 1, 1));
    }

    @Test(priority = 0)
    public void loginmsg() throws IOException {
        implicitywait();
        WebElement actual = pom.getDashboardPage().getLoginsuccessmsg();
        String actualText = actual.getText();
        String exceptedText = "Hello, priya";
        Assert.assertEquals(exceptedText, actualText);
    }

    @Test(priority = 1)
    public void selectroles() throws IOException {
        pom.getDashboardPage().selectRoles();
    }

    @Test(priority = 2)
    public void newRole() throws IOException {
        implicitywait();
        pom.getRolesPage().clicknewRole();
    }

    @Test(priority = 3)
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
    public void jobDetails() throws IOException, InterruptedException, AWTException {
        implicitywait();
        Thread.sleep(3000);
pom.getNewRoleJobDetailsPage().jobDetails(readExcelData("JobDetails",1,0),readExcelData("JobDetails",1,1), readExcelData("JobDetails",1,2),readExcelData("JobDetails",1,3),readExcelData("JobDetails",1,4),readExcelData("JobDetails",1,5));
    }
    @Test(priority = 5)
    public void ctcandJobLocation() throws IOException, InterruptedException, AWTException {
pom.getNewRoleCTCandJobLocation().ctcandJobLocation(readExcelData("Sheet1",1,0),readExcelData("Sheet1",1,1), readExcelData("Sheet1",1,2),readExcelData("Sheet1",1,3));
  Thread.sleep(3000);  }

   @Test(priority = 6)
    public void eligibilityCriteria() throws IOException, InterruptedException, AWTException {
        implicitywait();
        Thread.sleep(3000);
        pom.getEligibilityCriteria().eligibilityCriteria(readExcelData("EligibilityCriteria",1,0),readExcelData("EligibilityCriteria",1,1),readExcelData("EligibilityCriteria",1,2),readExcelData("EligibilityCriteria",1,3),readExcelData("EligibilityCriteria",1,4),readExcelData("EligibilityCriteria",1,5),readExcelData("EligibilityCriteria",1,6),readExcelData("EligibilityCriteria",1,7));
    }

    @Test(priority = 7)
    public void questionnaire() throws IOException, InterruptedException {
        pom.getQuestionnairePage().questionnaire();
    }

    @Test(priority = 8)
    public void interviewworkflow() throws IOException, InterruptedException {
        pom.getInterviewWorkflowPage().interviewprocess();
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


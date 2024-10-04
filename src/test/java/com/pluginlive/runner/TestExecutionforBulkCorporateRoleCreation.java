package com.pluginlive.runner;

import com.pluginlive.ListenersExample;
import com.pluginlive.base.BaseClass;
import com.pluginlive.pagemanager.PageObjectManagerBulkCorporateRoleCreation;
import com.pluginlive.runner.excel.utility.XLUtility;
import org.apache.xmlbeans.impl.schema.XQuerySchemaTypeSystem;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.awt.*;
import java.io.IOException;

@Listeners(ListenersExample.class)
public class TestExecutionforBulkCorporateRoleCreation extends BaseClass {
    PageObjectManagerBulkCorporateRoleCreation pom = new PageObjectManagerBulkCorporateRoleCreation();

    public TestExecutionforBulkCorporateRoleCreation() throws IOException {
   super();
    }
    @BeforeSuite
    public void setUp() throws IOException {
        // Common setup code here
        getdriver(getPropertyFileValue("browser"));
        deletecookies();
        pageload();
        maximizewindow();
        implicitywait();
        enterurl(getPropertyFileValue("url"));
    }
    @DataProvider(name = "corporaterolecreation")
    public String[][] getData() throws IOException {
        String path = "C:\\Users\\Priya Thangaraj\\Desktop\\Pluginlive Automation\\PluginLive-Automation (1)\\Excel\\PluginLive Automation Students Onboarding.xlsx";
        XLUtility xlutil = new XLUtility(path);
        int totalrows = xlutil.getRowCount("BulkCorporateRoleCreation");
        int totalcols = xlutil.getCellCount("BulkCorporateRoleCreation", 1);
        String loginData[][] = new String[totalrows][totalcols];
        for (int i = 1; i <= totalrows; i++) {
            for (int j = 0; j < totalcols; j++) {
                loginData[i - 1][j] = xlutil.getCellData("BulkCorporateRoleCreation", i, j);
            }
        }
        return loginData;
    }
    @AfterClass
    public void tearDown() {
        // Common teardown code here
        if (driver != null) {
            driver.quit();
        }
    }
    @Test(dataProvider = "corporaterolecreation")
public void



    BulkRoleCreation(String userName,String password, String function,String jobTitle,String jobDescription,String noOfcandidates,String startdate, String enddate,String tier1MinRange,String tier1MaxRange,String jobLocation, String workFromOffice, String degree,String degree1, String specialisation,String skill1,String skill2, String skill3, String skill4, String skill5, String skill6,String year1, String year2, String year3, String year4, String year5,String averagemark, String question,String option1,String option2,String Roundname1,String Round1Description,String Roundname2,String Round2Description,String Roundname3, String Round3Description,String clgName, String clgName1, String clgName2) throws IOException, InterruptedException, AWTException {

        System.out.println("Login process begins");
        pom.getLoginPage().Login(userName,password);
        pom.getDashboardPage().selectRoles();
        pom.getRolesPage().clicknewRole();
        pom.getNewRoleJobDetailsPage().jobDetails(function,jobTitle,jobDescription,noOfcandidates,startdate,enddate);
        pom.getNewRoleCTCandJobLocation().ctcandJobLocation(tier1MinRange,tier1MaxRange,jobLocation,workFromOffice);
        pom.getEligibilityCriteria().eligibilityCriteria(degree,degree1,specialisation,skill1,skill2,skill3,skill4,skill5,skill6,year1,year2,year3,year4,year5,averagemark);
        pom.getQuestionnairePage().questionnaire(question,option1,option2);
        pom.getInterviewWorkflowPage().interviewprocess(Roundname1,Round1Description,Roundname2,Round2Description,Roundname3,Round3Description,clgName,clgName1,clgName2);
        pom.getLogoutPage().logout();
    }
}




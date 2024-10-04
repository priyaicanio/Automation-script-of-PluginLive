package com.pluginlive.runner;

import com.pluginlive.ListenersExample;
import com.pluginlive.base.BaseClass;
import com.pluginlive.pagemanager.PageObjectManagerBulkStudentRoleAccepting;
import com.pluginlive.runner.excel.utility.XLUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

@Listeners(ListenersExample.class)

public class TestExecutionforBulkStudentRoleAccepting extends BaseClass {
    PageObjectManagerBulkStudentRoleAccepting pom = new PageObjectManagerBulkStudentRoleAccepting();

    public TestExecutionforBulkStudentRoleAccepting() throws IOException {
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
    //Data from excel
    @DataProvider(name = "studentcredential")
    public String[][] getData() throws IOException {
        String path = "C:\\Users\\Priya Thangaraj\\Desktop\\Pluginlive Automation\\PluginLive-Automation (1)\\Excel\\PluginLive Automation Students Onboarding.xlsx";
        XLUtility xlutil = new XLUtility(path);
        int totalrows = xlutil.getRowCount("BulkStudentRoleAcceptingFlow");
        int totalcols = xlutil.getCellCount("BulkStudentRoleAcceptingFlow", 1);
        String loginData[][] = new String[totalrows][totalcols];
        for (int i = 1; i <= totalrows; i++) {
            for (int j = 0; j < totalcols; j++) {
                loginData[i - 1][j] = xlutil.getCellData("BulkStudentRoleAcceptingFlow", i, j);
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
    @Test(dataProvider = "studentcredential")
    public void


    BulkRoleAcceptingFlow(String userName, String password, String search, String reference, String feedback) throws IOException, InterruptedException, AWTException {
        pom.getLoginPage().Login(userName, password);
        pom.getHomePage().rolesbutton();
        pom.getRolesPage().RoleSearch(search);
        pom.getRolesPage().RoleList();
        pom.getQuesionnairePage().questionnaire();
        String actualText = "You Applied Successfully !";
        WebElement expected = pom.getFeedbackPage().getAppliedsuccessfullmsg();
        String expectedText = expected.getText();
        Assert.assertEquals(actualText, expectedText);
        System.out.println(expectedText);
        pom.getFeedbackPage().getDoneButton().click();
        pom.getFeedbackPage().feedback(reference);
        pom.getFeedbackPage().feedbackform(feedback);
        pom.getLogoutPage().logoutfunction();
    }
}

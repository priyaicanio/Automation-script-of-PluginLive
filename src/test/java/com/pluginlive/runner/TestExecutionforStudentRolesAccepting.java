package com.pluginlive.runner;

import com.pluginlive.base.BaseClass;
import com.pluginlive.pagemanager.PageObjectManagerStudentRolesAccepting;
import com.pluginlive.pagesforStudentRolesAccepting.LoginPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExecutionforStudentRolesAccepting extends BaseClass {

    PageObjectManagerStudentRolesAccepting pom = new PageObjectManagerStudentRolesAccepting();

    public TestExecutionforStudentRolesAccepting() throws IOException {
        super();
    }

    @BeforeClass
    public void setUp() throws IOException {
        // Common setup code here
        getdriver(getPropertyFileValue("browser"));
        maximizewindow();
        implicitywait();
    }

    @AfterClass
    public void tearDown() {
        // Common teardown code here
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(dataProvider = "studentCredentials")
    public void testRolesAcceptingFlow(String userName, String password) throws IOException, InterruptedException, AWTException {
        // Your test code here
        System.out.println("Login process begins");
        enterurl(getPropertyFileValue("url"));
        pom.getLoginPage().Login(userName, password);
        pom.getHomePage().rolesbutton();
        pom.getRolesPage().RoleSearch(readExcelData1("Feedback", 1, 0));
        pom.getRolesPage().RoleList();
        pom.getQuesionnairePage().questionnaire();
        pom.getFeedbackPage().feedback(readExcelData1("Feedback", 1, 1));
        pom.getFeedbackPage().feedbackform(readExcelData1("Feedback", 1, 2));
        String actualText = "You Applied Successfully !";
        WebElement expected = pom.getFeedbackPage().getAppliedsuccessfullmsg();
        String expectedText = expected.getText();
        Assert.assertEquals(actualText, expectedText);
        System.out.println(expectedText);
        pom.getFeedbackPage().getDoneButton().click();
    }

    @DataProvider(name = "studentCredentials")
    public Object[][] data() {
        Object[][] obj = new Object[][]{
                {"priya.t+studentrolecreation16@icanio.com", "Priya@2606"},
                {"priya.t+studentrolecreation14@icanio.com", "Priya@2606"},
                {"priya.t+studentrolecreation17@icanio.com", "Priya@2606"}
        };
        return obj;
    }
}









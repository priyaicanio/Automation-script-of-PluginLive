package com.pluginlive.runner;

import com.pluginlive.base.BaseClass;
import com.pluginlive.pagemanager.PageObjectManagerInstituteRoleAccepting;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExecutionforInstituteRoleAccepting extends BaseClass {
    PageObjectManagerInstituteRoleAccepting pom1 = new PageObjectManagerInstituteRoleAccepting();

    public TestExecutionforInstituteRoleAccepting() throws IOException {
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
    public void positivetestlogin() throws IOException, AWTException, InterruptedException {
        System.out.println("Login process begins");
        pom1.getLoginPage().Login(readExcelData1("InstituteRoleAccepting", 1, 0), readExcelData1("InstituteRoleAccepting", 1, 1));

    }

    @Test(priority = -3)
    public void negativelogin() throws IOException {
        pom1.getLoginPage().negativeloginscenario();
    }

    @Test(priority = -2)

    public void loginerrormsg() throws IOException, InterruptedException {
        String actualUsernameErrorText = pom1.getLoginPage().errormsg();
        String exceptedUsernameErrorText = "An account with email priya@icanio.com not exists.";
        Assert.assertEquals(actualUsernameErrorText, exceptedUsernameErrorText);
    }

    @Test(priority = 0)
    public void loginmsg() throws IOException {
        implicitywait();
        WebElement actual = pom1.getHomePage().getLoginsuccessmsg();
        String actualText = actual.getText();
        String exceptedText = "Demo college of engineering 1";
        Assert.assertEquals(exceptedText, actualText);
    }

    @Test(priority = 1)
    public void selectroles() throws IOException {
        pom1.getHomePage().selectRoles();
    }

    @Test(priority = 2)
    public void acceptingroles() throws IOException, InterruptedException {
        pom1.getRolesPage().search(readExcelData1("InstituteRoleAccepting", 1, 2));
    }


}

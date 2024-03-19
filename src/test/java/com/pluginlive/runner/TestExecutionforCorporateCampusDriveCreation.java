package com.pluginlive.runner;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.pluginlive.base.BaseClass;
import com.pluginlive.pagemanager.PageObjectManagerCorporateDriveCreation;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExecutionforCorporateCampusDriveCreation extends BaseClass {

    PageObjectManagerCorporateDriveCreation pom = new PageObjectManagerCorporateDriveCreation();


    public TestExecutionforCorporateCampusDriveCreation() throws IOException {
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
        pom.getLoginPage().Login(readExcelData1("CorporateDriveCreation", 1, 0), readExcelData1("CorporateDriveCreation", 1, 1));
    }

    @Test(priority = -3)
    public void negativelogin() throws IOException {
        pom.getLoginPage().negativeloginscenario();
    }

    @Test(priority = -2)

    public void loginerrormsg() throws IOException, InterruptedException {
        String actualUsernameErrorText = pom.getLoginPage().errormsg();
        String exceptedUsernameErrorText = "An account with email priya@icanio.com not exists.";
        Assert.assertEquals(actualUsernameErrorText, exceptedUsernameErrorText);
    }

    @Test(priority = 0)
    public void loginmsg() throws IOException {
        implicitywait();
        WebElement actual = pom.getDashboardPage().getLoginsuccessmsg();
        String actualText = actual.getText();
        String exceptedText = "Priya Corporate";
        Assert.assertEquals(exceptedText, actualText);
    }

    @Test(priority = 1)
    public void selectroles() throws IOException {
        pom.getDashboardPage().selectRoles();
    }

    @Test(priority = 2)
    public void schedulecampusdrive() throws IOException, InterruptedException, AWTException {
        pom.getRolesPage().campusDrive(readExcelData1("CorporateDriveCreation", 1, 2), readExcelData1("CorporateDriveCreation", 1, 3), readExcelData1("CorporateDriveCreation", 1, 4));
        pom.getRolesPage().logout();
    }

    @Test(priority = 3)
    public void instituteacceptingdrive() throws IOException, InterruptedException {
        pom.getLoginPage().institutelogin(readExcelData1("CorporateDriveCreation", 1, 5), readExcelData1("CorporateDriveCreation", 1, 6));

    }

    @Test(priority = 4)
    public void instituteloginmsg() throws IOException {
        implicitywait();
        WebElement actual = pom.getDashboardPage().getInstituteloginsuccessmsg();
        String actualText = actual.getText();
        String exceptedText = "Demo college of engineering 1";
        Assert.assertEquals(exceptedText, actualText);
    }

    @Test(priority = 5)
    public void selectDrives() throws IOException {
        pom.getDashboardPage().SelectDrives();
    }

    @Test(priority = 6)
    public void Drive() throws IOException, InterruptedException, AWTException {
        pom.getDrivePage().drive();
        pom.getDrivePage().driveList();
        pom.getDrivePage().confirmdrive(readExcelData1("CorporateDriveCreation",1,7),readExcelData1("CorporateDriveCreation",1,8),readExcelData1("CorporateDriveCreation",1,9),readExcelData1("CorporateDriveCreation",1,10));
        pom.getDrivePage().institutelogout();
    }

    @Test(priority = 7)
    public void corporateConfirmingdrive() throws IOException, InterruptedException, AWTException {
        pom.getLoginPage().Login(readExcelData1("CorporateDriveCreation",1,0),readExcelData1("CorporateDriveCreation",1,1));
         pom.getDashboardPage().selectRoles();
        pom.getViewRolePage().driveconfirmation();
    }




}

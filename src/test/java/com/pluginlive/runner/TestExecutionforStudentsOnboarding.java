package com.pluginlive.runner;

import com.pluginlive.base.BaseClass;
import com.pluginlive.pagemanager.PageObjectManagerStudentsOnboarding;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExecutionforStudentsOnboarding extends BaseClass {
    PageObjectManagerStudentsOnboarding pom = new PageObjectManagerStudentsOnboarding();
    public TestExecutionforStudentsOnboarding() throws IOException {
    }
    @BeforeClass
//@Test (enabled = false)
    public void beforeExecution() throws FileNotFoundException, IOException {
        System.out.println("Execution Starts");
        getdriver(getPropertyFileValue("browser"));
        enterurl(getPropertyFileValue("studentregistrationurl"));
        maximizewindow();
        implicitywait();
    }
    @BeforeMethod
    public void beforemethod() {
        long starttime = System.currentTimeMillis();
        System.out.println(starttime);
    }
@Test(priority = -1)
//@Test(enabled = false)

public void login() throws IOException, InterruptedException {
pom.getLoginPage().register();
    }

  @Test(priority = 0)
  //@Test(enabled = false)

  public void studentregistration() throws IOException, InterruptedException, AWTException {
    pom.getStudentRegistration().studentRegistration(readExcelData1("RegistrationForm",1,0),readExcelData1("RegistrationForm",1,1),readExcelData1("RegistrationForm",1,2),readExcelData1("RegistrationForm",1,3),readExcelData1("RegistrationForm",1,4),readExcelData1("RegistrationForm",1,5),readExcelData1("RegistrationForm",1,6),readExcelData1("RegistrationForm",1,7),readExcelData1("RegistrationForm",1,8),readExcelData1("RegistrationForm",1,9),readExcelData1("RegistrationForm",1,10),readExcelData1("RegistrationForm",1,11),readExcelData1("RegistrationForm",1,12));
}

@Test(priority = 1)
//    @Test(enabled = false)
public void registrartionsuccessmsg() throws IOException, InterruptedException {
    String actualSuccessmsg = pom.getStudentRegistration().registrationsuccessmsg();
    String exceptedSuccessmsg = "Thank you for reaching us.";
    Assert.assertEquals(actualSuccessmsg,exceptedSuccessmsg);
}

@Test(priority = 2)
//@Test (enabled = false)
    public void emailverification() throws IOException, InterruptedException {

    getdriver(getPropertyFileValue("browser"));
    enterurl(getPropertyFileValue("gmaillogin"));
    maximizewindow();
    implicitywait();
pom.getEmailVerification().emaillogin(readExcelData1("EmailRegistration",1,0),readExcelData1("EmailRegistration",1,1));
pom.getEmailVerification().emaillist();
    }

@Test(priority = 4)
//@Test(enabled = false)

    public void setpassword() throws IOException, InterruptedException {
pom.getSetPassword().setNewPassword(readExcelData1("SetPassword",1,0),readExcelData1("SetPassword",1,1));
    System.out.println(driver.getPageSource());
}

    @Test(priority = 5)
    public void loginasstudent() throws IOException, InterruptedException {
pom.getLoginAsStudent().loginasstudent(readExcelData1("LoginAsStudent",1,0),readExcelData1("LoginAsStudent",1,1));
    }


@Test (priority = 6)
public void personaldetails() throws IOException, InterruptedException, AWTException {
        pom.getPersonalDetails().personaldetails(readExcelData1("PersonalDetails",1,0),readExcelData1("PersonalDetails",1,1),readExcelData1("PersonalDetails",1,2),readExcelData1("PersonalDetails",1,3),readExcelData1("PersonalDetails",1,4),readExcelData1("PersonalDetails",1,5),readExcelData1("PersonalDetails",1,6),readExcelData1("PersonalDetails",1,7),readExcelData1("PersonalDetails",1,8));
}












}

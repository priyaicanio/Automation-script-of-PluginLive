package com.pluginlive.runner;

import com.pluginlive.base.BaseClass;
import com.pluginlive.pagemanager.PageObjectManagerStudentsOnboarding;
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
@Test
    public void login() throws IOException, InterruptedException {
pom.getLoginPage().register();
    }

    @Test
    public void studentregistration() throws IOException, InterruptedException, AWTException {
    pom.getStudentRegistration().studentRegistration(readExcelData1("RegistrationForm",1,0),readExcelData1("RegistrationForm",1,1),readExcelData1("RegistrationForm",1,2),readExcelData1("RegistrationForm",1,3),readExcelData1("RegistrationForm",1,4),readExcelData1("RegistrationForm",1,5),readExcelData1("RegistrationForm",1,6),readExcelData1("RegistrationForm",1,7),readExcelData1("RegistrationForm",1,8),readExcelData1("RegistrationForm",1,9),readExcelData1("RegistrationForm",1,10),readExcelData1("RegistrationForm",1,11),readExcelData1("RegistrationForm",1,12));
}




















}

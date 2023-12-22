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
//    @Test(enabled = false)
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
 // @Test(enabled = false)

  public void studentregistration() throws IOException, InterruptedException, AWTException {
    pom.getStudentRegistration().studentRegistration(readExcelData1("RegistrationForm",1,0),readExcelData1("RegistrationForm",1,1),readExcelData1("RegistrationForm",1,2),readExcelData1("RegistrationForm",1,3),readExcelData1("RegistrationForm",1,4),readExcelData1("RegistrationForm",1,5),readExcelData1("RegistrationForm",1,6),readExcelData1("RegistrationForm",1,7),readExcelData1("RegistrationForm",1,8),readExcelData1("RegistrationForm",1,9),readExcelData1("RegistrationForm",1,10),readExcelData1("RegistrationForm",1,11),readExcelData1("RegistrationForm",1,12));
}

@Test(priority = 1)
  // @Test(enabled = false)
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
}

@Test (priority = 6)
//@Test(enabled = false)
public void personaldetails() throws IOException, InterruptedException, AWTException {
pom.getPersonalDetails().personaldetails(readExcelData1("PersonalDetails",1,0),readExcelData1("PersonalDetails",1,1),readExcelData1("PersonalDetails",1,2),readExcelData1("PersonalDetails",1,3),readExcelData1("PersonalDetails",1,4),readExcelData1("PersonalDetails",1,5),readExcelData1("PersonalDetails",1,6),readExcelData1("PersonalDetails",1,7),readExcelData1("PersonalDetails",1,8));
//pom.getPersonalDetails().clickAndContinue();
    }

@Test(priority = 7)
    public void educationaldetails() throws IOException, InterruptedException, AWTException {

        pom.getEducationalDetails().tenth(readExcelData1("EducationalDetails",1,0),readExcelData1("EducationalDetails",1,1),readExcelData1("EducationalDetails",1,2),readExcelData1("EducationalDetails",1,3),readExcelData1("EducationalDetails",1,4),readExcelData1("EducationalDetails",1,5),readExcelData1("EducationalDetails",1,6));
        pom.getEducationalDetails().twelfth(readExcelData1("EducationalDetails",1,7),readExcelData1("EducationalDetails",1,8),readExcelData1("EducationalDetails",1,9),readExcelData1("EducationalDetails",1,10),readExcelData1("EducationalDetails",1,11),readExcelData1("EducationalDetails",1,12),readExcelData1("EducationalDetails",1,13));
 pom.getEducationalDetails().ug(readExcelData1("EducationalDetails",1,14));
  // pom.getEducationalDetails().clickandcontinue();
    }

   @Test(priority = 8)
 //  @Test (enabled = false)
   public void projectandinternship() throws IOException, InterruptedException {
pom.getProjectAndInternship().projectandinternship();
   }

@Test (priority = 9)
//  @Test (enabled = false)
    public void workexperience() throws IOException, InterruptedException {
pom.getWorkExperience().workexperience();
}

@Test (priority = 10)
//    @Test (enabled = false)
    public void coursesandtraining() throws IOException, InterruptedException {
pom.getCoursesAndTraining().coursesandtraining();
}

@Test (priority = 11)
//@Test (enabled = false)
    public void proofanddocuments() throws IOException, InterruptedException {
pom.getProofAndDocuments().proofanddocument();
}

@Test (priority = 12)
//    @Test (enabled = false)
    public void additionaldetails() throws IOException, InterruptedException, AWTException {
pom.getAdditionalDetails().additionaldetails(readExcelData1("AdditionalDetails",1,0),readExcelData1("AdditionalDetails",1,1),readExcelData1("AdditionalDetails",1,2),readExcelData1("AdditionalDetails",1,3),readExcelData1("AdditionalDetails",1,4),readExcelData1("AdditionalDetails",1,5));
    }










}

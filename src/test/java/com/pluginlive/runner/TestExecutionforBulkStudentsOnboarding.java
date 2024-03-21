package com.pluginlive.runner;

import com.pluginlive.ListenersExample;
import com.pluginlive.base.BaseClass;
import com.pluginlive.pagemanager.PageObjectManagerBulkStudentsOnboarding;
import com.pluginlive.runner.excel.utility.XLUtility;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;
import java.io.IOException;
@Listeners(ListenersExample.class)

public class TestExecutionforBulkStudentsOnboarding extends BaseClass {

    PageObjectManagerBulkStudentsOnboarding pom = new PageObjectManagerBulkStudentsOnboarding();

//    private WebDriver driver;
    public TestExecutionforBulkStudentsOnboarding() throws IOException {
        super();
    }

    @BeforeSuite
    public void setUp() throws IOException, InterruptedException {
        // Common setup code here
        getdriver(getPropertyFileValue("browser")); // Initialize driver here
        deletecookies();
        pageload();
        maximizewindow();
    }
    @BeforeMethod
    public void url() throws IOException, InterruptedException {
        implicitywait();
        enterurl(getPropertyFileValue("studentregistrationurl"));
        javascriptscrolldown();
        pom.getLoginPage().register();
    }

    //Data from excel
    @DataProvider(name = "studentonboarding")
    public String[][] getData() throws IOException {
        String path = "C:\\Users\\ICANIO-10090\\Desktop\\Project\\PluginLive-Automation\\Excel\\PluginLive Automation Students Onboarding.xlsx";
        XLUtility xlutil = new XLUtility(path);
        int totalrows = xlutil.getRowCount("BulkStudentOnboarding");
        int totalcols = xlutil.getCellCount("BulkStudentOnboarding", 1);
        String loginData[][] = new String[totalrows][totalcols];
        for (int i = 1; i <= totalrows; i++) {
            for (int j = 0; j < totalcols; j++) {
                loginData[i - 1][j] = xlutil.getCellData("BulkStudentOnboarding", i, j);
            }
        }
        return loginData;
    }

    @AfterSuite
    public void tearDown() {
        // Common teardown code here
      if (driver != null) {
           driver.quit();
       }
    }

    @Test(dataProvider = "studentonboarding")
    public void BulkStudentOnboarding(String firstName, String lastName, String email, String phoneNumber, String state, String city, String college, String degree, String department, String startmonth, String startyear, String endmonth, String endyear, String gmail, String password, String newPassword, String confirmPassword, String RegNo, String profilepic, String dob, String sex, String Addressline1, String Addressline2, String Country, String State, String City, String Pincode, String schlname, String Board, String month, String year, String percentage, String tenthstate, String tenthcity, String twelfthSchool, String twelfthBoard, String twelfthmonth, String twelfthyear, String twelfthpercentage, String twelfthSkills, String twelfthstate, String twelfthcity, String ugskill1, String ugskill2, String ugskill3, String ugpercentage, String company, String projectTitle, String startMonth, String startYear, String endMOnth, String endYear, String function, String role, String industry, String description, String skill1, String skill2, String skill3, String skill4, String skill5, String projectcertificate, String interncompany, String internstartMonth, String internstartYear, String internendMOnth, String internendYear, String internfunction, String internrole, String internindustry, String interndescription, String internskill1, String internskill2, String internskill3, String internskill4, String internskill5, String interncertificate, String workJobtitle, String workCompanyname, String workStartmonth, String workStartyear, String workNoticeperiod, String workFunction, String workRole, String workIndustry, String workDescription, String workSkill1, String workSkill2, String workSkill3, String workAwardname, String workAwardReceivedname, String workAwardDescription, String workbestperformancecertificate, String instituteName, String Coursestartmonth, String Coursestartyear, String Courseendmonth, String Courseendyear, String CourseName, String CourseDescription, String Courseskill1, String Courseskill2, String Courseskill3, String CourseCertificate, String IDproof, String Addressproof, String caste, String religion, String Hobbies, String lang1, String lang2, String careerobj) throws IOException, InterruptedException, AWTException {
      //  driver.switchTo().window(parentwindowID);

        System.out.println("Login process begins");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        pom.getStudentRegistration().studentRegistration(firstName, lastName, email, phoneNumber, state, city, college, degree, department, startmonth, startyear, endmonth, endyear);
        String actualSuccessmsg = pom.getStudentRegistration().registrationsuccessmsg();
        String exceptedSuccessmsg = "Thank you for reaching us.";
        Assert.assertEquals(actualSuccessmsg, exceptedSuccessmsg);
        System.out.println("First browser session: "+driver.getTitle());
        System.out.println("First browser session: "+driver.getCurrentUrl());
//        getdriver(getPropertyFileValue("browser"));
        enterurl(getPropertyFileValue("gmaillogin"));
        maximizewindow();
        implicitywait();
        pom.getEmailVerification().emaillogin(gmail, password);
        pom.getEmailVerification().emaillist();
        pom.getSetPassword().setNewPassword(newPassword, confirmPassword);
        pom.getUploadResume().resume();
        pom.getUploadProfile().uploadphoto();
        pom.getPersonalDetails().personaldetails(RegNo, profilepic, dob, sex, Addressline1, Addressline2, Country, State, City, Pincode);
        pom.getEducationalDetails().tenth(schlname, Board, month, year, percentage, tenthstate, tenthcity);
        pom.getEducationalDetails().twelfth(twelfthSchool, twelfthBoard, twelfthmonth, twelfthyear, twelfthpercentage, twelfthSkills, twelfthstate, twelfthcity);
        pom.getEducationalDetails().ug(ugskill1, ugskill2, ugskill3, ugpercentage);
        pom.getProjectAndInternship().addproject(company, projectTitle, startMonth, startYear, endMOnth, endYear, function, role, industry, description, skill1, skill2, skill3, skill4, skill5, projectcertificate);
        pom.getProjectAndInternship().addInternship(interncompany, internstartMonth, internstartYear, internendMOnth, internendYear, internfunction, internrole, internindustry, interndescription, internskill1, internskill2, internskill3, internskill4, internskill5, interncertificate);
        pom.getProjectAndInternship().projectandinternship();
        pom.getWorkExperience().experienceandaward(workJobtitle, workCompanyname, workStartmonth, workStartyear, workNoticeperiod, workFunction, workRole, workIndustry, workDescription, workSkill1, workSkill2, workSkill3, workAwardname, workAwardReceivedname, workAwardDescription, workbestperformancecertificate);
        pom.getWorkExperience().workexperience();
        pom.getCoursesAndTraining().addcourseandtraining(instituteName, Coursestartmonth, Coursestartyear, Courseendmonth, Courseendyear, CourseName, CourseDescription, Courseskill1, Courseskill2, Courseskill3, CourseCertificate);
        pom.getCoursesAndTraining().coursesandtraining();
        pom.getProofAndDocuments().addingproofanddocument(IDproof, Addressproof);
        pom.getProofAndDocuments().proofanddocument();
        pom.getAdditionalDetails().additionaldetails(caste, religion, Hobbies, lang1, lang2, careerobj);
        pom.getLogoutPage().logoutfunction();
        Tabswitcher();
        getdriver(getPropertyFileValue("gmailsignout"));
        System.out.println("Second Browser session:"+driver.getTitle());
        System.out.println("Second Browser session:"+driver.getCurrentUrl());
    }
}
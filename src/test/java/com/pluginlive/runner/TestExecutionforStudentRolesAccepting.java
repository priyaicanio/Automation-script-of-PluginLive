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

 @Test (dataProvider = "studentCredentials")
    public void loginAsStudent(String userName, String password) throws IOException, InterruptedException, AWTException {
     System.out.println("Login process begins");
     pom.getLoginPage().Login(userName,password);
 }
@DataProvider(name = "studentCredentials")
    public Object[][] data(){
        return new Object[][]{

    {"priya.t+student60@icanio.com","Priya@2606"}};
    }

@Test(priority = 1)
public void roles() throws IOException, InterruptedException {
        pom.getHomePage().rolesbutton();
}

@Test(priority = 2)
    public void roleapply() throws IOException, InterruptedException {
        pom.getRolesPage().RoleSearch(readExcelData1("ApplyRole",1,0));
        pom.getRolesPage().RoleList();
}

@Test(priority = 3)
    public void addquestionnaire() throws IOException, InterruptedException {
        pom.getQuesionnairePage().questionnaire();
}

@Test (priority = 4)
    public void feedbackforapplyingjob() throws IOException, InterruptedException, AWTException {
        pom.getFeedbackPage().feedback(readExcelData1("Feedback",1,0));
        pom.getFeedbackPage().feedbackform(readExcelData1("Feedback",1,1));

}

@Test(priority = 5)
public void appliedMsg() throws IOException {
    String actualText = "You Applied Successfully !";
    WebElement excepted =   pom.getFeedbackPage().getAppliedsuccessfullmsg();
    String exceptedText = excepted.getText();
    Assert.assertEquals(actualText, exceptedText);
}

@Test (priority = 6)
    public void done() throws IOException {
        pom.getFeedbackPage().getDoneButton();
}


}







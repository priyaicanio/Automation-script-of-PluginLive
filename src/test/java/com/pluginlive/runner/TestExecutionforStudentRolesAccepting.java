package com.pluginlive.runner;

import com.pluginlive.base.BaseClass;
import com.pluginlive.pagemanager.PageObjectManagerStudentRolesAccepting;
import com.pluginlive.pagesforStudentRolesAccepting.LoginPage;
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
   // {"priya.t+student60@icanio.com","Priya@2606"},
    //{"priya.t+student61@icanio.com","Priya@2606"},
    {"priya.t+student64@icanio.com","Priya@2606"}};
    }

@Test(priority = 1)
public void roles() throws IOException, InterruptedException {
        pom.getHomePage().rolesbutton();
}

@Test(priority = 2)
    public void roleapply() throws IOException, InterruptedException {
        pom.getRolesPage().RoleSearch();
        pom.getRolesPage().RoleList();
}





}







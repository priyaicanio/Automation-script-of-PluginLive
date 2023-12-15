package com.pluginlive.pagemanager;


import com.pluginlive.pagesforStudentsOnboarding.LoginPage;
import com.pluginlive.pagesforStudentsOnboarding.StudentRegistration;

import java.io.IOException;

public class PageObjectManagerStudentsOnboarding  {

    public LoginPage getLoginPage() throws IOException{
        return (loginPage==null)? loginPage = new LoginPage() : loginPage;
    }
    private LoginPage loginPage;

public StudentRegistration getStudentRegistration() throws IOException {
    return (studentRegistration == null)? studentRegistration = new StudentRegistration() : studentRegistration;

}
private StudentRegistration studentRegistration;













}

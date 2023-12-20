package com.pluginlive.pagemanager;


import com.pluginlive.pagesforStudentsOnboarding.*;

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

public EmailVerfication getEmailVerification() throws IOException{
    return (emailVerification == null)? emailVerification = new EmailVerfication() : emailVerification;

}
private  EmailVerfication emailVerification;


public SetPassword getSetPassword() throws IOException{
    return (setPassword == null)? setPassword = new SetPassword() : setPassword;
}
private SetPassword setPassword;

public LoginAsStudent getLoginAsStudent() throws IOException{
return ( loginAsStudent    == null)? loginAsStudent = new LoginAsStudent() : loginAsStudent;
}
private LoginAsStudent loginAsStudent;


public PersonalDetails getPersonalDetails() throws IOException {
    return (personalDetails == null)? personalDetails = new PersonalDetails() : personalDetails;

}
private PersonalDetails personalDetails;







}



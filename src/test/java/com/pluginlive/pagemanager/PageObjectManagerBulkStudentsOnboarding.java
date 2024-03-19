package com.pluginlive.pagemanager;

import com.pluginlive.pagesforBulkStudentsOnboarding.LogoutPage;
import com.pluginlive.pagesforBulkStudentsOnboarding.*;

import java.io.IOException;

public class PageObjectManagerBulkStudentsOnboarding {

    public LoginPage getLoginPage() throws IOException {
        return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
    }

    private LoginPage loginPage;

    public StudentRegistration getStudentRegistration() throws IOException {
        return (studentRegistration == null) ? studentRegistration = new StudentRegistration() : studentRegistration;

    }

    private StudentRegistration studentRegistration;

    public EmailVerfication getEmailVerification() throws IOException {
        return (emailVerification == null) ? emailVerification = new EmailVerfication() : emailVerification;

    }

    private EmailVerfication emailVerification;


    public SetPassword getSetPassword() throws IOException {
        return (setPassword == null) ? setPassword = new SetPassword() : setPassword;
    }

    private SetPassword setPassword;


    public PersonalDetails getPersonalDetails() throws IOException {
        return (personalDetails == null) ? personalDetails = new PersonalDetails() : personalDetails;

    }

    private PersonalDetails personalDetails;

    public EducationalDetails getEducationalDetails() throws IOException {
        return (educationalDetails == null) ? educationalDetails = new EducationalDetails() : educationalDetails;
    }

    private EducationalDetails educationalDetails;

    public ProjectAndInternship getProjectAndInternship() throws IOException {
        return (projectAndInternship == null) ? projectAndInternship = new ProjectAndInternship() : projectAndInternship;
    }

    private ProjectAndInternship projectAndInternship;


    public WorkExperience getWorkExperience() throws IOException {
        return (workExperience == null) ? workExperience = new WorkExperience() : workExperience;
    }

    private WorkExperience workExperience;


    public CoursesAndTraining getCoursesAndTraining() throws IOException {
        return (coursesAndTraining == null) ? coursesAndTraining = new CoursesAndTraining() : coursesAndTraining;
    }

    private CoursesAndTraining coursesAndTraining;

    public ProofAndDocuments getProofAndDocuments() throws IOException {
        return (proofAndDocuments == null) ? proofAndDocuments = new ProofAndDocuments() : proofAndDocuments;
    }

    private ProofAndDocuments proofAndDocuments;

    public AdditionalDetails getAdditionalDetails() throws IOException {
        return (additionalDetails == null) ? additionalDetails = new AdditionalDetails() : additionalDetails;
    }

    private AdditionalDetails additionalDetails;

    public UploadResume getUploadResume() throws IOException {
        return (uploadResume == null) ? uploadResume = new UploadResume() : uploadResume;
    }

    private UploadResume uploadResume;

    public UploadProfile getUploadProfile() throws IOException {
        return (uploadProfile == null)? uploadProfile = new UploadProfile() : uploadProfile;
    }
    private UploadProfile uploadProfile;


    public LogoutPage getLogoutPage() throws IOException {
        return (logoutPage == null) ? logoutPage = new LogoutPage() : logoutPage;

    }

    private LogoutPage logoutPage;

}



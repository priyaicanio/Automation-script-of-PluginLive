package com.pluginlive.pagemanager;

import com.pluginlive.pagesforBulkStudentRoleAccepting.LogoutPage;
import com.pluginlive.pagesforBulkStudentRoleAccepting.*;

import java.io.IOException;

public class PageObjectManagerBulkStudentRoleAccepting {
    public LoginPage getLoginPage() throws IOException {
        return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
    }

    private LoginPage loginPage;

    public HomePage getHomePage() throws IOException {
        return (homePage == null) ? homePage = new HomePage() : homePage;
    }

    private HomePage homePage;

    public RolesPage getRolesPage() throws IOException {
        return (rolesPage == null) ? rolesPage = new RolesPage() : rolesPage;
    }

    private RolesPage rolesPage;

    public QuestionnairePage getQuesionnairePage() throws IOException {
        return (questionnairePage == null) ? questionnairePage = new QuestionnairePage() : questionnairePage;
    }

    private QuestionnairePage questionnairePage;

    public FeedbackPage getFeedbackPage() throws IOException {
        return (feedbackPage == null) ? feedbackPage = new FeedbackPage() : feedbackPage;
    }

    private FeedbackPage feedbackPage;


    public LogoutPage getLogoutPage() throws IOException {
        return (logoutPage == null) ? logoutPage = new LogoutPage() : logoutPage;
    }

    private LogoutPage logoutPage;
}


package com.pluginlive.pagemanager;

import com.pluginlive.base.BaseClass;
import com.pluginlive.pagesforBulkCorporateRoleCreation.*;

import java.io.IOException;

public class PageObjectManagerBulkCorporateRoleCreation  {

    public LoginPage getLoginPage() throws IOException {
        return(loginPage==null)? loginPage = new LoginPage() :  loginPage;
    }
    private LoginPage loginPage;

    public DashboardPage getDashboardPage() throws IOException {
        return (dashboardPage==null)? dashboardPage = new DashboardPage() : dashboardPage;
    }
    private DashboardPage dashboardPage;

    public RolesPage getRolesPage() throws IOException {
        return (rolesPage == null) ? rolesPage = new RolesPage() : rolesPage;
    }

    private RolesPage rolesPage;

    public NewRoleJobDetailsPage getNewRoleJobDetailsPage() throws IOException{
        return (newRoleJobDetailsPage == null)? newRoleJobDetailsPage = new NewRoleJobDetailsPage(): newRoleJobDetailsPage;

    }
    private NewRoleJobDetailsPage newRoleJobDetailsPage;

    public NewRoleCTCandJobLocation getNewRoleCTCandJobLocation() throws IOException{
        return (newRoleCTCandJobLocation == null)? newRoleCTCandJobLocation = new NewRoleCTCandJobLocation():  newRoleCTCandJobLocation;
    }
    private  NewRoleCTCandJobLocation newRoleCTCandJobLocation;

    public EligibilityCriteria getEligibilityCriteria() throws IOException {
        return (eligibilityCriteria == null)? eligibilityCriteria = new EligibilityCriteria(): eligibilityCriteria;
    }
    private EligibilityCriteria eligibilityCriteria;


    public QuestionnairePage getQuestionnairePage() throws IOException{
        return (questionnairePage == null)? questionnairePage = new QuestionnairePage(): questionnairePage;
    }

    private QuestionnairePage questionnairePage;

    public InterviewWorkflowPage getInterviewWorkflowPage() throws IOException{
        return (interviewWorkflowPage == null)? interviewWorkflowPage = new InterviewWorkflowPage(): interviewWorkflowPage;
    }

    private  InterviewWorkflowPage interviewWorkflowPage;


    public LogoutPage getLogoutPage() throws IOException {
        return(logoutPage==null)? logoutPage = new LogoutPage() :  logoutPage;
    }
    private LogoutPage logoutPage;




}

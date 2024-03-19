package com.pluginlive.pagemanager;


import com.pluginlive.pagesforCorporateDriveCreation.*;

import java.io.IOException;

public class PageObjectManagerCorporateDriveCreation {

    public LoginPage getLoginPage() throws IOException {
        return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
    }

    private LoginPage loginPage;

    public DashboardPage getDashboardPage() throws IOException {
        return (dashboardPage == null) ? dashboardPage = new DashboardPage() : dashboardPage;
    }

    private DashboardPage dashboardPage;

    public RolesPage getRolesPage() throws IOException {
        return (rolesPage == null) ? rolesPage = new RolesPage() : rolesPage;
    }

    private RolesPage rolesPage;


    public DrivePage getDrivePage() throws IOException {
        return (drivePage == null) ? drivePage = new DrivePage() : drivePage;
    }

    private DrivePage drivePage;



    public ViewRolePage getViewRolePage() throws IOException {
        return (viewRolePage == null)? viewRolePage = new ViewRolePage() : viewRolePage;
    }
private ViewRolePage viewRolePage;

}

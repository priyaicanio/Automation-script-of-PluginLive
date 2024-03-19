package com.pluginlive.pagemanager;


import com.pluginlive.pagesforInstituteRoleAccepting.HomePage;
import com.pluginlive.pagesforInstituteRoleAccepting.LoginPage;
import com.pluginlive.pagesforInstituteRoleAccepting.RolesPage;

import java.io.IOException;

public class PageObjectManagerInstituteRoleAccepting {

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

}

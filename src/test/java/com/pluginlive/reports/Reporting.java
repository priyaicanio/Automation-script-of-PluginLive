package com.pluginlive.reports;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Reporting {
    public static void generateJVMReport(String jSONFile){

        File file = new File("C:\\PluginLive Automation\\PluginLive Automation\\target\\pluginlivejvmreport");
        Configuration configuration = new Configuration(file, "PluginLive Automation");

        configuration.addClassifications("Browser", "Chrome");
        configuration.addClassifications("Browserversion","119.0.6045.124");
        configuration.addClassifications("OS","WINDOW10");
        configuration.addClassifications("Sprint","10");

        List<String> jSONFiles = new ArrayList<String>();
        jSONFiles.add(jSONFile);
        ReportBuilder builder = new ReportBuilder(jSONFiles,configuration);
        builder.generateReports();


    }
}

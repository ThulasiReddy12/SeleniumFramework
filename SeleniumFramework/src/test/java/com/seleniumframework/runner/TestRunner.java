package com.seleniumframework.runner;

import com.seleniumframework.report.CucumberExtentReport;
import io.cucumber.java.AfterStep;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;


@CucumberOptions(
        features = {"."},
        glue = {"com.seleniumframework.stepdefinitions"},
        monochrome = true,
//        dryRun = true,
        tags = "~@Ignore",
        plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/MyReports/cucumber.json", "testng:target/MyReports/report.xml",
                "html:target/cucumber-html-report.html","rerun:target/failedRerun.txt"})
public class TestRunner extends AbstractTestNGCucumberTests {
    @AfterSuite
    public void generateReport() {
        CucumberExtentReport.cucumberReports();
    }

  
}
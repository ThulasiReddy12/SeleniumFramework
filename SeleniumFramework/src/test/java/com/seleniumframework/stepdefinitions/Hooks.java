package com.seleniumframework.stepdefinitions;

import com.seleniumframework.base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Properties;

public class Hooks extends BaseClass {
    @Before
    public void initializeTestBrowser(){
        BaseClass.selectDriver("chrome");
        Properties  testProp = readProperties("src/test/resources/Properties/config.properties");
        openBrowser(testProp.getProperty("baseUrl"));
        driver.manage().window().maximize();
    }

    @AfterStep
    public void after(Scenario scenario) throws IOException {
        File fi = new File(captureScreenshot(scenario.getName(), "stepScreenshot"));
        byte[] fileContent = Files.readAllBytes(fi.toPath());
        scenario.attach(fileContent, "image/png", scenario.getName());
    }

    @After
    public void tearDown(){
        BaseClass.driver.quit();
    }
}

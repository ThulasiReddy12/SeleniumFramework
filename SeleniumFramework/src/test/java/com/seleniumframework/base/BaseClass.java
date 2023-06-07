package com.seleniumframework.base;

import com.seleniumframework.constants.IConstants;
import com.seleniumframework.logs.Log;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class BaseClass implements IConstants {
    public static WebDriver driver;

    public static WebDriver selectDriver(String browser) {

        switch (browser) {
            case "chrome": //chrome driver
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-notifications");
                Log.info("chrome browser is selected");
                driver = new ChromeDriver(options);
                break;
            case "firefox"://firefox driver
                WebDriverManager.firefoxdriver().setup();
                Log.info("firefox browser is selected");
                driver = new FirefoxDriver();
                break;
            case "edge"://edge driver
                WebDriverManager.edgedriver().setup();
                Log.info("edge browser is selected");
                driver = new EdgeDriver();
                break;
            case "opera"://opera driver
                WebDriverManager.operadriver().setup();
                Log.info("opera browser is selected");
                driver = new OperaDriver();
                break;
            default: System.out.println("Please provide browser name");
        }

        return driver;
    }

    public Properties readProperties(String path) {

            Properties prop = new Properties();
            try {
                File file = new File(path);
                if (!file.exists()) {
                    throw new FileNotFoundException("File doesn't exits");
                }
                FileInputStream fis = new FileInputStream(file);

                prop.load(fis);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return prop;
    }
    public static void openBrowser(String url){
        driver.get(url);
    }

    public String captureScreenshot(String screenshotName, String result) {
        String date = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());

        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);


        String destPath = "./screenshots/" + result + "/" + screenshotName + "_" + date + ".png";
        File destFile = new File(destPath);

        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destPath;
    }

}

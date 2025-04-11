package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.DeepSeaUmang;
import pages.HomePageUmang;
import pages.RolexWatchUmang;
import utils.Base;
import utils.GenerateReport;

public class TestAppUmang extends Base {
    public static ExtentReports reports;
    public static ExtentTest test;

    @BeforeClass
    public static void reportGenerate() {
        reports = GenerateReport.initializeExtentReport("Mayors_Report");

    }

    @BeforeMethod
    public void configBrowser() {
        openBrowser();

        
    }

    @Test
    public static void TestOne() {
        test = reports.createTest(Thread.currentThread().getName());


        HomePageUmang.allHomePageActions(test);
        RolexWatchUmang.allrolex(test);

    }
    @Test
    public static void TestTwo() {
        test = reports.createTest(Thread.currentThread().getName());

        HomePageUmang.allhomedeepseaAction(test);
        DeepSeaUmang.allDeepseaActions(test);

    }

    @AfterMethod
    public void tearBrowser() {
        driver.quit();
    }

    @AfterClass
    public static void ReportFlush() {
        reports.flush();
    }
}

package runner;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import pages.FooterRedirectionActions_Ram;
import pages.HomePageActions_Ram;
import utils.Base;
import utils.GenerateReport;

public class TestRunner_Ram extends Base {

    FooterRedirectionActions_Ram redirect = new FooterRedirectionActions_Ram();
    HomePageActions_Ram homepage = new HomePageActions_Ram();
    public ExtentTest test;
    public ExtentReports report;
    //ram
    @BeforeClass
    public void createReport(){
        report = GenerateReport.initializeExtentReport("Mayors_Report");
    }
    //ram
    @BeforeMethod
    public void browserConfig() {
        openBrowser();
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        
    }
    //ram

    @Test
    public void verifyingFooterLinks(){

        test = report.createTest("Mayors_Ram");
        homepage.yourSecurityVerification();
        homepage.termsVerification();
        homepage.privacyPolicyVerification();
        homepage.cookiePolicyVerification();
        homepage.accessibilityVerification();
        homepage.payByLinkVerification();
        homepage.watchesVerification();
        homepage.jweleryVerification();
        homepage.categoryVerification();
    }

    //ram
    @AfterMethod
    public void killBrowser() {
        driver.quit();
    }
    //ram
    @AfterClass
    public void flush(){
        report.flush();
    }

}

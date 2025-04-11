package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.BrandHomepage;
import pages.JewelryHomepage;
import pages.MensWatchpage;
import pages.ProductPage;
import pages.Ringproductpage;
import pages.Ringspage;
import utils.Base;
import utils.GenerateReport;

public class TestRunnerYash extends Base {
    public static ExtentTest test;
    public static ExtentReports reports;
    @BeforeClass
    public static void makeRep(){
        reports = GenerateReport.initializeExtentReport("Mayors_Reports");

        
        
    }
    @BeforeMethod
    public void openBr() {

        openBrowser();

    }

    @Test(priority = 1, enabled = true)
    public void brandcase() {
        test = reports.createTest(Thread.currentThread().getName());
        BrandHomepage.brandsOmegaClick(test);
        MensWatchpage.mensWatchClick(test);
        ProductPage.AddProductShoppingBag(test);

    }

    @Test(priority = 2, enabled = true)
    public void chanelCase() {
        test = reports.createTest(Thread.currentThread().getName());
        JewelryHomepage.HomepageJwelryClick(test);
        Ringspage.ClickRingFilter(test);
        Ringproductpage.firstProduct(test);

    }

    @AfterMethod
    public void quitDr() {
        driver.quit();
    }
    @AfterClass
    public static void flushRep(){
        reports.flush();
    }

}
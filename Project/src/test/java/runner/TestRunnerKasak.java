package runner;
 
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
 
import pages.FooterResult_Kasak;
import pages.HomePage_Kasak;
import utils.Base;
import utils.GenerateReport;
 
public class TestRunnerKasak extends Base {
    public static ExtentReports reports;
    public static ExtentTest test;
 
    @BeforeClass
    public static void RepGeneration(){
        reports = GenerateReport.initializeExtentReport("Mayors_Report");
 
    }
 
    @BeforeMethod
    public void browserConfig(){
        openBrowser();
       
    }
   
    @Test
    public void TestCaseTen(){
        test = reports.createTest(Thread.currentThread().getName());
        HomePage_Kasak.Categories(test);
        FooterResult_Kasak.verifyAllTerms(test);
       
   
 
       
 
       
    }
   
    @Test
    public void TestCaseNoTen(){
        test = reports.createTest(Thread.currentThread().getName());
       
       
 
    }
 
    @AfterMethod
    public void driverClose(){
        driver.quit();
    }
 
    @AfterClass
    public static void repFlush(){
        reports.flush();
    }
 
   
}
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
        reports = GenerateReport.createReporter("Mayors_Report");

    }

    @BeforeMethod
    public void browserConfig(){
        openBrowser();
        
    }
    
    @Test
    public void TestCaseTen(){
        test = reports.createTest(Thread.currentThread().getName());
        HomePage_Kasak.AboutMayors(test);
        HomePage_Kasak.careersFunc(test);
        HomePage_Kasak.sustainFunc(test);
        HomePage_Kasak.pressRoomFunc(test);
        HomePage_Kasak.newsletterFunc(test);
        HomePage_Kasak.categoriesFunc(test);

        FooterResult_Kasak actions = new FooterResult_Kasak();
        actions.aboutMayorsVerify(test);
        actions.pressMediaVerify(test);
        actions.careersVerify(test);
        actions.sustainVerify(test);
        actions.newsletterVerify(test);
        actions.weddingVerify(test);
        actions.rolexVerify(test);
        actions.brandVerify(test);

        
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


package runner;

import java.time.Duration;
import java.util.logging.Logger;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages.HomePageDiv;
import pages.ProductBuyingActionDiv;
import pages.RingPageActionDiv;
import pages.WeddingPageActionDiv;
import utils.Base;
import utils.GenerateReport;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class TestAppDiv extends Base{

public static ExtentReports reports;
public static ExtentTest test;

@BeforeTest
public void openreport()
{
    reports=GenerateReport.createReporter("Mayors Report");
}
@BeforeMethod
public void setupbrowser()
{
   openBrowser();
   
}
@Test
public void test1() throws InterruptedException
{
    test=reports.createTest(Thread.currentThread().getName());

    HomePageDiv.homepageaction(test);

    WeddingPageActionDiv.weddingaction(test);

    ProductBuyingActionDiv.braceletproductbuying(test);
 
}
@Test
public void test2() throws InterruptedException
{
    test=reports.createTest(Thread.currentThread().getName());

    HomePageDiv.homepageactionring(test);

    RingPageActionDiv.selectingring(test);

    ProductBuyingActionDiv.ringbuying(test);

}
@AfterTest
public void reported()
{
    reports.flush();
}
@AfterMethod
public void quitBrowser()
{
   if(driver!=null)
   {
    driver.quit();
   }
}


    
}

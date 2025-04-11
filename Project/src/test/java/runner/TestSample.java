package runner;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.EarringPage_Siva;
import pages.HomePage_Siva;
import utils.Base;
import utils.ExcelReader;
import utils.WebDriverHelper;

public class TestSample extends Base {
    WebDriverHelper wb = new WebDriverHelper();
    HomePage_Siva homeAction = new HomePage_Siva(wb);
    EarringPage_Siva earringAction = new EarringPage_Siva(wb);
    
    @BeforeMethod
    public void browserConfig(){
        openBrowser();
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }
    @Test 
    public void earringMethod(){
        try {
            // homeAction.searchBarAction("Earrings");
            homeAction.searchBarAction( ExcelReader.readCellValue("Sheet1", "31", "value"));
            earringAction.earringAction();
            }
         catch (Exception e) {
            e.printStackTrace();
        }
        }

    @Test 
    public void footersVerification(){
        try {
            homeAction.footerVerification();
             } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterMethod 
    public void tearDownBrowser(){
        try {
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

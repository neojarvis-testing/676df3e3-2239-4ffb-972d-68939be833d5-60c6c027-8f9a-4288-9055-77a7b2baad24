package pages;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.DeepSeaLocatorUmang;
import utils.Assertion;

import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class DeepSeaUmang {
    public static void clickOnRolex(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(DeepSeaLocatorUmang.rolexwatches, 5);
            wb.clickOnElement(DeepSeaLocatorUmang.rolexwatches);
            test.log(Status.INFO, wb.getText(DeepSeaLocatorUmang.rolexwatches));

        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    public static void clickOnDiscoverRolex(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(DeepSeaLocatorUmang.discoverrolex, 5);
            wb.clickOnElement(DeepSeaLocatorUmang.rolexwatches);
            test.log(Status.INFO, wb.getText(DeepSeaLocatorUmang.discoverrolex));

        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    public static void clickOnNewWatches(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(DeepSeaLocatorUmang.newwatches, 5);
            wb.clickOnElement(DeepSeaLocatorUmang.newwatches);
            test.log(Status.INFO, wb.getText(DeepSeaLocatorUmang.newwatches));

        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    public static void clickOnWatchmaking(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(DeepSeaLocatorUmang.watchmaking, 5);
            wb.clickOnElement(DeepSeaLocatorUmang.watchmaking);
            Screenshot.captureScreenshot(wb.getText(DeepSeaLocatorUmang.watchmaking));
            test.log(Status.INFO, wb.getText(DeepSeaLocatorUmang.watchmaking));

        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    public static void verifyRolex(ExtentTest test) {
        WebDriverHelper wb = new WebDriverHelper();
          Assertion.assertionVerifyByEqual(wb.getText(DeepSeaLocatorUmang.verifyrolex), ExcelReader.readCellValue("Sheet3", "4", "value"), test);
    
    }

    public static void allDeepseaActions(ExtentTest test) {

        clickOnRolex(test);
        clickOnDiscoverRolex(test);
        clickOnNewWatches(test);
        clickOnWatchmaking(test);
        verifyRolex(test);
    }
}

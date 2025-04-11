package pages;

/**
 * @Created by Umang Raj
 * @Description Class to perform and verify various actions related to DeepSea watches.
 */

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.DeepSeaLocatorUmang;
import utils.Assertion;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class DeepSeaUmang {

    /**
     * @Description Clicks on the 'Rolex Watches' element after waiting for it to be visible.
     * @param test An ExtentTest instance for logging and reporting.
     */
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

    /**
     * @Description Clicks on the 'Discover Rolex' element after waiting for it to be visible.
     * @param test An ExtentTest instance for logging and reporting.
     */
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

    /**
     * @Description Clicks on the 'New Watches' element after waiting for it to be visible.
     * @param test An ExtentTest instance for logging and reporting.
     */
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

    /**
     * @Description Clicks on the 'Watchmaking' element, captures a screenshot, and logs information.
     * @param test An ExtentTest instance for logging and reporting.
     */
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

    /**
     * @Description Verifies the text of the 'Rolex' element against the expected value.
     * @param test An ExtentTest instance for logging and reporting.
     */
    public static void verifyRolex(ExtentTest test) {
        WebDriverHelper wb = new WebDriverHelper();
        Assertion.assertionVerifyByEqual(wb.getText(DeepSeaLocatorUmang.verifyrolex),
                ExcelReader.readCellValue("Sheet1", "4", "value"), test);
    }

    /**
     * @Description Executes all DeepSea-related actions sequentially: clicking on Rolex options,
     *              watch categories, and verifying Rolex details.
     * @param test An ExtentTest instance for logging and reporting.
     */
    public static void allDeepseaActions(ExtentTest test) {
        clickOnRolex(test);
        clickOnDiscoverRolex(test);
        clickOnNewWatches(test);
        clickOnWatchmaking(test);
        verifyRolex(test);
    }
}
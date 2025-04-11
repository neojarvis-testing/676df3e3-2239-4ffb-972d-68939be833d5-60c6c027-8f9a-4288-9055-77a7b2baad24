package pages;

/**
 * @Created by Yash
 * @Description Class for handling actions related to Men's Watches, including interacting with popups and selecting watches.
 */

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.BrandLocators;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class MensWatchpage {

    /**
     * @Description Executes the flow for Men's Watches by handling popups and navigating to the watches section.
     * @param test An ExtentTest instance for reporting.
     */
    public static void mensWatchClick(ExtentTest test) {
        popUp(test);
        mensWatch(test);
    }

    /**
     * @Description Handles the popup by clicking on the popup element if it is present.
     * @param test An ExtentTest instance for reporting.
     */
    public static void popUp(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.clickOnElement(BrandLocators.popup);
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Navigates to the Men's Watches section by hovering and clicking on the respective element.
     * @param test An ExtentTest instance for reporting.
     */
    public static void mensWatch(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(BrandLocators.mens_watches, 5);
            wb.hoverOverElement(BrandLocators.mens_watches);
            wb.clickOnElement(BrandLocators.mens_watches);
            LoggerHandler.info(wb.getText(BrandLocators.mens_watches));
            test.log(Status.INFO, wb.getText(BrandLocators.mens_watches));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }
}
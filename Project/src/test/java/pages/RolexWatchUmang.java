package pages;

/**
 * @Created by Umang Raj
 * @Description Class for handling actions and filters related to Rolex watches.
 */

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.RolexWatchLocatorUmang;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class RolexWatchUmang {

    /**
     * @Description Handles the popup by waiting for its visibility and clicking on it.
     * @param test An ExtentTest instance for reporting.
     */
    public static void popup(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(RolexWatchLocatorUmang.popup, 5);
            wb.clickOnElement(RolexWatchLocatorUmang.popup);
            LoggerHandler.info(wb.getText(RolexWatchLocatorUmang.popup));
            test.log(Status.INFO, wb.getText(RolexWatchLocatorUmang.popup));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Applies the "For Him" filter by waiting for its visibility and clicking on it.
     * @param test An ExtentTest instance for reporting.
     */
    public static void forhimfilter(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(RolexWatchLocatorUmang.ForHim, 5);
            wb.clickOnElement(RolexWatchLocatorUmang.ForHim);
            LoggerHandler.info(wb.getText(RolexWatchLocatorUmang.ForHim));
            test.log(Status.INFO, wb.getText(RolexWatchLocatorUmang.ForHim));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Filters by brand (e.g., Cartier) by waiting for its visibility and clicking on it.
     * @param test An ExtentTest instance for reporting.
     */
    public static void brandfilter(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(RolexWatchLocatorUmang.Cartier, 5);
            wb.clickOnElement(RolexWatchLocatorUmang.Cartier);
            LoggerHandler.info(wb.getText(RolexWatchLocatorUmang.Cartier));
            test.log(Status.INFO, wb.getText(RolexWatchLocatorUmang.Cartier));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Applies the dial color filter (e.g., Black) by waiting for elements and clicking on them.
     * @param test An ExtentTest instance for reporting.
     */
    public static void dialColorfilter(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(RolexWatchLocatorUmang.DialColor, 5);
            wb.clickOnElement(RolexWatchLocatorUmang.DialColor);
            LoggerHandler.info(wb.getText(RolexWatchLocatorUmang.DialColor));
            test.log(Status.INFO, wb.getText(RolexWatchLocatorUmang.DialColor));

            wb.waitForElementToBeVisible(RolexWatchLocatorUmang.Black, 5);
            wb.clickOnElement(RolexWatchLocatorUmang.Black);
            LoggerHandler.info(wb.getText(RolexWatchLocatorUmang.Black));
            test.log(Status.INFO, wb.getText(RolexWatchLocatorUmang.Black));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Selects the first product from the Rolex watches and logs the action.
     * @param test An ExtentTest instance for reporting.
     */
    public static void firstproductfrolex(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(RolexWatchLocatorUmang.firstProduct, 5);
            wb.clickOnElement(RolexWatchLocatorUmang.firstProduct);
            LoggerHandler.info(wb.getText(RolexWatchLocatorUmang.firstProduct));
            test.log(Status.INFO, wb.getText(RolexWatchLocatorUmang.firstProduct));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Adds the Rolex watch to the bag and logs the action.
     * @param test An ExtentTest instance for reporting.
     */
    public static void rolexwatchfilters(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(RolexWatchLocatorUmang.addtobag, 5);
            wb.clickOnElement(RolexWatchLocatorUmang.addtobag);
            LoggerHandler.info(wb.getText(RolexWatchLocatorUmang.addtobag));
            test.log(Status.INFO, wb.getText(RolexWatchLocatorUmang.addtobag));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Executes all Rolex-related actions sequentially, including handling popups, applying filters, and adding to the bag.
     * @param test An ExtentTest instance for reporting.
     */
    public static void allrolex(ExtentTest test) {
        popup(test);
        forhimfilter(test);
        brandfilter(test);
        dialColorfilter(test);
        firstproductfrolex(test);
        rolexwatchfilters(test);
    }
}
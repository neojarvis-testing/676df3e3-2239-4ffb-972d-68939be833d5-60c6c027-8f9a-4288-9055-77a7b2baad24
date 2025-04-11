package pages;

/**
 * @Created by Yash
 * @Description Class for performing filter actions on the Rings page, including brand collection and metal type filters.
 */

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.JewelryLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class Ringspage {

    /**
     * @Description Executes all ring filter actions, including selecting rings, applying brand filters, 
     *              choosing a collection, and setting the metal type filter.
     * @param test An ExtentTest instance for reporting.
     */
    public static void ClickRingFilter(ExtentTest test) {
        clickOnRings(test);
        clickOnBrandCollectionFilter(test);
        clickOnCocoCrush(test);
        clickOnMetalTypeFilter(test);
        clickOnWhiteGold(test);
    }

    /**
     * @Description Clicks on the 'Rings' filter, including hovering and interaction logging.
     * @param test An ExtentTest instance for reporting.
     */
    public static void clickOnRings(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(JewelryLocator.Rings, 0);
            wb.hoverOverElement(JewelryLocator.Rings);
            wb.clickOnElement(JewelryLocator.Rings);
            LoggerHandler.info(wb.getText(JewelryLocator.Rings));
            test.log(Status.INFO, wb.getText(JewelryLocator.Rings));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Clicks on the 'Brand Collection Filter' element to apply the desired brand filter.
     * @param test An ExtentTest instance for reporting.
     */
    public static void clickOnBrandCollectionFilter(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(JewelryLocator.brandCollectionfilter, 5);
            wb.hoverOverElement(JewelryLocator.brandCollectionfilter);
            wb.clickOnElement(JewelryLocator.brandCollectionfilter);
            LoggerHandler.info(wb.getText(JewelryLocator.brandCollectionfilter));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Selects the 'Coco Crush' collection from the brand collection filter options.
     * @param test An ExtentTest instance for reporting.
     */
    public static void clickOnCocoCrush(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(JewelryLocator.cococrush, 5);
            wb.hoverOverElement(JewelryLocator.cococrush);
            wb.clickOnElement(JewelryLocator.cococrush);
            LoggerHandler.info(wb.getText(JewelryLocator.cococrush));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Clicks on the 'Metal Type Filter' to select a specific metal type.
     * @param test An ExtentTest instance for reporting.
     */
    public static void clickOnMetalTypeFilter(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(JewelryLocator.metalTypefilter, 5);
            wb.hoverOverElement(JewelryLocator.metalTypefilter);
            wb.clickOnElement(JewelryLocator.metalTypefilter);
            LoggerHandler.info(wb.getText(JewelryLocator.metalTypefilter));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Selects 'White Gold' from the metal type filter options.
     * @param test An ExtentTest instance for reporting.
     */
    public static void clickOnWhiteGold(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(JewelryLocator.whitegold, 5);
            wb.hoverOverElement(JewelryLocator.whitegold);
            wb.clickOnElement(JewelryLocator.whitegold);
            LoggerHandler.info(wb.getText(JewelryLocator.whitegold));
            test.log(Status.INFO, wb.getText(JewelryLocator.whitegold));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }
}
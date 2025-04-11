package pages;

/**
 * @Created by Umang Raj
 * @Description Class for performing various homepage actions and verifications.
 */

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocatorUmang;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HomePageUmang {

    /**
     * @Description Verifies the page title against the expected value.
     * @param test An ExtentTest instance for reporting.
     */
    public static void verifyTitle(ExtentTest test) {
        Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("Sheet1", "1", "value"), test);
    }

    /**
     * @Description Accepts cookies by clicking on the cookies element and logs the action.
     * @param test An ExtentTest instance for reporting.
     */
    public static void acceptcookies(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.clickOnElement(HomePageLocatorUmang.cookies);
            LoggerHandler.info(wb.getText(HomePageLocatorUmang.cookies));
            test.log(Status.INFO, wb.getText(HomePageLocatorUmang.cookies));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Hovers over the 'Watches' element and logs the action.
     * @param test An ExtentTest instance for reporting.
     */
    public static void hoverOnwatches(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(HomePageLocatorUmang.watches, 5);
            wb.hoverOverElement(HomePageLocatorUmang.watches);
            test.log(Status.INFO, wb.getText(HomePageLocatorUmang.watches));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Verifies the title of the 'Best Sellers' page against the expected value.
     * @param test An ExtentTest instance for reporting.
     */
    public static void verifyBestSellers(ExtentTest test) {
        Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("Sheet1", "2", "value"), test);
    }

    /**
     * @Description Clicks on the 'Best Sellers' element and logs the action.
     * @param test An ExtentTest instance for reporting.
     */
    public static void clickOnBestSeller(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(HomePageLocatorUmang.Bestsellers, 5);
            wb.clickOnElement(HomePageLocatorUmang.Bestsellers);
            LoggerHandler.info(wb.getText(HomePageLocatorUmang.Bestsellers));
            test.log(Status.INFO, wb.getText(HomePageLocatorUmang.Bestsellers));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Executes all homepage actions sequentially, including verifying the title, accepting cookies, 
     *              hovering over watches, verifying best sellers, and clicking on the best seller.
     * @param test An ExtentTest instance for reporting.
     */
    public static void allHomePageActions(ExtentTest test) {
        verifyTitle(test);
        acceptcookies(test);
        hoverOnwatches(test);
        verifyBestSellers(test);
        clickOnBestSeller(test);
    }

    /**
     * @Description Hovers over the 'Rolex' element and logs the action.
     * @param test An ExtentTest instance for reporting.
     */
    public static void hoveronRolex(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.hoverOverElement(HomePageLocatorUmang.rolex);
            test.log(Status.INFO, wb.getText(HomePageLocatorUmang.rolex));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Clicks on the 'DeepSea' element and logs the action.
     * @param test An ExtentTest instance for reporting.
     */
    public static void clickOnDeepSea(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(HomePageLocatorUmang.deepsea, 5);
            wb.clickOnElement(HomePageLocatorUmang.deepsea);
            test.log(Status.INFO, wb.getText(HomePageLocatorUmang.deepsea));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Verifies the title of the 'DeepSea' page against the expected value.
     * @param test An ExtentTest instance for reporting.
     */
    public static void verifyDeepSea(ExtentTest test) {
        Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("Sheet1", "3", "value"), test);
    }

    /**
     * @Description Executes all actions related to DeepSea, including accepting cookies, hovering on Rolex, 
     *              clicking on DeepSea, and verifying the DeepSea page.
     * @param test An ExtentTest instance for reporting.
     */
    public static void allhomedeepseaAction(ExtentTest test) {
        acceptcookies(test);
        hoveronRolex(test);
        clickOnDeepSea(test);
        verifyDeepSea(test);
    }
}
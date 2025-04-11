package pages;

/**
 * @Created by Yash
 * @Description Class for handling actions on the Brand Homepage, such as interacting with cookies,
 *              hovering on brands, and navigating to the Omega section.
 */

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.BrandLocators;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class BrandHomepage {

    /**
     * @Description Executes the complete flow for interacting with the brand homepage,
     *              including handling cookies, hovering on brands, and clicking on Omega.
     * @param test An ExtentTest instance for reporting.
     */
    public static void brandsOmegaClick(ExtentTest test) {
        cookiesclick(test);
        hoverBrand(test);
        omegaClick(test);
    }

    /**
     * @Description Handles cookies acceptance by waiting for the element to be clickable and interacting with it.
     * @param test An ExtentTest instance for reporting.
     */
    public static void cookiesclick(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(BrandLocators.cookies, 5);
            wb.clickOnElement(BrandLocators.cookies);
            LoggerHandler.info(wb.getText(BrandLocators.cookies));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Hovers over the "Brands" element and logs the interaction.
     * @param test An ExtentTest instance for reporting.
     */
    public static void hoverBrand(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(BrandLocators.brands, 5);
            wb.hoverOverElement(BrandLocators.brands);
            LoggerHandler.info(wb.getText(BrandLocators.brands));
            test.log(Status.INFO, wb.getText(BrandLocators.brands));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Navigates to the Omega section by hovering over and clicking on the Omega element.
     * @param test An ExtentTest instance for reporting.
     */
    public static void omegaClick(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(BrandLocators.omega, 5);
            wb.hoverOverElement(BrandLocators.omega);
            wb.clickOnElement(BrandLocators.omega);
            LoggerHandler.info(wb.getText(BrandLocators.omega));
            test.log(Status.INFO, wb.getText(BrandLocators.omega));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }
}
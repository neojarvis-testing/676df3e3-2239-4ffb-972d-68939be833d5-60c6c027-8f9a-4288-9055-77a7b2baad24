package pages;

/**
 * @Created by Yash
 * @Description Class for handling actions on the Jewelry Homepage, such as accepting cookies,
 *              interacting with jewelry elements, and navigating through popups.
 */

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.BrandLocators;
import uistore.JewelryLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class JewelryHomepage {

    /**
     * @Description Executes the complete flow of actions on the jewelry homepage, including cookies acceptance,
     *              hovering on jewelry, clicking on "Chanel", and handling popups.
     * @param test An ExtentTest instance for reporting.
     */
    public static void HomepageJwelryClick(ExtentTest test) {
        clickOnCookies(test);
        hoverOnJewelry(test);
        clickOnchanel(test);
        clickOnPopUp(test);
    }

    /**
     * @Description Handles the acceptance of cookies by hovering over and clicking the cookies element.
     * @param test An ExtentTest instance for reporting.
     */
    public static void clickOnCookies(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.hoverOverElement(JewelryLocator.cookies);
            wb.clickOnElement(JewelryLocator.cookies);
            LoggerHandler.info(wb.getText(JewelryLocator.cookies));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Hovers over the jewelry element and logs the interaction.
     * @param test An ExtentTest instance for reporting.
     */
    public static void hoverOnJewelry(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(JewelryLocator.jwelery, 5);
            wb.hoverOverElement(JewelryLocator.jwelery);
            LoggerHandler.info(wb.getText(JewelryLocator.jwelery));
            test.log(Status.INFO, wb.getText(JewelryLocator.jwelery));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Clicks on the "Chanel" element on the jewelry homepage and logs the action.
     * @param test An ExtentTest instance for reporting.
     */
    public static void clickOnchanel(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.clickOnElement(JewelryLocator.chanel);
            LoggerHandler.info(wb.getText(JewelryLocator.chanel));
            test.log(Status.INFO, wb.getText(JewelryLocator.chanel));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Handles the popup on the jewelry homepage by hovering and clicking on it.
     * @param test An ExtentTest instance for reporting.
     */
    public static void clickOnPopUp(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(JewelryLocator.popup, 10);
            wb.hoverOverElement(JewelryLocator.popup);
            wb.clickOnElement(JewelryLocator.popup);
            LoggerHandler.info(wb.getText(JewelryLocator.popup));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }
}
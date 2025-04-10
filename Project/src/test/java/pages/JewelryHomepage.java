package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.BrandLocators;
import uistore.JewelryLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class JewelryHomepage {

    public static void HomepageJwelryClick(ExtentTest test) {
        clickOnCookies(test);
        hoverOnJewelry(test);
        clickOnchanel(test);
        clickOnPopUp(test);

    }

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
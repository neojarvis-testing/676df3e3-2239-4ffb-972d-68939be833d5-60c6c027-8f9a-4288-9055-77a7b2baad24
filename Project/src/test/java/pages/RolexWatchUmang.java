package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.RolexWatchLocatorUmang;

import utils.LoggerHandler;
import utils.WebDriverHelper;

public class RolexWatchUmang {

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

    public static void allrolex(ExtentTest test) {
        popup(test);
        forhimfilter(test);
        brandfilter(test);
        dialColorfilter(test);
        firstproductfrolex(test);
        rolexwatchfilters(test);

    }
}

package pages;



import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocatorUmang;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;

import utils.WebDriverHelper;

public class HomePageUmang {

    public static void verifyTitle(ExtentTest test) {
     
      Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("Sheet3", "1", "value"), test);

    }

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

   
    public static void verifyBestSellers(ExtentTest test) {
        Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("Sheet3", "2", "value"), test);

    }

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

    public static void allHomePageActions(ExtentTest test) {
        verifyTitle(test);
        acceptcookies(test);
        hoverOnwatches(test);
        verifyBestSellers(test);
        clickOnBestSeller(test);
    }

    public static void hoveronRolex(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.hoverOverElement(HomePageLocatorUmang.rolex);

            test.log(Status.INFO, wb.getText(HomePageLocatorUmang.rolex));

        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

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

    public static void verifyDeepSea(ExtentTest test) {
        Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("Sheet3", "3", "value"), test);
    }

    public static void allhomedeepseaAction(ExtentTest test) {
        acceptcookies(test);
        hoveronRolex(test);
        clickOnDeepSea(test);
        verifyDeepSea(test);
    }

}

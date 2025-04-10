package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.BrandLocators;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class MensWatchpage {

    public static void mensWatchClick(ExtentTest test) {
        popUp(test);
        mensWatch(test);
    }

    public static void popUp(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.clickOnElement(BrandLocators.popup);
            

        } catch (Exception e) {
             LoggerHandler.info(e.getMessage());
        }
    }

    public static void mensWatch(ExtentTest test) {
        try {

            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(BrandLocators.mens_watches, 5);
            wb.hoverOverElement(BrandLocators.mens_watches);
            wb.clickOnElement(BrandLocators.mens_watches);
             Assertion.assertionVerifyByEqual(wb.getText(BrandLocators.mens_watches), ExcelReader.readCellValue("sheet6","4"  ,"value"), test);
             LoggerHandler.info(wb.getText(BrandLocators.mens_watches));
               test.log(Status.INFO, wb.getText(BrandLocators.mens_watches));

        } catch (Exception e) {
             LoggerHandler.info(e.getMessage());
        }
    }

}
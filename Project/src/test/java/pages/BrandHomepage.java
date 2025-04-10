package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.BrandLocators;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class BrandHomepage {

    public static void brandsOmegaClick(ExtentTest test) {
        cookiesclick(test);
        hoverBrand(test);
        omegaClick(test);

    }

    public static void cookiesclick(ExtentTest test) {
        try {

            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(BrandLocators.cookies, 5);
            Assertion.assertionVerifyByEqual(wb.getText(BrandLocators.cookies),
                    ExcelReader.readCellValue("sheet6", "1", "value"), test);
            wb.clickOnElement(BrandLocators.cookies);
            LoggerHandler.info(wb.getText(BrandLocators.cookies));
        } catch (Exception e) {

            LoggerHandler.info(e.getMessage());
        }

    }

    public static void hoverBrand(ExtentTest test) {
        try {

            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(BrandLocators.brands, 5);
            Assertion.assertionVerifyByEqual(wb.getText(BrandLocators.brands),
                    ExcelReader.readCellValue("sheet6", "2", "value"), test);
            wb.hoverOverElement(BrandLocators.brands);
            LoggerHandler.info( wb.getText(BrandLocators.brands));
            test.log(Status.INFO, wb.getText(BrandLocators.brands));



        } catch (Exception e) {

            LoggerHandler.info(e.getMessage());
          

        }

    }

    public static void omegaClick(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(BrandLocators.omega, 5);
            wb.hoverOverElement(BrandLocators.omega);
            Assertion.assertionVerifyByEqual(wb.getText(BrandLocators.omega),
                    ExcelReader.readCellValue("sheet6", "3", "value"), test);
            wb.clickOnElement(BrandLocators.omega);
            LoggerHandler.info(wb.getText(BrandLocators.omega));
            test.log(Status.INFO, wb.getText(BrandLocators.omega));

        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }

    }
}

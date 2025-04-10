package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.BrandLocators;
import uistore.JewelryLocator;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class ProductPage {

    public static void AddProductShoppingBag(ExtentTest test) {
        semasterClick(test);
        blueClick(test);
        firstProduct(test);
        addCart(test);

    }

    public static void semasterClick(ExtentTest test) {
        try {

            WebDriverHelper wb = new WebDriverHelper();
            wb.hoverOverElement(BrandLocators.semaster);
            wb.waitForElementToBeClickable(BrandLocators.semaster, 5);
             Assertion.assertionVerifyByEqual(wb.getText(BrandLocators.semaster), ExcelReader.readCellValue("sheet6","5"  ,"value"), test);
     
            wb.clickOnElement(BrandLocators.semaster);
            LoggerHandler.info(wb.getText(BrandLocators.semaster));
              test.log(Status.INFO, wb.getText(BrandLocators.semaster));
        } catch (Exception e) {
             LoggerHandler.info(e.getMessage());


        }

    }

    public static void blueClick(ExtentTest test) {
        try {

            WebDriverHelper wb = new WebDriverHelper();
            wb.hoverOverElement(BrandLocators.blue);
            wb.waitForElementToBeClickable(BrandLocators.blue, 5);
            Assertion.assertionVerifyByEqual(wb.getText(BrandLocators.blue), ExcelReader.readCellValue("sheet6","6"  ,"value"), test);
     
            wb.clickOnElement(BrandLocators.blue);
            LoggerHandler.info(wb.getText(BrandLocators.blue));
        } catch (Exception e) {
             LoggerHandler.info(e.getMessage());
        }
    }

    public static void firstProduct(ExtentTest test) {
        try {

            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(BrandLocators.first_product, 2);
            wb.clickOnElement(BrandLocators.first_product);
            LoggerHandler.info(wb.getText(BrandLocators.first_product));

        } catch (Exception e) {
             LoggerHandler.info(e.getMessage());
        }

    }

    public static void addCart(ExtentTest test) {
        try {

            WebDriverHelper wb = new WebDriverHelper();
            Assertion.assertionVerifyByEqual(wb.getText(BrandLocators.AddToShoppingbag), ExcelReader.readCellValue("sheet6","7"  ,"value"), test);
     
            wb.clickOnElement(BrandLocators.AddToShoppingbag);
            LoggerHandler.info(wb.getText(BrandLocators.AddToShoppingbag));
            test.log(Status.INFO, wb.getText(BrandLocators.AddToShoppingbag));
        } catch (Exception e) {
             LoggerHandler.info(e.getMessage());
        }

    }
}
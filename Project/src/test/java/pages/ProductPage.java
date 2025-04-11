package pages;

/**
 * @Created by Yash
 * @Description Class for handling product actions on the shopping bag page, such as adding products and performing specific clicks.
 */

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.BrandLocators;
import uistore.JewelryLocator;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.GenerateReport;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class ProductPage {

    /**
     * @Description Executes the full flow of adding a product to the shopping bag, including several clicks and verifications.
     * @param test An ExtentTest instance for reporting.
     */
    public static void AddProductShoppingBag(ExtentTest test) {
        semasterClick(test);
        blueClick(test);
        firstProduct(test);
        addCart(test);
    }

    /**
     * @Description Clicks on the "Semaster" element after hovering over it and waiting for it to become clickable.
     * @param test An ExtentTest instance for reporting.
     */
    public static void semasterClick(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.hoverOverElement(BrandLocators.semaster);
            wb.waitForElementToBeClickable(BrandLocators.semaster, 5);
            wb.clickOnElement(BrandLocators.semaster);
            LoggerHandler.info(wb.getText(BrandLocators.semaster));
            test.log(Status.INFO, wb.getText(BrandLocators.semaster));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Clicks on the "Blue" element after hovering over it and waiting for it to become clickable.
     * @param test An ExtentTest instance for reporting.
     */
    public static void blueClick(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.hoverOverElement(BrandLocators.blue);
            wb.waitForElementToBeClickable(BrandLocators.blue, 5);
            wb.clickOnElement(BrandLocators.blue);
            LoggerHandler.info(wb.getText(BrandLocators.blue));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Selects the first product by waiting for its visibility and clicking on it.
     * @param test An ExtentTest instance for reporting.
     */
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

    /**
     * @Description Adds the selected product to the shopping bag by clicking on the "Add to Shopping Bag" button 
     *              and verifying the action.
     * @param test An ExtentTest instance for reporting.
     */
    public static void addCart(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            Assertion.assertionVerifyByEqual(wb.getText(BrandLocators.AddToShoppingbag), ExcelReader.readCellValue("sheet6", "7", "value"), test);
            wb.clickOnElement(BrandLocators.AddToShoppingbag);
            LoggerHandler.info(wb.getText(BrandLocators.AddToShoppingbag));
            test.log(Status.INFO, wb.getText(BrandLocators.AddToShoppingbag));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }
}
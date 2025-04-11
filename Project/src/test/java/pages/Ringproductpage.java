package pages;

/**
 * @Created by Yash
 * @Description Class for performing actions related to the ring product page, such as selecting the first product.
 */

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.JewelryLocator;
import utils.Base;
import utils.GenerateReport;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class Ringproductpage {

    /**
     * @Description Selects the first product by hovering over it, clicking on it, and logging the interaction.
     * @param test An ExtentTest instance for reporting.
     */
    public static void firstProduct(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(JewelryLocator.firstProduct, 5);
            wb.hoverOverElement(JewelryLocator.firstProduct);
            wb.clickOnElement(JewelryLocator.firstProduct);
            LoggerHandler.info(wb.getText(JewelryLocator.firstProduct));
            test.log(Status.INFO, wb.getText(JewelryLocator.firstProduct));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }
}
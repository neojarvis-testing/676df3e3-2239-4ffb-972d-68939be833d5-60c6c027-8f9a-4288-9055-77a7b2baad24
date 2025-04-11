package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.JewelryLocator;
import utils.Base;
import utils.GenerateReport;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class Ringproductpage {
    public static void firstProduct(ExtentTest test) {
        try {

            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(JewelryLocator.firstProduct, 5);
            wb.hoverOverElement(JewelryLocator.firstProduct);
            wb.clickOnElement(JewelryLocator.firstProduct);
            LoggerHandler.info(wb.getText(JewelryLocator.firstProduct));
             test.log(Status.INFO, wb.getText(JewelryLocator.firstProduct));
             wb.javascriptHighlight(JewelryLocator.firstProduct);
             Screenshot.captureScreenshot("JewelryProduct");
             GenerateReport.attachScreenshotToReport("jewelry Product", test, "Product is found");
            
        } catch (Exception e) {
             LoggerHandler.info(e.getMessage());

        }
    }
}
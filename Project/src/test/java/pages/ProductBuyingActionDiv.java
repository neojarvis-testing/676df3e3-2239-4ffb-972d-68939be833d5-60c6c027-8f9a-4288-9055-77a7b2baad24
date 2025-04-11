package pages;

/**
 * @Created by Divyansh
 * @Description Class for actions related to product buying, including handling bracelets and rings.
 */

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ProductBuyingLocatorsDiv;
import utils.Base;
import utils.ExcelReader;
import utils.GenerateReport;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class ProductBuyingActionDiv {

    /**
     * @Description Handles the process of buying bracelets, including hovering, clicking, and verifying the order.
     * @param test An ExtentTest instance for reporting.
     * @throws InterruptedException Thrown if thread sleep is interrupted.
     */
    public static void braceletproductbuying(ExtentTest test) throws InterruptedException {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            
            // Hover over and click the bracelet buying element
            wb.hoverOverElement(ProductBuyingLocatorsDiv.braceletbuy);
            wb.clickOnElement(ProductBuyingLocatorsDiv.braceletbuy);
            LoggerHandler.info("Clicked " + wb.getText(ProductBuyingLocatorsDiv.braceletbuy));
            test.log(Status.INFO, "Clicked " + wb.getText(ProductBuyingLocatorsDiv.braceletbuy));

            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
            
            // Add bracelet to cart and verify order details
            wb.javascriptHighlight(ProductBuyingLocatorsDiv.addtocart);
            
            Screenshot.captureScreenshot("Ring_order");
            wb.clickOnElement(ProductBuyingLocatorsDiv.addtocart);
            LoggerHandler.info("Clicked " + wb.getText(ProductBuyingLocatorsDiv.addtocart));
            test.log(Status.INFO, "Clicked " + wb.getText(ProductBuyingLocatorsDiv.addtocart));

            String order = wb.getText(By.cssSelector(".productDeliveryMessage"));
            String avalue = ExcelReader.readCellValue("Sheet1", "6", "value");
            Assert.assertEquals(order, avalue);

            LoggerHandler.info("Order Found");
            
            // Highlight and capture screenshot of the order
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        } catch (Exception e) {
            e.printStackTrace();
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /**
     * @Description Handles the process of buying rings, including clicking, interacting with live help, and capturing screenshots.
     * @param test An ExtentTest instance for reporting.
     * @throws InterruptedException Thrown if thread sleep is interrupted.
     */
    public static void ringbuying(ExtentTest test) throws InterruptedException {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            
            // Click on the ring buying element
            wb.clickOnElement(ProductBuyingLocatorsDiv.ringbuy);
            LoggerHandler.info("Clicked " + wb.getText(ProductBuyingLocatorsDiv.ringbuy));
            test.log(Status.INFO, "Clicked " + wb.getText(ProductBuyingLocatorsDiv.ringbuy));

            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
            
            // Click on live help and capture its screenshot
            wb.javascriptHighlight(ProductBuyingLocatorsDiv.livehelp);
            wb.clickOnElement(ProductBuyingLocatorsDiv.livehelp);
            Screenshot.captureScreenshot("Get_live_help");
            GenerateReport.addScreenshotToReport("Get_live_help", test, "Get_live_help");
            LoggerHandler.info("Clicked " + wb.getText(ProductBuyingLocatorsDiv.livehelp));
            test.log(Status.INFO, "Clicked " + wb.getText(ProductBuyingLocatorsDiv.livehelp));

            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
package pages;

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
    public static void braceletproductbuying(ExtentTest test) throws InterruptedException {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.hoverOverElement(ProductBuyingLocatorsDiv.braceletbuy);
            wb.clickOnElement(ProductBuyingLocatorsDiv.braceletbuy);
            LoggerHandler.info("Clicked "+wb.getText(ProductBuyingLocatorsDiv.braceletbuy));
            test.log(Status.INFO,"Clicked "+wb.getText(ProductBuyingLocatorsDiv.braceletbuy));

            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
            wb.clickOnElement(ProductBuyingLocatorsDiv.addtocart);
            LoggerHandler.info("Clicked "+wb.getText(ProductBuyingLocatorsDiv.addtocart));
            test.log(Status.INFO,"Clicked "+wb.getText(ProductBuyingLocatorsDiv.addtocart));

            String  order=wb.getText(By.cssSelector(".productDeliveryMessage"));
            String avalue=ExcelReader.readCellValue("Sheet1","2","value");
            Assert.assertEquals(order,avalue);

            LoggerHandler.info("Order Found");
            Screenshot.captureScreenshot("Ring_order");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
           
        } catch (Exception e) {
            e.printStackTrace();
        }catch(AssertionError e)
        {
            e.printStackTrace();
        }
    }

    public static void ringbuying(ExtentTest test) throws InterruptedException {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.clickOnElement(ProductBuyingLocatorsDiv.ringbuy);
            LoggerHandler.info("Clicked "+wb.getText(ProductBuyingLocatorsDiv.ringbuy));
            test.log(Status.INFO,"Clicked "+wb.getText(ProductBuyingLocatorsDiv.ringbuy));

            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
            wb.clickOnElement(ProductBuyingLocatorsDiv.livehelp);
            wb.javascriptHighlight(ProductBuyingLocatorsDiv.livehelp);
            Screenshot.captureScreenshot("Get_live_help");
            GenerateReport.attachScreenshotToReport("Get_live_help", test, "Get_live_help");
            LoggerHandler.info("Clicked "+wb.getText(ProductBuyingLocatorsDiv.livehelp));
            test.log(Status.INFO,"Clicked "+wb.getText(ProductBuyingLocatorsDiv.livehelp));

            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

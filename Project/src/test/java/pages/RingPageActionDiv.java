package pages;

/**
 * @Created by Divyansh
 * @Description Class for performing actions related to selecting rings, including handling popups 
 *              and applying filters.
 */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.RingPageLocatorsDiv;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class RingPageActionDiv {

    /**
     * @Description Executes actions for selecting rings by dismissing popups and applying filters.
     * @param test An ExtentTest instance for reporting.
     */
    public static void selectingring(ExtentTest test) {
        dismisspopup(test);
        selectfilterofring(test);
    }

    /**
     * @Description Dismisses the popup by scrolling, refreshing the page, and interacting with the popup element.
     * @param test An ExtentTest instance for reporting.
     */
    public static void dismisspopup(ExtentTest test) {
        WebDriverHelper wb = new WebDriverHelper();
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        // Scrolls down slightly to handle popup visibility
        JavascriptExecutor js = (JavascriptExecutor) Base.driver;
        js.executeScript("window.scrollBy(0,700)", "");
        Base.driver.navigate().refresh();
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        
        wb.waitForElementToBeVisible(RingPageLocatorsDiv.dissmispopup, 30);
        wb.clickOnElement(RingPageLocatorsDiv.dissmispopup);
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    }

    /**
     * @Description Applies filters for selecting rings, such as 'For Her', category, brand, and Carlex options.
     * @param test An ExtentTest instance for reporting.
     */
    public static void selectfilterofring(ExtentTest test) {
        WebDriverHelper wb = new WebDriverHelper();

        // Clicks on the "For Her" filter
        wb.clickOnElement(RingPageLocatorsDiv.forher);
        LoggerHandler.info("Clicked " + wb.getText(RingPageLocatorsDiv.forher));
        test.log(Status.INFO, "Clicked " + wb.getText(RingPageLocatorsDiv.forher));

        // Clicks on the category filter
        wb.waitForElementToBeVisible(RingPageLocatorsDiv.category, 30);
        wb.clickOnElement(RingPageLocatorsDiv.category);
        LoggerHandler.info("Clicked " + wb.getText(RingPageLocatorsDiv.category));
        test.log(Status.INFO, "Clicked " + wb.getText(RingPageLocatorsDiv.category));

        // Clicks on the "Rings" option
        wb.waitForElementToBeVisible(RingPageLocatorsDiv.Rings, 30);
        wb.clickOnElement(RingPageLocatorsDiv.Rings);
        LoggerHandler.info("Clicked " + wb.getText(RingPageLocatorsDiv.Rings));
        test.log(Status.INFO, "Clicked " + wb.getText(RingPageLocatorsDiv.Rings));

        // Hovers over and clicks on the "Brand" filter
        wb.waitForElementToBeVisible(RingPageLocatorsDiv.Brand, 30);
        wb.hoverOverElement(RingPageLocatorsDiv.Brand);
        wb.clickOnElement(RingPageLocatorsDiv.Brand);
        LoggerHandler.info("Clicked " + wb.getText(RingPageLocatorsDiv.Brand));
        test.log(Status.INFO, "Clicked " + wb.getText(RingPageLocatorsDiv.Brand));

        // Clicks on the "Carlex" brand option
        wb.waitForElementToBeVisible(RingPageLocatorsDiv.Carlex, 30);
        wb.clickOnElement(RingPageLocatorsDiv.Carlex);
        LoggerHandler.info("Clicked " + wb.getText(RingPageLocatorsDiv.Carlex));
        test.log(Status.INFO, "Clicked " + wb.getText(RingPageLocatorsDiv.Carlex));
    }
}
package pages;

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

    public static void selectingring(ExtentTest test) {
        dismisspopup(test);
        selectfilterofring(test);

    }
       public static void dismisspopup(ExtentTest test)
       {
        WebDriverHelper wb = new WebDriverHelper();
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        JavascriptExecutor js = (JavascriptExecutor) Base.driver;
        js.executeScript("window.scrollBy(0,700)", "");
        Base.driver.navigate().refresh();
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        wb.waitForElementToBeVisible(RingPageLocatorsDiv.dissmispopup, 30);
        wb.clickOnElement(RingPageLocatorsDiv.dissmispopup);
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

       }
       public static void selectfilterofring(ExtentTest test)
       {
        WebDriverHelper wb = new WebDriverHelper();
        wb.clickOnElement(RingPageLocatorsDiv.forher);
        LoggerHandler.info("Clicked "+wb.getText(RingPageLocatorsDiv.forher));
        test.log(Status.INFO,"Clicked "+wb.getText(RingPageLocatorsDiv.forher));
        wb.waitForElementToBeVisible(RingPageLocatorsDiv.category, 30);
        wb.clickOnElement(RingPageLocatorsDiv.category);
        LoggerHandler.info("Clicked "+wb.getText(RingPageLocatorsDiv.category));
        test.log(Status.INFO,"Clicked "+wb.getText(RingPageLocatorsDiv.category));
        wb.waitForElementToBeVisible(RingPageLocatorsDiv.Rings, 30);
        wb.clickOnElement(RingPageLocatorsDiv.Rings);
        LoggerHandler.info("Clicked "+wb.getText(RingPageLocatorsDiv.Rings));
        test.log(Status.INFO,"Clicked "+wb.getText(RingPageLocatorsDiv.Rings));
        wb.waitForElementToBeVisible(RingPageLocatorsDiv.Brand, 30);
        wb.hoverOverElement(RingPageLocatorsDiv.Brand);
        wb.clickOnElement(RingPageLocatorsDiv.Brand);
        LoggerHandler.info("Clicked "+wb.getText(RingPageLocatorsDiv.Brand));
        test.log(Status.INFO,"Clicked "+wb.getText(RingPageLocatorsDiv.Brand));
        wb.waitForElementToBeVisible(RingPageLocatorsDiv.Carlex, 30);
        wb.clickOnElement(RingPageLocatorsDiv.Carlex);
        LoggerHandler.info("Clicked "+wb.getText(RingPageLocatorsDiv.Carlex));
        test.log(Status.INFO,"Clicked "+wb.getText(RingPageLocatorsDiv.Carlex));
       }
    
    }

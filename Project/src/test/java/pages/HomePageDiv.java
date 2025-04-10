package pages;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocatorsDiv;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HomePageDiv {
    public static void homepageaction(ExtentTest test) {

        aceeptcookieshomepage(test);
        clickweddinghomepage(test);
        clickbracelets(test);
    }
        public static void aceeptcookieshomepage(ExtentTest test){
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(HomePageLocatorsDiv.Acceptcookies, 10);
            wb.clickOnElement(HomePageLocatorsDiv.Acceptcookies);
            LoggerHandler.info("Clicekd "+wb.getText(HomePageLocatorsDiv.Acceptcookies));
            LoggerHandler.info(wb.getText(HomePageLocatorsDiv.Acceptcookies));
            test.log(Status.PASS,"Clicked "+wb.getText(HomePageLocatorsDiv.Acceptcookies));

        }
        public static void clickweddinghomepage(ExtentTest test)
        {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(HomePageLocatorsDiv.Wedding, 10);
            wb.hoverOverElement(HomePageLocatorsDiv.Wedding);
            LoggerHandler.info("Hover and clicked "+wb.getText(HomePageLocatorsDiv.Wedding));
            test.log(Status.PASS,"Clicked "+wb.getText(HomePageLocatorsDiv.Wedding));

        }
        public static void clickbracelets(ExtentTest test)
        {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(HomePageLocatorsDiv.Bracelet, 10);
            wb.clickOnElement(HomePageLocatorsDiv.Bracelet);
            LoggerHandler.info(wb.getText(HomePageLocatorsDiv.Bracelet));
            test.log(Status.PASS,"Clicked "+wb.getText(HomePageLocatorsDiv.Bracelet));
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
            JavascriptExecutor js = (JavascriptExecutor) Base.driver;
            js.executeScript("window.scrollBy(0,700)", "");
            Base.driver.navigate().refresh();
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        }
           

    public static void homepageactionring(ExtentTest test) {
        acceptcookiesring(test);
        enterrings(test); 
       } 
        // TestCase 6
          public static void acceptcookiesring(ExtentTest test)
          {
            WebDriverHelper wb = new WebDriverHelper();
            
            wb.waitForElementToBeVisible(HomePageLocatorsDiv.Acceptcookies, 10);
            wb.clickOnElement(HomePageLocatorsDiv.Acceptcookies);
            LoggerHandler.info("Hover and clicked "+wb.getText(HomePageLocatorsDiv.Acceptcookies));
            test.log(Status.PASS,"Clicked "+wb.getText(HomePageLocatorsDiv.Acceptcookies));
          }
           

          public static void enterrings(ExtentTest test)
          {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(HomePageLocatorsDiv.searchbar, 10);
            wb.clickOnElement(HomePageLocatorsDiv.searchbar);
            LoggerHandler.info("Hover and clicked "+wb.getText(HomePageLocatorsDiv.searchbar));
            test.log(Status.PASS,"Clicked "+wb.getText(HomePageLocatorsDiv.searchbar));
            String value=ExcelReader.readCellValue("Sheet1","1","value");
            wb.sendKeys(HomePageLocatorsDiv.searchbar, value);
            LoggerHandler.info("Send "+wb.getText(HomePageLocatorsDiv.searchbar));
            test.log(Status.PASS,"Clicked "+wb.getText(HomePageLocatorsDiv.searchbar));
            wb.waitForElementToBeVisible(HomePageLocatorsDiv.searchbar, 10);
            wb.enterAction(HomePageLocatorsDiv.searchbar);
            LoggerHandler.info("Enter "+wb.getText(HomePageLocatorsDiv.searchbar));
            test.log(Status.PASS,"Clicked "+wb.getText(HomePageLocatorsDiv.searchbar));
          }
        
            
} 
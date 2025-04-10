package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators_Kasak;
import utils.Base;
import utils.GenerateReport;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePage_Kasak {
    
    public static  void AboutMayors(ExtentTest test){
        WebDriverHelper wb = new WebDriverHelper();

        Base.driver.manage().window().maximize();
        wb.waitForElementToBeClickable(HomePageLocators_Kasak.cookies, 10);
        wb.clickOnElement(HomePageLocators_Kasak.cookies);
        LoggerHandler.info("clicked on acceptCookies");
        test.log(Status.INFO, "clicked on acceptCookies");
        
        wb.javascriptScroll(HomePageLocators_Kasak.aboutMayors);
        LoggerHandler.info("scroll down to footer");
        test.log(Status.INFO, "scroll down to footer");
        wb.waitForElementToBeClickable(HomePageLocators_Kasak.aboutMayors, 20);
        wb.clickOnElement(HomePageLocators_Kasak.aboutMayors);
        LoggerHandler.info("clicked on About Mayors");
        test.log(Status.INFO, "clicked on About Mayors");

       
        Base.driver.navigate().back();
        LoggerHandler.info("navigate back to home page");
        test.log(Status.PASS,"navigate back to home page");

    }

        public static void pressRoomFunc(ExtentTest test){
            WebDriverHelper wb = new WebDriverHelper();

        wb.javascriptScroll(HomePageLocators_Kasak.pressRoom);
        LoggerHandler.info("scroll to pressRoom");
        test.log(Status.INFO, "scroll to pressRoom");

        wb.waitForElementToBeClickable(HomePageLocators_Kasak.pressRoom, 20);

        wb.clickOnElement(HomePageLocators_Kasak.pressRoom);
        LoggerHandler.info("clicked on pressRoom");
        test.log(Status.INFO, "clicked on pressRoom");
       
        Base.driver.navigate().back();

        }
        
        public static void careersFunc(ExtentTest test){
            WebDriverHelper wb = new WebDriverHelper();

        wb.javascriptScroll(HomePageLocators_Kasak.careers);

        wb.clickOnElement(HomePageLocators_Kasak.careers);
        LoggerHandler.info("clicked on Careers");
        test.log(Status.INFO, "clicked on Careers");
        Base.driver.navigate().back();

        }
        
        public static void sustainFunc(ExtentTest test){
            WebDriverHelper wb = new WebDriverHelper();

            wb.javascriptScroll(HomePageLocators_Kasak.sustainability);
            LoggerHandler.info("scroll down to sustainibility");
        test.log(Status.INFO, "scroll down to sustainability");

            wb.clickOnElement(HomePageLocators_Kasak.sustainability);
            LoggerHandler.info("clicked on sustainibility");
        test.log(Status.INFO, "clicked on sustainibility");
            Base.driver.navigate().back();

        }

        public static void newsletterFunc(ExtentTest test){
            WebDriverHelper wb = new WebDriverHelper();

        wb.javascriptScroll(HomePageLocators_Kasak.newsletter);

        wb.clickOnElement(HomePageLocators_Kasak.newsletter);
        LoggerHandler.info("clicked on newsletter link");
        test.log(Status.INFO, "clicked on newsletter link");
        Base.driver.navigate().back();

        }

        
        public static void categoriesFunc(ExtentTest test){
            WebDriverHelper wb = new WebDriverHelper();

            wb.javascriptScroll(HomePageLocators_Kasak.wedding);

        wb.clickOnElement(HomePageLocators_Kasak.wedding);
        LoggerHandler.info("clicked on wedding link under categories");
        test.log(Status.INFO, "clicked on wedding link under categories");
        Base.driver.navigate().back();

        wb.javascriptScroll(HomePageLocators_Kasak.rolex);
        wb.clickOnElement(HomePageLocators_Kasak.rolex);
        LoggerHandler.info("clicked on rolex");
        test.log(Status.INFO, "clicked on rolex");
        Base.driver.navigate().back();

        wb.javascriptScroll(HomePageLocators_Kasak.brands);

        wb.clickOnElement(HomePageLocators_Kasak.brands);
        LoggerHandler.info("clicked on Brands");
        test.log(Status.INFO, "clicked on Brands");
        Base.driver.navigate().back();

        LoggerHandler.info("verified the keyword About Mayors");
        test.log(Status.INFO, "verified the keyword About Mayors");


        Screenshot.captureScreenshot("mayors");
       GenerateReport.attachScreenshotToReport("mayors", test, "mayors");
       LoggerHandler.info("captured the screenshot in the report");
        test.log(Status.INFO, "captured the screenshot in the report");


        }

        
        
        
        
    }
    
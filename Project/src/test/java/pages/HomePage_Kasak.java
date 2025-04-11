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

    /**
     * @Created by Kasak
     * @Description Performs the 'About Mayors' action, including scrolling to footer, clicking on the link, 
     *              logging information, and navigating back to the home page.
     * @param test An ExtentTest instance for reporting.
     * @return None
     */
    public static void AboutMayors(ExtentTest test) {
        WebDriverHelper wb = new WebDriverHelper();

        Base.driver.manage().window().maximize();
        wb.waitForElementToBeClickable(HomePageLocators_Kasak.cookies, 10);
        wb.clickOnElement(HomePageLocators_Kasak.cookies);
        LoggerHandler.info(wb.getText(HomePageLocators_Kasak.cookies));
        test.log(Status.INFO, wb.getText(HomePageLocators_Kasak.cookies));

        wb.javascriptScroll(HomePageLocators_Kasak.aboutMayors);
        LoggerHandler.info("scroll down to footer");
        wb.waitForElementToBeClickable(HomePageLocators_Kasak.aboutMayors, 20);
        wb.clickOnElement(HomePageLocators_Kasak.aboutMayors);
        LoggerHandler.info(wb.getText(HomePageLocators_Kasak.aboutMayors));
        test.log(Status.INFO, wb.getText(HomePageLocators_Kasak.aboutMayors));

        Base.driver.navigate().back();
        LoggerHandler.info("navigate back to home page");
        test.log(Status.PASS, "navigate back to home page");
    }

    /**
     * @Created by Kasak
     * @Description Performs the 'Press Room' action, including scrolling, clicking on the link, 
     *              logging information, and navigating back to the home page.
     * @param test An ExtentTest instance for reporting.
     * @return None
     */
    public static void pressRoomFunc(ExtentTest test) {
        WebDriverHelper wb = new WebDriverHelper();

        wb.javascriptScroll(HomePageLocators_Kasak.pressRoom);
        wb.waitForElementToBeClickable(HomePageLocators_Kasak.pressRoom, 20);
        wb.clickOnElement(HomePageLocators_Kasak.pressRoom);
        LoggerHandler.info(wb.getText(HomePageLocators_Kasak.pressRoom));
        test.log(Status.INFO, "clicked on pressRoom " + wb.getText(HomePageLocators_Kasak.pressRoom));

        Base.driver.navigate().back();
    }

    /**
     * @Created by Kasak
     * @Description Performs the 'Careers' action, including scrolling, clicking on the link, 
     *              logging information, and navigating back to the home page.
     * @param test An ExtentTest instance for reporting.
     * @return None
     */
    public static void careersFunc(ExtentTest test) {
        WebDriverHelper wb = new WebDriverHelper();

        wb.javascriptScroll(HomePageLocators_Kasak.careers);
        wb.clickOnElement(HomePageLocators_Kasak.careers);
        LoggerHandler.info(wb.getText(HomePageLocators_Kasak.careers));
        test.log(Status.INFO, "clicked on Careers " + wb.getText(HomePageLocators_Kasak.careers));
        Base.driver.navigate().back();
    }

    /**
     * @Created by Kasak
     * @Description Performs the 'Sustainability' action, including scrolling, clicking on the link, 
     *              logging information, and navigating back to the home page.
     * @param test An ExtentTest instance for reporting.
     * @return None
     */
    public static void sustainFunc(ExtentTest test) {
        WebDriverHelper wb = new WebDriverHelper();

        wb.javascriptScroll(HomePageLocators_Kasak.sustainability);
        wb.clickOnElement(HomePageLocators_Kasak.sustainability);
        LoggerHandler.info(wb.getText(HomePageLocators_Kasak.sustainability));
        test.log(Status.INFO, "clicked on sustainability" + wb.getText(HomePageLocators_Kasak.sustainability));
        Base.driver.navigate().back();
    }

    /**
     * @Created by Kasak
     * @Description Performs the 'Newsletter' action, including scrolling, clicking on the link, 
     *              logging information, and navigating back to the home page.
     * @param test An ExtentTest instance for reporting.
     * @return None
     */
    public static void newsletterFunc(ExtentTest test) {
        WebDriverHelper wb = new WebDriverHelper();

        wb.javascriptScroll(HomePageLocators_Kasak.newsletter);
        wb.clickOnElement(HomePageLocators_Kasak.newsletter);
        LoggerHandler.info(wb.getText(HomePageLocators_Kasak.newsletter));
        test.log(Status.INFO, "clicked on newsletter link" + wb.getText(HomePageLocators_Kasak.newsletter));
        Base.driver.navigate().back();
    }

    /**
     * @Created by Kasak
     * @Description Performs the 'Wedding' action, including scrolling, clicking on the link, 
     *              logging information, and navigating back to the home page.
     * @param test An ExtentTest instance for reporting.
     * @return None
     */
    public static void weddingFunc(ExtentTest test) {
        WebDriverHelper wb = new WebDriverHelper();

        wb.javascriptScroll(HomePageLocators_Kasak.wedding);
        wb.clickOnElement(HomePageLocators_Kasak.wedding);
        LoggerHandler.info(wb.getText(HomePageLocators_Kasak.wedding));
        test.log(Status.INFO, "clicked on wedding link " + wb.getText(HomePageLocators_Kasak.wedding));
        Base.driver.navigate().back();
    }

    /**
     * @Created by Kasak
     * @Description Performs the 'Rolex' action, including scrolling, clicking on the link, 
     *              logging information, and navigating back to the home page.
     * @param test An ExtentTest instance for reporting.
     * @return None
     */
    public static void rolexFunc(ExtentTest test) {
        WebDriverHelper wb = new WebDriverHelper();

        wb.javascriptScroll(HomePageLocators_Kasak.rolex);
        wb.clickOnElement(HomePageLocators_Kasak.rolex);
        LoggerHandler.info(wb.getText(HomePageLocators_Kasak.rolex));
        test.log(Status.INFO, "clicked on rolex" + wb.getText(HomePageLocators_Kasak.rolex));
        Base.driver.navigate().back();
    }

    /**
     * @Created by Kasak
     * @Description Performs the 'Brands' action, including scrolling, clicking on the link, 
     *              logging information, capturing a screenshot, and navigating back to the home page.
     * @param test An ExtentTest instance for reporting.
     * @return None
     */
    public static void BrandsFunc(ExtentTest test) {
        WebDriverHelper wb = new WebDriverHelper();

        wb.javascriptScroll(HomePageLocators_Kasak.brands);
        wb.clickOnElement(HomePageLocators_Kasak.brands);
        LoggerHandler.info(wb.getText(HomePageLocators_Kasak.brands));
        test.log(Status.INFO, "clicked on Brands" + wb.getText(HomePageLocators_Kasak.brands));
        Base.driver.navigate().back();

        wb.javascriptHighlight(HomePageLocators_Kasak.keyword);
        Screenshot.captureScreenshot("mayors");
        GenerateReport.addScreenshotToReport("mayors", test, "mayors");
    }

    /**
     * @Created by Kasak
     * @Description Executes all major homepage actions sequentially and logs the steps for reporting.
     * @param test An ExtentTest instance for reporting.
     * @return None
     */
    public static void Categories(ExtentTest test) {
        AboutMayors(test);
        careersFunc(test);
        sustainFunc(test);
        pressRoomFunc(test);
        newsletterFunc(test);
        weddingFunc(test);
        rolexFunc(test);
        BrandsFunc(test);
    }
}
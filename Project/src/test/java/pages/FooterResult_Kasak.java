package pages;

/**
 * @Created by Kasak
 * @Description Class for verifying footer links and their corresponding pages.
 */

import com.aventstack.extentreports.ExtentTest;
import uistore.HomePageLocators_Kasak;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class FooterResult_Kasak {

    /**
     * @Description Verifies the 'About Mayors' page URL against the expected value.
     * @param test An ExtentTest instance for reporting.
     */
    public static void aboutMayorsVerify(ExtentTest test) {
        try {
            Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(),
                    ExcelReader.readCellValue("sheet4", "1", "value"), test);
        } catch(Exception e){
            e.printStackTrace();

        }
         catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Verifies the 'Press Media' page URL against the expected value.
     * @param test An ExtentTest instance for reporting.
     */
    public static void pressMediaVerify(ExtentTest test) {
        try {
            Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(),
                    ExcelReader.readCellValue("sheet4", "2", "value"), test);
        } catch(Exception e){
            e.printStackTrace();

        }
         catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Verifies the 'Careers' page URL and title against the expected values.
     * @param test An ExtentTest instance for reporting.
     */
    public static void careersVerify(ExtentTest test) {
        try {
            Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(),
                    ExcelReader.readCellValue("sheet4", "3", "value"), test);

            Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "4", "value"),
                    test);
        }
        catch(Exception e){
            e.printStackTrace();

        }
         catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Verifies the 'Sustainability' page URL and title against the expected values.
     * @param test An ExtentTest instance for reporting.
     */
    public static void sustainVerify(ExtentTest test) {
        try {
            Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(),
                    ExcelReader.readCellValue("sheet4", "5", "value"), test);

            Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "6", "value"),
                    test);
        } 
        catch(Exception e){
            e.printStackTrace();

        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Verifies the 'Newsletter' page URL and title against the expected values.
     * @param test An ExtentTest instance for reporting.
     */
    public static void newsletterVerify(ExtentTest test) {
        try {
            Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(),
                    ExcelReader.readCellValue("sheet4", "7", "value"), test);

            Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "8", "value"),
                    test);
        } catch(Exception e){
            e.printStackTrace();

        }
        
        catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Verifies the 'Wedding' page URL and title against the expected values.
     * @param test An ExtentTest instance for reporting.
     */
    public static void weddingVerify(ExtentTest test) {
        try {
            Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(),
                    ExcelReader.readCellValue("sheet4", "9", "value"), test);

            Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "10", "value"),
                    test);
        }
        catch(Exception e){
            e.printStackTrace();

        }
         catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Verifies the 'Rolex' page URL and title against the expected values.
     * @param test An ExtentTest instance for reporting.
     */
    public static void rolexVerify(ExtentTest test) {
        try {
            Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(),
                    ExcelReader.readCellValue("sheet4", "11", "value"), test);

            Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "12", "value"),
                    test);
        } 
        catch(Exception e){
            e.printStackTrace();

        }
        catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Verifies the 'Brand' page URL, title, and keyword text against the expected values.
     * @param test An ExtentTest instance for reporting.
     */
    public static void brandVerify(ExtentTest test) {
        try {
            WebDriverHelper wb = new WebDriverHelper();

            Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(),
                    ExcelReader.readCellValue("sheet4", "13", "value"), test);

            Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "14", "value"),
                    test);
                    // wb.javascriptHighlight(HomePageLocators_Kasak.keyword);

            Assertion.assertionVerifyByEqual(wb.getText(HomePageLocators_Kasak.keyword),
                    ExcelReader.readCellValue("sheet4", "15", "value"), test);
            
        } 
        catch(Exception e){
            e.printStackTrace();

        }
        catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Executes all footer verification methods sequentially.
     * @param test An ExtentTest instance for reporting.
     */
    public static void verifyAllTerms(ExtentTest test) {
        aboutMayorsVerify(test);
        pressMediaVerify(test);
        careersVerify(test);
        sustainVerify(test);
        newsletterVerify(test);
        weddingVerify(test);
        rolexVerify(test);
        brandVerify(test);
    }
}
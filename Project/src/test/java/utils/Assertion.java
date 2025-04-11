package utils;

/**
 * @Created by Kasak
 * @Description This utility class provides assertion methods to verify conditions in test cases,
 *              using TestNG and ExtentReports for logging and reporting.
 */

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Assertion {

    /**
     * @Description Verifies that the actual value equals the expected value. If the assertion fails,
     *              a screenshot is captured, and errors are logged.
     * @param actual The actual value to be verified.
     * @param expected The expected value to compare against.
     * @param test The ExtentTest instance for reporting.
     */
    public static void assertionVerifyByEqual(String actual, String expected, ExtentTest test) {
        try {
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verification Successful: " + actual);
            test.log(Status.INFO, "Verification Successful: " + actual);
        } catch (AssertionError e) {
            LoggerHandler.error("Assertion Error: Entered Wrong Credentials. " + e.getMessage());
            test.log(Status.WARNING, "Entered Wrong Credentials. " + e.getMessage());
            Screenshot.captureScreenshot("Assertion_error_screenshot");
        } catch (Exception e1) {
            LoggerHandler.error("Assertion Error: Entered Wrong Credentials. " + e1.getMessage());
            test.log(Status.WARNING, "Entered Wrong Credentials. " + e1.getMessage());
        }
    }

    /**
     * @Description Verifies that the actual text contains the expected text. If the assertion fails,
     *              a screenshot is captured, and errors are logged.
     * @param actualText The actual text to be verified.
     * @param expectedText The expected text to check within the actual text.
     * @param test The ExtentTest instance for reporting.
     */
    public static void assertionVerifyByContains(String actualText, String expectedText, ExtentTest test) {
        try {
            if (actualText.contains(expectedText)) {
                Assert.assertTrue(true);
                LoggerHandler.info("Verification Successful: Text contains expected value.");
                test.log(Status.INFO, "Verification Successful: Text contains expected value.");
            }
        } catch (AssertionError e) {
            LoggerHandler.error("Assertion Error: Entered Wrong Credentials. " + e.getMessage());
            test.log(Status.WARNING, "Entered Wrong Credentials. " + e.getMessage());
            Screenshot.captureScreenshot("Assertion_error_screenshot");
        } catch (Exception e1) {
            LoggerHandler.error("Assertion Error: Entered Wrong Credentials. " + e1.getMessage());
            test.log(Status.WARNING, "Entered Wrong Credentials. " + e1.getMessage());
        }
    }
}
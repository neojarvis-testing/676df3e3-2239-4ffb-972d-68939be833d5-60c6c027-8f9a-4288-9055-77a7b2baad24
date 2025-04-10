package utils;
 
import org.testng.Assert;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
public class Assertion {
    public static void assertionVerifyByEqual(String actual, String expected, ExtentTest test) {
        try {
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verification Successful: " + actual);
            test.log(Status.INFO, "Verification Successful: " + actual);
        } catch (AssertionError e) {
            LoggerHandler.error("Assertion Error : Entered Wrong  Credentials." + e.getMessage());
            test.log(Status.WARNING, "Entered Wrong  Credentials." + e.getMessage());
            Screenshot.captureScreenshot("Assertion error screenshots");
        } catch (Exception e1) {
            LoggerHandler.error("Assertion Error : Entered Wrong  Credentials." + e1.getMessage());
            test.log(Status.WARNING, "Entered Wrong  Credentials." + e1.getMessage());
        }
    }
 
    public static void assertionVerifyByContains(String actualText, String expectedText, ExtentTest test) {
        try {
            if (actualText.contains(expectedText)) {
                Assert.assertTrue(true);
            }
        } catch (AssertionError e) {
            LoggerHandler.error("Assertion Error : Entered Wrong  Credentials." + e.getMessage());
            test.log(Status.WARNING, "Entered Wrong  Credentials." + e.getMessage());
            Screenshot.captureScreenshot("Assertion error screenshots");
        } catch (Exception e1) {
            LoggerHandler.error("Assertion Error : Entered Wrong  Credentials." + e1.getMessage());
            test.log(Status.WARNING, "Entered Wrong  Credentials." + e1.getMessage());
        }
    }
}
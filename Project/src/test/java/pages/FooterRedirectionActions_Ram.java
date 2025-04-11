package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import utils.Base;
import utils.ExcelReader;
import utils.WebDriverHelper;

public class FooterRedirectionActions_Ram {

    WebDriverHelper wb = new WebDriverHelper();
    ExtentTest test;

    /** 
     * @Created by Ram Prasath
     * @Description Verifies the 'Your Security' page by checking URL and title against expected values.
     * @return None
     */
    public void yoursecurity() {
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = ExcelReader.readCellValue("Sheet1", "7", "value");
            Assert.assertEquals(current_url, expected_url);

            String current_title = Base.driver.getTitle();
            String expected_title = ExcelReader.readCellValue("Sheet1", "8", "value");
            Assert.assertEquals(current_title, expected_title);

        } catch (Exception e) {
            e.printStackTrace();
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Verifies the 'Terms and Conditions' page by checking URL and title against expected values.
     * @return None
     */
    public void termsAndConditions() {
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = ExcelReader.readCellValue("Sheet1", "9", "value");
            Assert.assertEquals(current_url, expected_url);

            String current_title = Base.driver.getTitle();
            String expected_title = ExcelReader.readCellValue("Sheet1", "10", "value");
            Assert.assertEquals(current_title, expected_title);

        } catch (Exception e) {
            e.printStackTrace();
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Verifies the 'Privacy Policy' page by checking URL and title against expected values.
     * @return None
     */
    public void privacyPolicy() {
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = ExcelReader.readCellValue("Sheet1", "11", "value");
            Assert.assertEquals(current_url, expected_url);

            String current_title = Base.driver.getTitle();
            String expected_title = ExcelReader.readCellValue("Sheet1", "12", "value");
            Assert.assertEquals(current_title, expected_title);

        } catch (Exception e) {
            e.printStackTrace();
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Verifies the 'Cookie Policy' page by checking URL and title against expected values.
     * @return None
     */
    public void cookiePolicy() {
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = ExcelReader.readCellValue("Sheet1", "13", "value");
            Assert.assertEquals(current_url, expected_url);

            String current_title = Base.driver.getTitle();
            String expected_title = ExcelReader.readCellValue("Sheet1", "14", "value");
            Assert.assertEquals(current_title, expected_title);

        } catch (Exception e) {
            e.printStackTrace();
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Verifies the 'Accessibility' page by checking URL and title against expected values.
     * @return None
     */
    public void accessibility() {
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = ExcelReader.readCellValue("Sheet1", "15", "value");
            Assert.assertEquals(current_url, expected_url);

            String current_title = Base.driver.getTitle();
            String expected_title = ExcelReader.readCellValue("Sheet1", "16", "value");
            Assert.assertEquals(current_title, expected_title);

        } catch (Exception e) {
            e.printStackTrace();
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Verifies the 'Pay By Link' page by checking URL and title against expected values.
     * @return None
     */
    public void payByLink() {
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = ExcelReader.readCellValue("Sheet1", "17", "value");
            Assert.assertEquals(current_url, expected_url);

            String current_title = Base.driver.getTitle();
            String expected_title = ExcelReader.readCellValue("Sheet1", "18", "value");
            Assert.assertEquals(current_title, expected_title);

        } catch (Exception e) {
            e.printStackTrace();
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Verifies the 'Watches' category page by checking URL and title against expected values.
     * @return None
     */
    public void watches() {
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = ExcelReader.readCellValue("Sheet1", "19", "value");
            Assert.assertEquals(current_url, expected_url);

            String current_title = Base.driver.getTitle();
            String expected_title = ExcelReader.readCellValue("Sheet1", "20", "value");
            Assert.assertEquals(current_title, expected_title);

        } catch (Exception e) {
            e.printStackTrace();
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Verifies the 'Jewelry' category page by checking URL and title against expected values.
     * @return None
     */
    public void jwelery() {
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = ExcelReader.readCellValue("Sheet1", "21", "value");
            Assert.assertEquals(current_url, expected_url);

            String current_title = Base.driver.getTitle();
            String expected_title = ExcelReader.readCellValue("Sheet1", "22", "value");
            Assert.assertEquals(current_title, expected_title);

        } catch (Exception e) {
            e.printStackTrace();
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }
}
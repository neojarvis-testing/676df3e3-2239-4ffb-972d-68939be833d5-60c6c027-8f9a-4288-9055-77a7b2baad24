package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import utils.Base;
import utils.WebDriverHelper;

public class FooterRedirectionActions_Ram {

    WebDriverHelper wb = new WebDriverHelper();
    // Assertion as = new Assertion();
    ExtentTest test;
    
    public void yoursecurity(){
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = "https://www.mayors.com/your-security";
            //Assertion.assertionVerifyByEqual(current_url, expected_url, test);
            System.out.println("works");
            Assert.assertEquals(current_url, expected_url);
            
            String current_title = Base.driver.getTitle();
            String expected_title ="Your Security | Mayors";
            Assert.assertEquals(current_title, expected_title);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void termsAndConditions(){
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = "https://www.mayors.com/terms-and-conditions";
            Assert.assertEquals(current_url, expected_url);
            
            String current_title = Base.driver.getTitle();
            String expected_title = "Terms & Conditions | Mayors";
            Assert.assertEquals(current_title, expected_title);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void privacyPolicy(){
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = "https://www.mayors.com/privacy-policy";
            Assert.assertEquals(current_url, expected_url);
            
            String current_title = Base.driver.getTitle();
            String expected_title = "Privacy Policy | Mayors";
            Assert.assertEquals(current_title, expected_title);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cookiePolicy(){
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = "https://www.mayors.com/privacy-policy#cookies";
            Assert.assertEquals(current_url, expected_url);
            
            String current_title = Base.driver.getTitle();
            String expected_title = "Privacy Policy | Mayors";   
            Assert.assertEquals(current_title, expected_title);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void accessibility(){
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = "https://www.mayors.com/accessibility";
            Assert.assertEquals(current_url, expected_url);
            
            String current_title = Base.driver.getTitle();
            String expected_title = "Accessibility | Mayors";
            Assert.assertEquals(current_title, expected_title);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void payByLink(){
        try {

            String current_url = Base.driver.getCurrentUrl();
            String expected_url = "https://www.mayors.com/paybylink-terms";
            Assert.assertEquals(current_url, expected_url);
            
            String current_title = Base.driver.getTitle();
            String expected_title = "PayByLink Terms | Mayors";
            Assert.assertEquals(current_title, expected_title);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void watches(){
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = "https://www.mayors.com/c/Watches";
            Assert.assertEquals(current_url, expected_url);
            
            String current_title = Base.driver.getTitle();
            String expected_title = "Watches | Mayors";
            Assert.assertEquals(current_title, expected_title);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void jwelery(){
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = "https://www.mayors.com/c/Jewelry";
            Assert.assertEquals(current_url, expected_url);
            
            String current_title = Base.driver.getTitle();
            String expected_title = "Jewelry | Mayors";
            Assert.assertEquals(current_title, expected_title);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}

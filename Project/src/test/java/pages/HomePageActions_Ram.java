package pages;

import org.testng.Assert;
import uistore.HomePage_Locator_Ram;
import utils.Base;
import utils.WebDriverHelper;

public class HomePageActions_Ram {

    WebDriverHelper wb = new WebDriverHelper();
    FooterRedirectionActions_Ram redirect = new FooterRedirectionActions_Ram();

    /** 
     * @Created by Ram Prasath
     * @Description Scrolls to the footer section of the page.
     * @return None
     */
    public void scrolltofooter() {
        try {
            wb.javascriptScroll(HomePage_Locator_Ram.footer);
            System.out.println("scrolled");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Clicks on the 'Your Security' link in the footer.
     * @return None
     */
    public void clickYourSecurity() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.yoursecurity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Clicks on the 'Terms and Conditions' link in the footer.
     * @return None
     */
    public void clickTermsAndConditions() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.terms);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Clicks on the 'Privacy Policy' link in the footer.
     * @return None
     */
    public void clickprivacyPolicy() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.PrivacyPolicy);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Clicks on the 'Cookie Policy' link in the footer.
     * @return None
     */
    public void clickCookiePolicy() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.CookiePolicy);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Clicks on the 'Accessibility' link in the footer.
     * @return None
     */
    public void accessibility() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.Accessibility);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Clicks on the 'Pay By Link' option in the footer.
     * @return None
     */
    public void clickPayByLink() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.PayByLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Clicks on the 'Watches' category link in the footer.
     * @return None
     */
    public void clickWatches() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.watches);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Clicks on the 'Jewelry' category link in the footer.
     * @return None
     */
    public void clickJwelery() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.jwelery);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Navigates back to the previous page.
     * @return None
     */
    public void navigateBack() {
        try {
            Base.driver.navigate().back();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Verifies the 'Pay By Link' functionality.
     * @return None
     */
    public void payByLinkVerification() {
        try {
            scrolltofooter();
            clickPayByLink();
            redirect.payByLink();
            navigateBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Verifies the 'Your Security' page.
     * @return None
     */
    public void yourSecurityVerification() {
        try {
            scrolltofooter();
            clickYourSecurity();
            redirect.yoursecurity();
            navigateBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Verifies the 'Terms and Conditions' page.
     * @return None
     */
    public void termsVerification() {
        try {
            scrolltofooter();
            clickTermsAndConditions();
            redirect.termsAndConditions();
            navigateBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Verifies the 'Privacy Policy' page.
     * @return None
     */
    public void privacyPolicyVerification() {
        try {
            scrolltofooter();
            clickprivacyPolicy();
            redirect.privacyPolicy();
            navigateBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Verifies the 'Cookie Policy' page.
     * @return None
     */
    public void cookiePolicyVerification() {
        try {
            scrolltofooter();
            clickCookiePolicy();
            redirect.cookiePolicy();
            navigateBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Verifies the 'Accessibility' page.
     * @return None
     */
    public void accessibilityVerification() {
        try {
            scrolltofooter();
            accessibility();
            redirect.accessibility();
            navigateBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Verifies the 'Watches' category redirection.
     * @return None
     */
    public void watchesVerification() {
        try {
            scrolltofooter();
            clickWatches();
            redirect.watches();
            navigateBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Verifies the 'Jewelry' category redirection.
     * @return None
     */
    public void jweleryVerification() {
        try {
            scrolltofooter();
            clickJwelery();
            redirect.jwelery();
            navigateBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** 
     * @Created by Ram Prasath
     * @Description Verifies the text content of the categories section.
     * @return None
     */
    public void categoryVerification() {
        try {
            String text = wb.getText(HomePage_Locator_Ram.categories);
            String actualText = "CATEGORIES";
            Assert.assertEquals(text, actualText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

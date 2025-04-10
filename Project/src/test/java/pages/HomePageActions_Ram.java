package pages;

import org.testng.Assert;

import uistore.HomePage_Locator_Ram;
import utils.Base;
import utils.WebDriverHelper;

public class HomePageActions_Ram {

    WebDriverHelper wb = new WebDriverHelper();
    FooterRedirectionActions_Ram redirect = new FooterRedirectionActions_Ram();

    public void scrolltofooter() {
        try {
            wb.javascriptScroll(HomePage_Locator_Ram.footer);
            System.out.println("scrolled");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickYourSecurity() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.yoursecurity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickTermsAndConditions() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.terms);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickprivacyPolicy() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.PrivacyPolicy);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickCookiePolicy() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.CookiePolicy);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void accessibility() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.Accessibility);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickPayByLink() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.PayByLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickWatches() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.watches);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickJwelery() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.jwelery);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateBack() {
        try {
            Base.driver.navigate().back();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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

    public void categoryVerification(){
        try {
            String text = wb.getText(HomePage_Locator_Ram.categories);
            String actualText = "CATEGORIES";
            Assert.assertEquals(text, actualText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

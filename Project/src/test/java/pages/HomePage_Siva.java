package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import uistore.HomeLocators_Siva;
import utils.Base;
import utils.WebDriverHelper;

public class HomePage_Siva extends Base {
    private WebDriverHelper wb;
    public HomePage_Siva(WebDriverHelper webDriverHelper) {
        this.wb = webDriverHelper;
    }

    public void footerVerification() {
        By[] footerLinks = {
            HomeLocators_Siva.contactUs,
            HomeLocators_Siva.luxuryService,
            HomeLocators_Siva.storeFinder,
            HomeLocators_Siva.deliveryInfo,
            HomeLocators_Siva.clickCollect,
            HomeLocators_Siva.returnPolicy,
            HomeLocators_Siva.affirmFinance,
            HomeLocators_Siva.feedBack
        };

        String[] verificationLinks = {
            "https://www.mayors.com/contact-us",
            "https://www.mayors.com/luxury-services",
            "https://www.mayors.com/store-finder",
            "https://www.mayors.com/delivery-information",
            "https://www.mayors.com/click-and-collect",
            "https://www.mayors.com/return-policy",
            "https://www.mayors.com/affirm-finance",
            "https://www.mayors.com/your-feedback"
        };

        scrollToFooter();
        for (int i = 0; i < footerLinks.length; i++) {
            validateLink(footerLinks[i], verificationLinks[i]);
        }
    }

    private void scrollToFooter() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) Base.driver;
            js.executeScript("window.scrollBy(0,6000);");
        } catch (Exception e) {
            System.err.println("Failed to scroll to footer: " + e.getMessage());
        }
    }

    private void validateLink(By linkLocator, String expectedUrl) {
        try {
            wb.clickOnElement(linkLocator);
            String currentUrl = Base.driver.getCurrentUrl();
            Assert.assertEquals(currentUrl, expectedUrl, "URL does not match for locator: " + linkLocator);
            Base.driver.navigate().back();
            scrollToFooter();
        } catch (Exception e) {
            System.err.println("Error processing link: " + linkLocator);
            e.printStackTrace();
        }
    }

    public void searchBarAction(String key){
        wb.clickOnElement(HomeLocators_Siva.searchBar);
        wb.sendKeys(HomeLocators_Siva.searchBar, key);
        wb.enterAction(HomeLocators_Siva.searchBar);
    }
}

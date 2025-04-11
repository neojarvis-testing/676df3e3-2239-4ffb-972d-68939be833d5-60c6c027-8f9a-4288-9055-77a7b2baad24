package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import uistore.HomeLocators_Siva;
import utils.Base;
import utils.ExcelReader;
import utils.WebDriverHelper;

public class HomePage_Siva extends Base {
    private WebDriverHelper wb;

    public HomePage_Siva(WebDriverHelper webDriverHelper) {
        this.wb = webDriverHelper;
    }

    /**
     * @Created by Sivasankar M
     * @Description Verifies all footer links by checking their redirection URLs against expected values.
     * @return None
     */
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
            ExcelReader.readCellValue("Sheet1", "23", "value"),
            ExcelReader.readCellValue("Sheet1", "24", "value"),
            ExcelReader.readCellValue("Sheet1", "25", "value"),
            ExcelReader.readCellValue("Sheet1", "26", "value"),
            ExcelReader.readCellValue("Sheet1", "27", "value"),
            ExcelReader.readCellValue("Sheet1", "28", "value"),
            ExcelReader.readCellValue("Sheet1", "29", "value"),
            ExcelReader.readCellValue("Sheet1", "30", "value")
        };

        scrollToFooter();
        for (int i = 0; i < footerLinks.length; i++) {
            validateLink(footerLinks[i], verificationLinks[i]);
        }
    }

    /**
     * @Created by Sivasankar M
     * @Description Scrolls down to the footer section of the webpage.
     * @return None
     */
    private void scrollToFooter() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) Base.driver;
            js.executeScript("window.scrollBy(0,6000);");
        } catch (Exception e) {
            System.err.println("Failed to scroll to footer: " + e.getMessage());
        }
    }

    /**
     * @Created by Sivasankar M
     * @Description Validates the redirection of a footer link by checking its current URL against the expected URL.
     * @param linkLocator Locator for the footer link.
     * @param expectedUrl Expected URL for validation.
     * @return None
     */
    private void validateLink(By linkLocator, String expectedUrl) {
        try {
            wb.clickOnElement(linkLocator);
            String currentUrl = Base.driver.getCurrentUrl();
            if (currentUrl.contains(expectedUrl)) {
                Assert.assertTrue(true);
            } else {
                Assert.fail();
            }
            Base.driver.navigate().back();
            scrollToFooter();
        } catch (Exception e) {
            System.err.println("Error processing link: " + linkLocator);
            e.printStackTrace();
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /**
     * @Created by Sivasankar M
     * @Description Searches for a keyword in the search bar and submits the search.
     * @param key The keyword to search for.
     * @return None
     */
    public void searchBarAction(String key) {
        wb.clickOnElement(HomeLocators_Siva.searchBar);
        wb.sendKeys(HomeLocators_Siva.searchBar, key);
        wb.enterAction(HomeLocators_Siva.searchBar);
    }
}
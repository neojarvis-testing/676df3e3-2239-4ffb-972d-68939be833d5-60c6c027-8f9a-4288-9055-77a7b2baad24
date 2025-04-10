package pages;

import org.openqa.selenium.By;

import uistore.EarringLocator_Siva;
import utils.Base;
import utils.WebDriverHelper;

public class EarringPage_Siva extends Base  {
    private final WebDriverHelper wb;
    public EarringPage_Siva(WebDriverHelper webDriverHelper) {
        this.wb = webDriverHelper;
    }
    public void earringAction() {
        try {
            wb.javascriptScroll(EarringLocator_Siva.metalTypeBrand); 
            Thread.sleep(2000);
            wb.clickOnElement(EarringLocator_Siva.metalTypeBrand);
            wb.clickOnElement(EarringLocator_Siva.roseGold);  
            // wb.clickOnElement(locator2);
            // performFilterSelection(EarringLocator_Siva.brandTab,EarringLocator_Siva.gucciBrand, "Failed to scroll to Brand Tab");
            // Thread.sleep(500);
            // performFilterSelection(EarringLocator_Siva.metalTypeBrand,EarringLocator_Siva.roseGold, "Failed to click Metal Type Brand");
            // performFilterSelection(EarringLocator_Siva.earringStyle,EarringLocator_Siva.dropEarrings, "Failed to click Earring Style");
            // Thread.sleep(8000);
            // performSelection(EarringLocator_Siva.firstProduct, "Failed to click First Product");
            // performSelection(EarringLocator_Siva.liveAdvice, "Failed to click Live Advice");
        } catch (Exception e) {
            System.err.println("An error occurred during the earring action sequence.");
            e.printStackTrace();
        }
    }
    private void performFilterSelection(By locator1,By locator2, String errorMessage) {
        try {
            // wb.javascriptScroll(locator1); 
            wb.clickOnElement(locator1);  
            wb.clickOnElement(locator2);
            Thread.sleep(500);

        } catch (Exception e) {
            System.err.println(errorMessage);
            e.printStackTrace();
        }
    }
    private void performSelection(By locator1,String errorMessage) {
        try {
            wb.javascriptScroll(locator1); 
            wb.clickOnElement(locator1);  
        } catch (Exception e) {
            System.err.println(errorMessage);
            e.printStackTrace();
        }
    }
}

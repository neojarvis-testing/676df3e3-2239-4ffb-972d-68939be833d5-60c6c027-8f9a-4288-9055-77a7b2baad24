package pages;

import org.openqa.selenium.By;

import uistore.EarringLocator_Siva;
import utils.Base;
import utils.WebDriverHelper;

public class EarringPage_Siva extends Base {

    private final WebDriverHelper wb;

    /**
     * @Created by Sivasankar M
     * @Description Constructor for initializing WebDriverHelper instance.
     * @param webDriverHelper An instance of WebDriverHelper to interact with web elements.
     */
    public EarringPage_Siva(WebDriverHelper webDriverHelper) {
        this.wb = webDriverHelper;
    }

    /**
     * @Created by Sivasankar M
     * @Description Performs actions on the earring page such as scrolling, clicking on metal type brand,
     *              selecting the brand tab, hovering over elements, and choosing rose gold earrings.
     * @return None
     */
    public void earringAction() {
        try {
            wb.javascriptScroll(EarringLocator_Siva.metalTypeBrand); 
            wb.clickOnElement(EarringLocator_Siva.brandTab);
            wb.hoverOverElement(EarringLocator_Siva.metalTypeBrand);
            wb.clickOnElement(EarringLocator_Siva.metalTypeBrand);
            wb.clickOnElement(EarringLocator_Siva.roseGold);

        } catch (Exception e) {
            System.err.println("An error occurred during the earring action sequence.");
            e.printStackTrace();
        }
    }
}
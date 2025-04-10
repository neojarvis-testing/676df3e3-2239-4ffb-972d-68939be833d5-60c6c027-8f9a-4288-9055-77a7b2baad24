package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class WebDriverHelper extends Base {

    /*
     * a. Method Name: hardWait()
     * b. Author Name: Umang Raj
     * c. Description: This method is used to give some wait
     * d. Parameters: By locator, int timeoutInSeconds
     * e. Return type: void
     */
    public void hardWait(long milisecs) {
        try {
            Thread.sleep(milisecs);
        } catch (Exception e) {

        }
    }

    /*
     * a. Method Name: waitForElementToBeVisible()
     * b. Author Name: Umang Raj
     * c. Description: This method is used to explicitly wait for an element of
     * webpage to be visible
     * d. Parameters: By locator, int timeoutInSeconds
     * e. Return type: void
     */

    public void waitForElementToBeVisible(By locator, int timeoutInSeconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a. Method Name: waitForElementToBeClickable()
     * b. Author Name: UmangRaj
     * c. Description: This method is used to explicitly wait for an element of web
     * page to be clickable
     * d. Parameters: By locator, int timeoutInSeconds
     * e. Return type: void
     */
    public void waitForElementToBeClickable(By locator, int timeoutInSeconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                    .until(ExpectedConditions.elementToBeClickable(locator));
        } catch (Exception e) {

            Screenshot.captureScreenshot(e.getMessage());

        }
    }

    /*
     * a. Method Name: waitForValueToBeEntered()
     * b. Author Name: Umang Raj
     * c. Description: This method is used to wait implicitly for wait until value
     * entered
     * d. Parameters: By locator, String value, int timeoutInSeconds
     * e. Return type: void
     */

    public void waitForValueToBeEntered(By locator, String value, int timeoutInSeconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                    .until(ExpectedConditions.textToBePresentInElementValue(locator, value));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a. Method Name: clickOnElement()
     * b. Author Name: Umang Raj
     * c. Description: This method is used to perform click operation on the web
     * elements
     * d. Parameters: By locator
     * e. Return type: void
     */
    public void clickOnElement(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a. Method Name: sendKeys()
     * b. Author Name: Umang Raj
     * c. Description: This method is used to send values into the webelements
     * d. Parameters: By locator, String data
     * e. Return type: void
     */

    public void sendKeys(By locator, String data) {
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.sendKeys(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a. Method Name: getText()
     * b. Author Name: Umang Raj
     * c. Description: This method is used to get linked text from the web element
     * d. Parameters: By locator
     * e. Return type: String (actualText)
     */

    public String getText(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            return webElement.getText();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /*
     * a. Method Name: jsClick()
     * b. Author Name: Umang Raj
     * c. Description: This method performs click action using javascript
     * d. Parameters: By locator
     * e. Return type: void
     */
    public void jsClick(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a. Method Name: javascriptScroll()
     * b. Author Name: Umang Raj
     * c. Description: This method is used to scroll on the webpage, it scroll till
     * it finds the Webelement
     * d. Parameters: By locator
     * e. Return type: void
     */
    public void javascriptScroll(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a. Method Name: javascriptHighlight()
     * b. Author Name: Umang Raj
     * c. Description: This method is used to highlight the WebElement
     * d. Parameters: By locator
     * e. Return type: void
     */
    public void javascriptHighlight(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.border= '5px solid blue'", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a. Method Name: switchDriverToNewWinow()
     * b. Author Name: Umang Raj
     * c. Description: This method is used to switch driver from the current window
     * to the new window
     * d. Parameters: String parentWindowId
     * e. Return type: void
     */
    public void switchToNewWindow() {
        try {
            String parentWindow = driver.getWindowHandle();
            Set<String> child = driver.getWindowHandles();
            for (String window : child) {
                if (!window.equals(parentWindow)) {
                    driver.switchTo().window(window);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a. Method Name: enterAction()
     * b. Author Name: Umang Raj
     * c. Description: This method is used to perform keyboard ENTER action
     * d. Parameters: By locator
     * e. Return type: void
     */
    public void enterAction(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a. Method Name: actionDownAndEnter()
     * b. Author Name: Umang Raj
     * c. Description: This method is used to perform the down key action
     * d. Parameters: By locator
     * e. Return type: void
     */
    public void actionDownAndEnter(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            Actions act = new Actions(driver);
            act.sendKeys(webElement, Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a. Method Name: hoverOverElement()
     * b. Author Name: Umang Raj
     * c. Description: This method is used to perform the hovering action over an
     * element
     * d. @Param: By locator
     * e. Return type: void
     */
    public void hoverOverElement(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            Actions actions = new Actions(driver);
            actions.moveToElement(webElement).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

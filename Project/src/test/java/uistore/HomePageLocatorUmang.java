package uistore;

import org.openqa.selenium.By;

public class HomePageLocatorUmang {
    public static By cookies = By.cssSelector("#onetrust-accept-btn-handler");
    public static By watches = By.xpath("(//a[contains(text(),'Watches')])[1]");
    public static By Bestsellers = By.cssSelector("div a[href='/c/Watches/Best-Sellers']");
    public static By rolex = By.xpath("(//a[contains(text(),'Rolex')])[1]");
    public static By deepsea = By.cssSelector("a[href='/rolex/deepsea']");
    
}

package uistore;

import org.openqa.selenium.By;

public class BrandLocators {

    public static By cookies = By.id("onetrust-accept-btn-handler");
    public static By brands = By.xpath("(//a[@href='/c/Brands'])[1]");
    public static By omega = By.xpath("(//a[@href='/c/Brands/Omega'])[2]");
    public static By mens_watches = By.xpath("(//p[contains(text(),'Mens Watches')])[3]");
    public static By semaster = By.xpath("//div[text()='Seamaster ']");
    public static By blue = By.xpath("//div[text()='Blue ']");
    public static By first_product = By.cssSelector("div[class='productTileBrand']");
    public static By AddToShoppingbag = By.id("addToCartSubmit");
    public static By popup = By.xpath("//div[@class='dismiss-popup']");

}
package uistore;

import org.openqa.selenium.By;

public class JewelryLocator {

    public static By firstProduct = By.cssSelector("div[id='productTile-22050235']");
    public static By brandCollectionfilter = By.cssSelector("div[aria-label='Filters below for Brand Collections']");
    public static By jwelery = By.xpath("(//a[@href='/c/Jewelry/'])[1]");
    public static By metalTypefilter = By.cssSelector("div[aria-label='Filters below for Metal Type']");
    public static By chanel = By.xpath("(//a[@class='desktopNavLink'])[27]");
    public static By Rings = By.xpath("//div[text()='Rings ']");
    public static By cococrush = By.xpath("//div[text()='Coco Crush ']");
    public static By cookies = By.id("onetrust-accept-btn-handler");
    public static By whitegold = By.xpath("//div[text()='White Gold ']");
    public static By popup = By.xpath("//div[@class='dismiss-popup']");

}
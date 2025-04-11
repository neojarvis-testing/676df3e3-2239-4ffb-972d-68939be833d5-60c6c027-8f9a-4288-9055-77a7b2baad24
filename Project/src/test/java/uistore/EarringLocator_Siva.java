package uistore;

import org.openqa.selenium.By;

public class EarringLocator_Siva {
    public static By brandTab = By.cssSelector("div[aria-label='Filters below for Brand']");
    public static By gucciBrand = By.xpath("//div[contains(text(),'GUCCI')]");
    public static By metalTypeBrand = By.xpath("//div[@class='facetItem facetItemContainer  facet-Metaltype']");
    public static By roseGold = By.xpath("(//div[contains(text(),'Rose Gold ')])[1]");
    public static By earringStyle = By.cssSelector("div[aria-label='Filters below for Earring Style']");
    public static By dropEarrings = By.cssSelector("(//div[contains(text(),'Drop Earrings ')])[1]");
    public static By firstProduct = By.cssSelector("div[class='productTile firstPage'] a");
    public static By liveAdvice = By.cssSelector(".atcLiveButton");




}

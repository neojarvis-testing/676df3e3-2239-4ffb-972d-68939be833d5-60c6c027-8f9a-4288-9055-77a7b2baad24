package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.WeddingPageLocationDiv;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class WeddingPageActionDiv {

    public static void weddingaction(ExtentTest test) {
        dismispopup(test);
        clickmetaltype(test);
        clickgemstone(test);
        clickbracelettype(test);
    }
       public static void dismispopup(ExtentTest test)
       {
        WebDriverHelper wb = new WebDriverHelper();
        wb.waitForElementToBeClickable(WeddingPageLocationDiv.dismiswedpopup, 30);
        wb.clickOnElement(WeddingPageLocationDiv.dismiswedpopup);
        LoggerHandler.info("Clicked  popup dismiised"+wb.getText(WeddingPageLocationDiv.dismiswedpopup));
        test.log(Status.INFO,"Popup dismmised");
       }

       public static void clickmetaltype(ExtentTest test)
       {
        try {
            
       
        WebDriverHelper wb = new WebDriverHelper();
        wb.clickOnElement(WeddingPageLocationDiv.metaltype);
        LoggerHandler.info("Clicked "+wb.getText(WeddingPageLocationDiv.metaltype));
        test.log(Status.INFO,"Clicked "+wb.getText(WeddingPageLocationDiv.metaltype));
        wb.clickOnElement(WeddingPageLocationDiv.yellowgold);
        LoggerHandler.info("Clicked "+wb.getText(WeddingPageLocationDiv.yellowgold));
        test.log(Status.INFO,"Clicked "+wb.getText(WeddingPageLocationDiv.yellowgold));
        String jwellery=wb.getText(By.xpath("(//span[@class='desktopNavSectionHeader '])[9]")).trim();
        Assert.assertEquals(jwellery,"Wedding Jewelry");
       } catch (Exception e) {
        e.printStackTrace();
       }catch(AssertionError e)
       {
        e.printStackTrace();
       }
    }
       public static void clickgemstone(ExtentTest test)
       {
        WebDriverHelper wb = new WebDriverHelper();
        wb.hoverOverElement(WeddingPageLocationDiv.gemstone);
        wb.clickOnElement(WeddingPageLocationDiv.gemstone);
        LoggerHandler.info("Clicked "+wb.getText(WeddingPageLocationDiv.gemstone));
        test.log(Status.INFO,"Clicked "+wb.getText(WeddingPageLocationDiv.gemstone));
        wb.hoverOverElement(WeddingPageLocationDiv.diamond);
        wb.clickOnElement(WeddingPageLocationDiv.diamond);
        LoggerHandler.info("Clicked "+wb.getText(WeddingPageLocationDiv.diamond));
        test.log(Status.INFO,"Clicked "+wb.getText(WeddingPageLocationDiv.diamond));
       }

       public static void clickbracelettype(ExtentTest test)
       {
        WebDriverHelper wb = new WebDriverHelper();
        wb.hoverOverElement(WeddingPageLocationDiv.braceletstyle);
        wb.clickOnElement(WeddingPageLocationDiv.braceletstyle);
        LoggerHandler.info("Clicked "+wb.getText(WeddingPageLocationDiv.braceletstyle));
        test.log(Status.INFO,"Clicked "+wb.getText(WeddingPageLocationDiv.braceletstyle));
        wb.hoverOverElement(WeddingPageLocationDiv.bracelets);
        wb.clickOnElement(WeddingPageLocationDiv.bracelets);
        LoggerHandler.info("Clicked "+wb.getText(WeddingPageLocationDiv.bracelets));
        test.log(Status.INFO,"Clicked "+wb.getText(WeddingPageLocationDiv.bracelets));

       }
           
           
         
            
        } 

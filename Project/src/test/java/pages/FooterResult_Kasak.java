package pages;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentTest;

import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class FooterResult_Kasak {
    WebDriverHelper wb = new WebDriverHelper();

    public void aboutMayorsVerify(ExtentTest test){

        try{
            
    
        Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(), ExcelReader.readCellValue("sheet4", "1", "value"), test);
        

        }catch(AssertionError e){
            LoggerHandler.info(e.getMessage());
        }
    }

        public void pressMediaVerify(ExtentTest test){
            try{

   
        Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(), ExcelReader.readCellValue("sheet4", "2", "value"), test);
        

            }catch(AssertionError e){
                LoggerHandler.info(e.getMessage());
            }

        }

        
        public void careersVerify(ExtentTest test){
            try{

        Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(), ExcelReader.readCellValue("sheet4", "3", "value"), test);



        Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "4", "value"), test);


            }catch(AssertionError e){
                LoggerHandler.info(e.getMessage());
            }

        }
        
        public void sustainVerify(ExtentTest test){
            try{

        Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(), ExcelReader.readCellValue("sheet4", "5", "value"), test);


        Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "6", "value"), test);

            }catch(AssertionError e){
                LoggerHandler.info(e.getMessage());
            }
        
        }
        
        public void newsletterVerify(ExtentTest test){
            try{

                Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(), ExcelReader.readCellValue("sheet4", "7", "value"), test);
        
            
                Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "8", "value"), test);

            

            }catch(AssertionError e){
                LoggerHandler.info(e.getMessage());
            }
        }

       public void weddingVerify(ExtentTest test){
        try{


            Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(), ExcelReader.readCellValue("sheet4", "9", "value"), test);
        
            
            Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "10", "value"), test);

    

        }catch(AssertionError e){
            LoggerHandler.info(e.getMessage());
        }

       }
      

       public void rolexVerify(ExtentTest test){
        try{

            Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(), ExcelReader.readCellValue("sheet4", "11", "value"), test);
        
            
            Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "12", "value"), test);

        }catch(AssertionError e){
            LoggerHandler.info(e.getMessage());
        }

       }
        
       public void brandVerify(ExtentTest test){
        try{


            Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(), ExcelReader.readCellValue("sheet4", "13", "value"), test);
        
            
            Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "14", "value"), test);
     


        Assertion.assertionVerifyByEqual(wb.getText(By.xpath("//span[contains(text(),'About Mayors')]")),ExcelReader.readCellValue("sheet4", "15", "value") , test);


        }catch(AssertionError e){
            LoggerHandler.info(e.getMessage());
        }

    }


    }
    

package pages;

import com.aventstack.extentreports.ExtentTest;

import uistore.HomePageLocators_Kasak;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;


public class FooterResult_Kasak {

    public static void aboutMayorsVerify(ExtentTest test){

        try{
            
    
        Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(), ExcelReader.readCellValue("sheet4", "1", "value"), test);
        

        }catch(AssertionError e){
            LoggerHandler.info(e.getMessage());
        }
    }

        public static void pressMediaVerify(ExtentTest test){
            try{

   
        Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(), ExcelReader.readCellValue("sheet4", "2", "value"), test);
        

            }catch(AssertionError e){
                LoggerHandler.info(e.getMessage());
            }

        }

        
        public static void careersVerify(ExtentTest test){
            try{

        Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(), ExcelReader.readCellValue("sheet4", "3", "value"), test);



        Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "4", "value"), test);


            }catch(AssertionError e){
                LoggerHandler.info(e.getMessage());
            }

        }
        
        public static void sustainVerify(ExtentTest test){
            try{

        Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(), ExcelReader.readCellValue("sheet4", "5", "value"), test);


        Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "6", "value"), test);

            }catch(AssertionError e){
                LoggerHandler.info(e.getMessage());
            }
        
        }
        
        public static void newsletterVerify(ExtentTest test){
            try{

                Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(), ExcelReader.readCellValue("sheet4", "7", "value"), test);
        
            
                Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "8", "value"), test);

            

            }catch(AssertionError e){
                LoggerHandler.info(e.getMessage());
            }
        }

       public static void weddingVerify(ExtentTest test){
        try{


            Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(), ExcelReader.readCellValue("sheet4", "9", "value"), test);
        
            
            Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "10", "value"), test);

    

        }catch(AssertionError e){
            LoggerHandler.info(e.getMessage());
        }

       }
      

       public static void rolexVerify(ExtentTest test){
        try{

            Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(), ExcelReader.readCellValue("sheet4", "11", "value"), test);
        
            
            Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "12", "value"), test);

        }catch(AssertionError e){
            LoggerHandler.info(e.getMessage());
        }

       }
        
       public static void brandVerify(ExtentTest test){
        try{

            WebDriverHelper wb = new WebDriverHelper();


            Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(), ExcelReader.readCellValue("sheet4", "13", "value"), test);
        
            
            Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "14", "value"), test);
     


        Assertion.assertionVerifyByEqual(wb.getText(HomePageLocators_Kasak.keyword),ExcelReader.readCellValue("sheet4", "15", "value") , test);


        }catch(AssertionError e){
            LoggerHandler.info(e.getMessage());
        }

    }

    public static void verifyAllTerms(ExtentTest test){
        aboutMayorsVerify(test);
        pressMediaVerify(test);
        careersVerify(test);
        sustainVerify(test);
        newsletterVerify(test);
        weddingVerify(test);
        rolexVerify(test);
        brandVerify(test);

    }




    }
    

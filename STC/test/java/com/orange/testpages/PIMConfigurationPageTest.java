package com.Orange.testPages;

import com.Orange.BasesClass.BaseClass;
import com.Orange.Pages.HomePage;
import com.Orange.Pages.LoginPage;
import com.Orange.Pages.PIMConfigurationPage;
import com.Orange.Pages.PIMPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PIMConfigurationPageTest extends BaseClass {
    LoginPage loginPage;
    HomePage homePage;
    PIMPage pimPage;

    PIMConfigurationPage optionalField;
    public PIMConfigurationPageTest(){
        super();
    }
    @BeforeMethod
    public void setup() {
        initialization ();
        optionalField = new PIMConfigurationPage ();
        loginPage = new LoginPage ();
        homePage = new HomePage ();
        pimPage = new  PIMPage ();
        optionalField = new PIMConfigurationPage ();
        homePage = loginPage.validateLoginButton (prop.getProperty ("user"), prop.getProperty ("pass"));
        pimPage= homePage.checkPIMLink ();
       optionalField = pimPage.validateConfigurationLink ();

    }
    @Test(priority = 1)
    public void verifyOptionalFieldLabelTest(){
      Assert.assertTrue ( optionalField.validateOptionalFieldLabel ());
    }
    @Test(priority = 2)
    public void verifySaveButtonTest(){
        optionalField.validateSaveButton ();

    }








    @AfterMethod
    public void TearDown(){
        driver.quit ();
    }

}

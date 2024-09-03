package com.Orange.testPages;

import com.Orange.BasesClass.BaseClass;
import com.Orange.Pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PIMPageTest extends BaseClass {
    EmployeeListPage employeeListPage;
    LoginPage loginPage;
    HomePage homePage;
    PIMPage pimPage;

    PIMConfigurationPage PIMConfigurationPage;
    public PIMPageTest(){
        super();
    }
    @BeforeMethod
    public void setup() {
        initialization ();
      employeeListPage = new EmployeeListPage ();
        PIMConfigurationPage = new PIMConfigurationPage ();
        loginPage = new LoginPage ();
        homePage = new HomePage ();
        pimPage = new  PIMPage ();
        homePage = loginPage.validateLoginButton (prop.getProperty ("user"), prop.getProperty ("pass"));
        pimPage =homePage.checkPIMLink ();

    }
    @Test(priority = 1)
    public void verifyEmpInfoTextTest(){
       Assert.assertTrue ( pimPage.validateEmpInfoText ());
    }
    @Test(priority = 2)
    public void verifyEmployeeListLink(){
      EmployeeListPage employeeListPage = pimPage.validateEmployeeListLink ();
      Assert.assertNotNull (employeeListPage);
    }
    @Test(priority = 3)
    public void verifyAddEmployeeLinkTest(){
        PIMAddEmployeePage addEmployeePage = pimPage.validateAddEmployeeLink ();
        Assert.assertNotNull (addEmployeePage);
    }
    @Test(priority = 4)
     public void verifyConfigurationLinkTest(){
       PIMConfigurationPage = pimPage.validateConfigurationLink ();
       Assert.assertNotNull (PIMConfigurationPage);


    }


    @AfterMethod
    public void TearDown(){
        driver.quit ();
    }
}

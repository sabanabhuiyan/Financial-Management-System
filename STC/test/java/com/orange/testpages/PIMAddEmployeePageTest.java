package com.Orange.testPages;

import com.Orange.BasesClass.BaseClass;
import com.Orange.Pages.*;
import com.Orange.Utilities.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.Orange.Utilities.TestUtil.getTestData;

public class PIMAddEmployeePageTest extends BaseClass {
    PIMAddEmployeePage addEmployeePage;
    LoginPage loginPage;
    HomePage homePage;
    PIMPage pimPage;
    TestUtil util;
    String sheetName = "AddEmployee";
     EmployeeListPage employeeListPage;

    public PIMAddEmployeePageTest(){
        super();
    }
    @BeforeMethod
    public void setup() {
        initialization ();
        addEmployeePage = new PIMAddEmployeePage ();
        loginPage = new LoginPage ();
        homePage = new HomePage ();
        pimPage = new  PIMPage ();
        homePage = loginPage.validateLoginButton (prop.getProperty ("user"), prop.getProperty ("pass"));
        pimPage =homePage.checkPIMLink ();
        addEmployeePage =pimPage.validateAddEmployeeLink ();

    }
    @Test(priority = 1)
    public void verifyAddEmployeeLabelTest(){
     Assert.assertTrue (addEmployeePage.validateAddEmployeeLabel ());
    }

    @DataProvider
    public Object[][] getEmplyeesDataFromExcelSt(){
        Object[][] data = getTestData ("AddEmployee");
        return data;
    }


    @Test(priority = 2,dataProvider= "getEmplyeesDataFromExcelSt")
    public void verifySaveButtonOfAddEmployeeLinkTest(String FirstName,String MidleName,String LastName) {
    addEmployeePage.validateSaveButtonOfAddEmployeeLink ("FirstName","MidleName","LastName");
//        addEmployeePage.validateSaveButtonOfAddEmployeeLink ("josh","js","shan","");

    }



    @AfterMethod
    public void TearDown(){
        driver.quit ();
    }
}

package com.Orange.testPages;

import com.Orange.BasesClass.BaseClass;
import com.Orange.Pages.AddUserPage;
import com.Orange.Pages.AdminPage;
import com.Orange.Pages.HomePage;
import com.Orange.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddUserPageTest extends BaseClass {

//    LoginPage loginPage;
//    HomePage homePage;
//    AdminPage adminPage;
//    AddUserPage addUserPage;
//
//    public AddUserPageTest() {
//        super ();
//    }
//
//    @BeforeMethod
//    public void setup() {
//        initialization ();
//        adminPage = new AdminPage ();
//        addUserPage = new AddUserPage ();
//        loginPage = new LoginPage ();
//        homePage = new HomePage ();
//        homePage = loginPage.validateLoginButton (prop.getProperty ("user"), prop.getProperty ("pass"));
//        adminPage = homePage.checkAdminLink ();
//        addUserPage =adminPage.checkAddUserLink ();
//    }
//    @Test(priority = 1)
//    public void verifyAddUserTextLabelTest(){
//       Assert.assertNotNull ( addUserPage.addUserTextLabel ());
//    }
//    @Test(priority = 2)
//    public void verifyAddingNewUserTest(){
//        addUserPage.checkAddingNewUser ("Arassist","Ps123456","Ps123456");
//    }
//
//    @AfterMethod
//    public void TearDown(){
//        driver.quit ();
//    }
}
package com.Orange.testPages;

import com.Orange.BasesClass.BaseClass;
import com.Orange.Pages.HomePage;
import com.Orange.Pages.LoginPage;
import com.Orange.Pages.ResetPasswordPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
    LoginPage loginPage;
    ResetPasswordPage resetPasswordPage;
    HomePage homePage;
    public LoginTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        initialization ();
        loginPage = new LoginPage ();
    }
    @Test(priority = 1)
    public void verifyPageTitleTest(){
        String title =loginPage.validatePageTitle ();
        Assert.assertEquals (title,"OrangeHRM");
    }
    @Test(priority = 2)
    public void verifyOrangeImageTest(){
        Assert.assertNotNull (loginPage.validateOrangeImage ());
    }
    @Test(priority = 3)
    public void verifyHrmLoginImageTest(){
       Assert.assertTrue ( loginPage.validateHrmLoginImage ());
    }
    @Test(priority = 4)
    public void verifyResetPasswordLinkTest(){
       resetPasswordPage = loginPage.validateResetPasswordLink ();
       Assert.assertNotNull (resetPasswordPage);
    }
    @Test(priority = 5)
    public void verifyLoginButtonTest(){
        homePage =loginPage.validateLoginButton (prop.getProperty ("user"),prop.getProperty ("pass"));
        Assert.assertTrue (true);
    }

    @AfterMethod
    public void TearDown(){
        driver.quit ();
    }

}

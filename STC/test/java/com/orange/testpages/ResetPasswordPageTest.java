package com.Orange.testPages;

import com.Orange.BasesClass.BaseClass;

import com.Orange.Pages.LoginPage;
import com.Orange.Pages.ResetPasswordPage;
import com.Orange.Pages.SendResetPasswordLinkPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ResetPasswordPageTest extends BaseClass {
    LoginPage loginPage;
    ResetPasswordPage resetPasswordPage;
    SendResetPasswordLinkPage sendResetP;
    public ResetPasswordPageTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        initialization ();
        loginPage = new LoginPage ();
        resetPasswordPage = new ResetPasswordPage ();
        loginPage.validateResetPasswordLink ();
    }
    @Test(priority = 2)
    public void verifyCancelLinkTest(){
       loginPage = resetPasswordPage.validateCancelLink ();


    }
    @Test(priority = 1)
    public void verifyResetPasswordButtonLinkPageTest(){
       sendResetP = resetPasswordPage.validateResetPasswordButtonLink (prop.getProperty ("user"));
    }

    @AfterMethod
    public void TearDown(){
        driver.quit ();
    }
}

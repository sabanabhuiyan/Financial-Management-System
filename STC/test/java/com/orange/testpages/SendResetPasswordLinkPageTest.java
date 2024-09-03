package com.Orange.testPages;

import com.Orange.BasesClass.BaseClass;
import com.Orange.Pages.LoginPage;
import com.Orange.Pages.ResetPasswordPage;
import com.Orange.Pages.SendResetPasswordLinkPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SendResetPasswordLinkPageTest extends BaseClass {
    LoginPage loginPage;
    ResetPasswordPage resetPasswordPage;
    SendResetPasswordLinkPage sendResetP;
    public SendResetPasswordLinkPageTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        initialization ();
        loginPage = new LoginPage ();
        resetPasswordPage = new ResetPasswordPage ();
        sendResetP = new SendResetPasswordLinkPage ();
        loginPage.validateResetPasswordLink ();
    }
    @Test(priority = 1)
    public void verifySuccessfulTextTest(){
       Assert.assertTrue ( sendResetP.validateSuccessfulText ());
    }
    @AfterMethod
    public void TearDown(){
        driver.quit ();
    }
}

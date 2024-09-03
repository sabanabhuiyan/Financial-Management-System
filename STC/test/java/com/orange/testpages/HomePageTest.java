package com.Orange.testPages;

import com.Orange.BasesClass.BaseClass;
import com.Orange.Pages.*;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
    LoginPage loginPage;
    HomePage homePage;
    public HomePageTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        initialization ();
        loginPage = new LoginPage ();
        homePage = new HomePage ();
        homePage =loginPage.validateLoginButton (prop.getProperty ("user"),prop.getProperty ("pass"));
    }
    @Test(priority = 1 )
    public void verifyTitleTest(){
      String flag =  homePage.checkTitle ();
        Assert.assertEquals (flag,"OrangeHRM");
    }
    @Test(priority = 2 )
    public void verifySearchBoxTest(){
        Assert.assertNotNull ( homePage.checkSearchBox ("Admin"));

    }
    @Test(priority = 3)
    public void verifyAdminLinkTest(){
        AdminPage page = homePage.checkAdminLink ();
        Assert.assertNotNull (page);
    }
    @Test(priority = 4 )
    public void verifyPIMLinkTest(){
        PIMPage pimPage = homePage.checkPIMLink ();
        Assert.assertNotNull (pimPage);
    }
    @Test(priority = 6)
    public void verifyTimeLinkTest(){
       Assert.assertNotNull ( homePage.checkTimeLink ());
    }
    @Test(priority = 7)
    public void verifyRecruitmentLinkTest(){
       Assert.assertNotNull ( homePage.checkRecruitmentLink ());
    }
    @Test(priority = 8 )
    public void verifyMyInfoLinkTest(){
        Assert.assertNotNull (homePage.checkMyInfoLink ());
    }
    @Test(priority = 9)
    public void verifyPerformanceLinkTest(){
       Assert.assertNotNull ( homePage.checkPerformanceLink ());
    }
    @Test(priority = 10)
    public void verifyDashboardLinkTest(){
        Assert.assertNotNull (homePage.checkDashboardLink ());
    }
    @Test(priority = 11)
    public void verifyDirectoryLinkTest(){
       Assert.assertNotNull ( homePage.checkDirectoryLink ());
    }
    @Test(priority =12 )
    public void verifyMaintenanceLinkTest(){
       Assert.assertNotNull ( homePage.checkMaintenanceLink ());
    }
    @Test(priority =13 )
    public void verifyBuzzLinkTest(){
        Assert.assertNotNull (homePage.checkBuzzLink ());
    }
    @Test(priority =14 )
    public void verifyDropDownIconTest(){
       Assert.assertTrue ( homePage.checkUserDropdownIcon ());
    }
    @Test(priority = 15 )
    public void verifyAboutLinkTest(){
        homePage.checkUserDropdownIcon ();
       Assert.assertNotNull ( homePage.checkAboutLink ());
    }
    @Test(priority =16 )
    public void verifySupportLinkTest(){
        homePage.checkUserDropdownIcon ();
       Assert.assertNotNull ( homePage.checkSupportLink ());
    }
    @Test(priority =17 )
    public void verifyChangePasswordLinkTest(){
        homePage.checkUserDropdownIcon ();
       Assert.assertNotNull ( homePage.checkChangePasswordLink ());
    }
    @Test(priority = 18)
    public void verifyLogoutLinkTest(){
        homePage.checkUserDropdownIcon ();
       Assert.assertNotNull ( homePage.checkLogoutLink ());
    }

    @AfterMethod
    public void TearDown(){
        driver.quit ();
    }
}

package Tests;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;
public class LoginTest extends TestBase
{
    HomePage homePage;
    LoginPage loginPage;

    @Test
    public void ValidLogin()
    {
            //TC_19
        homePage=new HomePage(driver);
        loginPage=new LoginPage(driver);
        homePage.navigate();
        homePage.clickLogin();
        loginPage.EnterEmail("abdoaboelela@gmail.com");
        loginPage.EnterPassword("Test@1234");
        loginPage.clickLogin();
    }
    public void InvalidLogin()
    {
        //TC_20
    homePage=new HomePage(driver);
    loginPage=new LoginPage(driver);
    homePage.navigate();
    homePage.clickLogin();
    loginPage.EnterEmail("aaa123@gmail.com");
    loginPage.EnterPassword("Test@1234");
    loginPage.clickLogin();
     }
    public void InvalidPassword()
        {
            //TC_21
    homePage=new HomePage(driver);
    loginPage=new LoginPage(driver);
    homePage.navigate();
    homePage.clickLogin();
    loginPage.EnterEmail("abdoaboelela@gmail.com");
    loginPage.EnterPassword("aa121aa2");
    loginPage.clickLogin();
        }
}

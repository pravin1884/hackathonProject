package Tests;

import Pages.BaseClass;
import Pages.HomePage;
import Pages.LoginPage;
import Utilities.ReusableMethods;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    public ReusableMethods rm;
    public HomePage home;
    public LoginPage loginPage;

    @Test(priority = -1)
    public void initialize() {
        home = new HomePage();
        loginPage = new LoginPage();
        rm = new ReusableMethods();
    }

    @Test
    public void LoginInTest() {
        rm.waitForElement(home.homeBtn);
        home.loginBtn.click();
        rm.waitForElement(loginPage.username);
        rm.enterText(loginPage.username, prop.getProperty("UserName"));
        rm.enterText(loginPage.password, prop.getProperty("Password"));
        loginPage.closeBtn.click();
    }
}

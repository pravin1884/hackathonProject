package Tests;

import Pages.BaseClass;
import Pages.HomePage;
import Pages.SignUpPage;
import Utilities.ReusableMethods;
import org.testng.annotations.Test;

public class SignUpTest extends BaseClass {

    public ReusableMethods rm;
    public HomePage home;
    public SignUpPage signUpPage;

    @Test(priority = -1)
    public void initialize() {
        home = new HomePage();
        signUpPage = new SignUpPage();
        rm = new ReusableMethods();
    }

    @Test
    public void SignUpTest() {
        rm.waitForElement(home.homeBtn);
        home.signUpBtn.click();
        rm.waitForElement(home.signUpBtn);
        rm.enterText(signUpPage.username, prop.getProperty("UserName"));
        rm.enterText(signUpPage.password, prop.getProperty("Password"));
        signUpPage.closeBtn.click();
    }
}

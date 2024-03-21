package Tests;

import Pages.AddToCartpage;
import Pages.BaseClass;
import Pages.HomePage;
import Utilities.ReusableMethods;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseClass {

    public ReusableMethods rm;
    public HomePage home;
    public AddToCartpage addToCartpage;

    @Test(priority = -1)
    public void initialize() {
        home = new HomePage();
        addToCartpage = new AddToCartpage();
        rm = new ReusableMethods();
    }

    @Test
    public void LoginInTest() {
        rm.waitForElement(home.homeBtn);
        addToCartpage.selectProduct(prop.getProperty("ProductName"));
        driver.switchTo().alert().accept();
        home.cartBtn.click();
        addToCartpage.verifyProductAddedToCartPage(prop.getProperty("ProductName"));
    }
}

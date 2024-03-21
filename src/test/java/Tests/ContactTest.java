package Tests;

import Pages.BaseClass;
import Pages.ContactPage;
import Pages.HomePage;
import Utilities.ReusableMethods;
import org.testng.annotations.Test;

public class ContactTest extends BaseClass {

    public ReusableMethods rm;
    public HomePage home;
    public ContactPage contactPage;

    @Test(priority = -1)
    public void initialize() {
        home = new HomePage();
        contactPage = new ContactPage();
        rm = new ReusableMethods();
    }

    @Test
    public void testSteps() {
        rm.waitForElement(home.homeBtn);
        home.contact.click();
        rm.waitForElement(contactPage.contactEmailField);
        rm.enterText(contactPage.contactEmailField, prop.getProperty("Email"));
        rm.enterText(contactPage.contactNameField, prop.getProperty("ContactName"));
        rm.enterText(contactPage.MessageField, prop.getProperty("Message"));
    }
}

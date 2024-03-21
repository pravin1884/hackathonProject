package Tests;

import Pages.HomePage;
import Pages.NewMessagePopUpPage;
import Utilities.BaseClass;
import org.testng.annotations.Test;

public class SeleniumTest extends BaseClass {
    HomePage home = new HomePage();
    NewMessagePopUpPage message = new NewMessagePopUpPage();
    @Test
    void testSteps() throws InterruptedException {
        Thread.sleep(2000);
        home.clickOnContact();
        //message.enterText(message.contactEmailField,"pravind245@gmail.com");
        //message.enterText(message.contactNameField,"pravin");
        //message.enterText(message.MessageField,"hi");
    }
}

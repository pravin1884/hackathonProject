package Pages;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage extends BaseClass {
       public WebDriver driver;

        public WebDriverWait wait;


        @FindBy(id="login2")
        WebElement menuLogin;


        @FindBy(id="loginusername")
        WebElement loginUserName;

        @FindBy(id="loginpassword")
        WebElement loginUserPassword;

        @FindBy(xpath="//button[text()='Log in']")
        WebElement btnLogin;

        //public Contact Page(driver)
        {
//copy your code here;

        }


        public void sendcontactMessage(String username, String password)
        {

            loginUserName.sendKeys(username);
            loginUserPassword.sendKeys(password);
            btnLogin.click();
        }

    }

package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
    public LoginPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }

    @FindBy(css = "[id='loginusername']")
    public WebElement username;

    @FindBy(css = "[id='loginpassword']")
    public WebElement password;
    @FindBy(xpath = "(//*[text()='Close'])[last()-1]")
    public WebElement closeBtn;
    @FindBy(xpath = "//*[@onclick='logIn()']")
    public WebElement signInBtn;

}

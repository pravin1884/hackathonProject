package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BaseClass {
    public SignUpPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }

    @FindBy(css = "[id='sign-username']")
    public WebElement username;

    @FindBy(css = "[id='sign-password']")
    public WebElement password;
    @FindBy(xpath = "(//*[text()='Close'])[last()-2]")
    public WebElement closeBtn;
    @FindBy(xpath = "//*[@onclick='register()']")
    public WebElement signUpBtn;

}

package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    public HomePage() {
        PageFactory.initElements(BaseClass.driver, this);
    }

    @FindBy(xpath = "//*[text()='Home ']")
    public WebElement homeBtn;
    @FindBy(xpath = "//a[text()='Contact']")
    public WebElement contact;

    @FindBy(xpath = "//a[text()='Sign up']")
    public WebElement signUpBtn;

    @FindBy(css = "[data-target='#logInModal']")
    public WebElement loginBtn;

    @FindBy(xpath = "//*[text()='Cart']")
    public WebElement cartBtn;

}

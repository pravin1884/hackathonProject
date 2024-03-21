package Pages;

import Utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//a[text()='Contact']")
    public WebElement contact;

    @FindBy(xpath="//a[text()='Sign up']")
    public WebElement signUpButton;

    public void clickOnContact() {
        contact.click();

    }

    public void clickOnSignUpButton() {
        signUpButton.click();

    }


}

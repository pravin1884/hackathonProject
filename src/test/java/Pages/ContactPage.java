package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends BaseClass {
    public ContactPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='recipient-email']")
    public WebElement contactEmailField;

    @FindBy(xpath = "//input[@id='recipient-name']")
    public WebElement contactNameField;

    @FindBy(xpath = "//*[@id='message-text']")
    public WebElement MessageField;




}

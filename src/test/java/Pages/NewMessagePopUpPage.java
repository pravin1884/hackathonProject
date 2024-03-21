package Pages;

import Utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewMessagePopUpPage extends BaseClass {
    public NewMessagePopUpPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//input[@id='recipient-email']")
    public WebElement contactEmailField;

    @FindBy(xpath="//input[@id='recipient-name']")
    public WebElement contactNameField;


    @FindBy(xpath="//input[@id='message-text']")
    public WebElement MessageField;

    public void enterText(WebElement elementName, String text) {
        elementName.sendKeys(text);

    }


}

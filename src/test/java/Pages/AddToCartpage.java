package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class AddToCartpage extends BaseClass {
    public AddToCartpage() {
        PageFactory.initElements(BaseClass.driver, this);
    }

    @FindBy(xpath = "//*[text()='Add to cart']")
    public WebElement addToCart;
    @FindBy(xpath = "//*[@onclick='logIn()']")
    public WebElement signInBtn;

    public void selectProduct(String productName) {
        List<WebElement> products = driver.findElements(By.xpath("//*[@class='card-title']"));
        for (WebElement ele : products) {
            if (ele.isDisplayed()) {
                ele.getText().contains(productName);
                ele.click();
                return;
            }
        }
    }

    public void verifyProductAddedToCartPage(String productName) {
        List<WebElement> productTitles = driver.findElements(By.xpath("//*[@class='success']//td"));
        for (WebElement ele : productTitles) {
            if (ele.isDisplayed()) {
                ele.getText().contains(productName);
                Assert.assertTrue(ele.getText().contains(productName), "Added Product is not present in Cart Page");
                return;
            }
        }
    }


}

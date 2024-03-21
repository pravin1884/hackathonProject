package Utilities;

import Pages.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class ReusableMethods extends BaseClass {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    public void waitForElement(WebElement ele) {
        wait.until(ExpectedConditions.visibilityOf(ele));
    }

    public void enterText(WebElement elementName, String text) {
        elementName.clear();
        elementName.sendKeys(text);
    }

    public static void loadProperties() {
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\data\\configData.properties");
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void takeScreenshot() throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\Screenshots\\" + "Test_" + System.currentTimeMillis() + ".png"));
    }
}

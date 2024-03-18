package Tests;

import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class SeleniumTest {
    public static WebDriver driver;
    @BeforeTest
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver delegate = new ChromeDriver(options);
        SelfHealingDriver driver = SelfHealingDriver.create((WebDriver) delegate);
        driver.get("https://www.google.com");
    }
}

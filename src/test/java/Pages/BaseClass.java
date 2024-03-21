package Pages;

import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.Properties;

import static Utilities.ReusableMethods.loadProperties;

public class BaseClass {
    public static Properties prop;
    public static SelfHealingDriver driver;

    public static WebDriver delegate;

    @BeforeTest
    public static void setUp() {
        loadProperties();
        String browserName = prop.getProperty("Browser");
        if (browserName.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            delegate = new ChromeDriver(options);
        } else if (browserName.equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            EdgeOptions options = new EdgeOptions();
            delegate = new EdgeDriver(options);
        }
        driver = SelfHealingDriver.create(delegate);
        driver.manage().deleteAllCookies();
        driver.get(prop.getProperty("URL"));
        driver.manage().window().maximize();
    }



    @AfterTest
    public static void tearDown() throws IOException {
        driver.quit();
    }
}

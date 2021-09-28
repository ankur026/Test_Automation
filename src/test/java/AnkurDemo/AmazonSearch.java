package AnkurDemo;


import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AmazonSearch {
    WebDriver driver;
    @BeforeMethod
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        options.addArguments("--disable-notifications");
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        String path= System.getProperty("user.dir") + System.getProperty("file.separator") + "downloadedFiles";
        path.replace("/", "\\");
        options.setExperimentalOption("prefs", prefs);
        driver.navigate().to("https://www.google.com");
    }
    @Test
    public void test() {
        System.out.println("in test");
    }
    @AfterMethod
    public void afterTest() {
        driver.quit();
  }
}
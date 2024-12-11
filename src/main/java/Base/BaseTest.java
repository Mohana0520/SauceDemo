package Base;

import Utils.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseTest
{
    public static WebDriver driver;


    @BeforeMethod
    @Parameters("browser")
    public void beforemethod(String browser) {
        setupDriver(browser);
        driver.manage().window().maximize();
        driver.get(Constants.url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }


    public void setupDriver(String browser){
        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
           else if (browser.equalsIgnoreCase("edge")){
               WebDriverManager.edgedriver().setup();
               driver = new EdgeDriver();
            }
    }
    }








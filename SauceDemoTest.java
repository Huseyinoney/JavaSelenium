
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class SauceDemoTest {

    protected WebDriver driver;
    LoginPage loginPage;
@BeforeClass
        public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\Selenium\\chromeDriver\\chromedriver.exe");
         this.driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        }
@AfterClass
        public void tearDown () {
        driver.quit();
        }





}

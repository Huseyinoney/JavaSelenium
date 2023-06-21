import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest extends SauceDemoTest{



 @Test(priority = 1)
    public void setUserName () {
    loginPage.setUserName("standard_user");
    }
@Test(priority = 2)
    public void setPassword () {
        loginPage.setPassword("secret_sauce");
    }
@Test(priority = 3)
    public void ClickLoginButton () throws InterruptedException {
        loginPage.ClickLoginButton();
    }
}


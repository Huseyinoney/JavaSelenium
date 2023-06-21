package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }
    public void setUserName (String userName) {

        WebElement usernameArea = driver.findElement(By.id("user-name"));
        usernameArea.click();
        usernameArea.sendKeys(userName);

    }

    public void setPassword (String password) {

        WebElement usernameArea = driver.findElement(By.id("password"));
        usernameArea.click();
        usernameArea.sendKeys(password);

    }

    public void ClickLoginButton () throws InterruptedException {

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        Thread.sleep(5000);
    }
}

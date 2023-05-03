package test.Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromeDriverPath");
        WebDriver driver = new ChromeDriver();

        //amazon ana sayfasına git.
        driver.navigate().to("https://amazon.com");

        //youtube ana sayfasına git
        driver.navigate().to("https://youtube.com");
        //amazon sayfasına geri dön
        driver.navigate().back();

        //yeniden youtube sayfasına git
        driver.navigate().forward();
        //sayfayı yenile
        driver.navigate().refresh();
        //sayfayı kapat
        driver.close();

    }
}

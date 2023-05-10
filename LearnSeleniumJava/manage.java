package test.Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromeDriverPath");
        WebDriver driver = new ChromeDriver();

        System.out.println("sayfanın konumu"+driver.manage().window().getPosition());
        System.out.println("sayfanın boyutları"+driver.manage().window().getSize());

        //sayfayı simge durumuna getir
        driver.manage().window().minimize();

        //simge durumunda 3 saniye bekle ve maximize yap
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //sayfanın konumunu ve boyutunu maximize olarak yazdır
        System.out.println("sayfanın konumu"+driver.manage().window().getPosition());
        System.out.println("sayfanın boyutları"+driver.manage().window().getSize());

        //sayfayı fullscreen yap
        driver.manage().window().fullscreen();
        System.out.println("sayfanın konumu"+driver.manage().window().getPosition());
        System.out.println("sayfanın boyutları"+driver.manage().window().getSize());
        Thread.sleep(3000);

        driver.close();
    }

}

package test.Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\Selenium\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon sayfasına git
        driver.get("https://amazon.com");

        //sayfanın başlığını yazdır
        System.out.println(driver.getTitle());

        //sayfa başlığının amazon içerdiğini test et
        String expectedValue = "Amazon";
        if(driver.getTitle().contains(expectedValue)) {
            System.out.println("Title testi başarılı");
        }
        else {
            System.out.println("Title testi başarısız");
        }
        //sayfa url yazdır
        System.out.println(driver.getCurrentUrl());
        //sayfa url inin Amazon içerdiğini test et
        String expectedUrl = "amazon";
        if(driver.getCurrentUrl().contains(expectedUrl)) {
            System.out.println("Url Testi başarılı");
        }
        else {
            System.out.println("Url testi başarısız");
        }
        //sayfanın handle değerini yazdır
        System.out.println(driver.getWindowHandle());

        //sayfa HTML kodlarında "shopping" kelimesinin geçtiğini test et
        String PageSource = driver.getPageSource();
        String expected = "shopping";
        if(PageSource.contains(expected)) {
            System.out.println("HTML testi başarılı");
        }
        else {
            System.out.println("HTML testi başarısız");
        }
        //sayfayı kapat
        Thread.sleep(3000);
        driver.close();



    }
}

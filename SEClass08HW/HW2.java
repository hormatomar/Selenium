package Selenium.SEClass08HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
    /*goto https://chercher.tech/practice/implicit-wait-example
    the checkbox take 10 seconds  to populate
    use implicit wait to check only the first checkbox that populates
    close the browser*/
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/implicit-wait-example");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        WebElement checkbox1=driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        checkbox1.click();
        Thread.sleep(5000);
        driver.quit();




    }
}

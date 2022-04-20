import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    private WebDriver webDriver;

    @Test
    public void searchSampleImages() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\himajam\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        driver.findElement(By.xpath("//input[@class='app-textbox']")).sendKeys("Moto G");
        driver.findElement(By.xpath("//input[@class='input-group-addon']")).sendKeys(Keys.ENTER);
        String attribute = webDriver.findElement(By.name("productSearch")).getAttribute("value");
        Assert.assertTrue(attribute.equals("Loaded!"), "Expected Sample images but found: " + attribute);
        webDriver.quit();
    }
    }


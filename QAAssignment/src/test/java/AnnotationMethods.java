import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class AnnotationMethods {

    public WebDriver webDriver;

    @BeforeTest
    public void launchDriver() {
        System.out.println("Inside Before Test");
        System.setProperty("webdrive.chrome.driver", "C:\\Users\\Downloads\\chromedriver_win32\\chromedriver");
        webDriver = new FirefoxDriver();
    }

    @AfterTest
    public void quitDriver() {
        webDriver.close();
    }

}


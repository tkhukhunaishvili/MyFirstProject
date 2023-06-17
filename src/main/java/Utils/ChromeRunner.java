package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class ChromeRunner {
    WebDriver driver = new ChromeDriver();

    // ანოტაციები
    @BeforeTest
    public void openChromeBrowser(){
        driver.manage().window().maximize();
        driver.get("https://onlineschool.emis.ge/auth");
    }
    @AfterTest
    public void closeChromeBrowser(){

        driver.close();

    }

}

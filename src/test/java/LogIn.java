import PageObject.LogInPage;
import StepObject.LogInSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static DataBox.LogInData.*;
import static com.codeborne.selenide.Selectors.byLinkText;


public class LogIn extends LogInPage {
    @Test

    public void logInWithIncorrectpersonalNumber() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://onlineschool.emis.ge/auth");

        LogInSteps step1 = new LogInSteps(driver);
        step1.personalNumberInput(incorrectPersonalNumber);
        step1.passwordInput(incorrectPassword);
        step1.logInButton();

        //TestNG Asserts
        SoftAssert softAssertion;

        softAssertion = new SoftAssert();

        String expectedResult = "900000";
        String actualResult =driver.findElement( passwordField).getText();

        softAssertion.assertEquals(actualResult,expectedResult);

        //Explicit Waits
       /* WebElement waitforLogInButton =new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(byLinkText("LogInButton")));
        waitforLogInButton.click(); */

        Thread.sleep(7000);

        driver.close();
    }

    @Test
    public void logInWithcorrectpersonalNumber() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://onlineschool.emis.ge/auth");

        LogInSteps step2 = new LogInSteps(driver);
        step2.personalNumberInput(correctPersonalNumber);
        step2.passwordInput(correctPassword);
        step2.logInButton();





        Thread.sleep(7000);

        driver.close();


    }
}

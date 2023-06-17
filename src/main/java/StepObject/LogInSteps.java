package StepObject;

import PageObject.LogInPage;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import javax.swing.*;

public class LogInSteps extends LogInPage {
    WebDriver driver;




    public LogInSteps(WebDriver driver5){
        driver = driver5;


    }

    public void personalNumberInput(String x){
        driver.findElement(personalNumberField).sendKeys(x);

    }
    public void passwordInput(String x){
        driver.findElement(passwordField).sendKeys(x);
    }
    public void logInButton(){
        driver.findElement(logInButton).click();
    }
}

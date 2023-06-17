package PageObject;

import org.openqa.selenium.By;

public class LogInPage {

    protected By

        personalNumberField = By.name("username"),
        passwordField= By.id("password"),
        logInButton = By.id("SUBMIT");
}

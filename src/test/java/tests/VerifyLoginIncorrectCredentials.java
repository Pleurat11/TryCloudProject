package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class VerifyLoginIncorrectCredentials extends TestBase {

    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();
    @Test
    public void invalidCredentialsTest(){
        driver.get(ConfigurationReader.getProperty("loginurl"));
        loginPage.usernameField.sendKeys(faker.name().username());
        loginPage.passwordField.sendKeys(faker.internet().password());
        loginPage.loginBttn.click();

        Assert.assertTrue(loginPage.invalidCredentialsError.isDisplayed());
    }
}

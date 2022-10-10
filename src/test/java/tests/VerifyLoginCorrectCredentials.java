package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.TestBase;

public class VerifyLoginCorrectCredentials extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void loginWithCorrectCredentials(){
        driver.get(ConfigurationReader.getProperty("loginurl"));
        loginPage.logIn();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Dashboard - Trycloud");
    }

}

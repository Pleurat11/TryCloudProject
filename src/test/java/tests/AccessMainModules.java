package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class AccessMainModules extends TestBase {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    @Test
    public void userShouldAccessMainModules(){
        driver.get(ConfigurationReader.getProperty("loginurl"));
        loginPage.logIn();

        dashboardPage.verifyModules();

    }
}

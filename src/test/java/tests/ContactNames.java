package tests;

import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class ContactNames extends TestBase {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void seeContactNames(){
        driver.get(ConfigurationReader.getProperty("loginurl"));
        loginPage.logIn();

    }

}

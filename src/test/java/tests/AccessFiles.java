package tests;

import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.FilesPage;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.TestBase;

public class AccessFiles extends TestBase {
    DashboardPage dashboardPage = new DashboardPage();
    FilesPage filesPage = new FilesPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyFilesTitle(){
        driver.get(ConfigurationReader.getProperty("loginurl"));
        loginPage.logIn();
        dashboardPage.filesModule.click();
        filesPage.verifyTitle();
        filesPage.selectAllFiles.click();
        filesPage.verifyFilesSelected();
    }


}

package tests;

import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.FilesPage;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class AddFavoriteFile extends TestBase {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    FilesPage filesPage = new FilesPage();

    @Test
    public void addFavoriteFile(){
        driver.get(ConfigurationReader.getProperty("loginurl"));
        loginPage.logIn();
        dashboardPage.filesModule.click();
        filesPage.actionsFile.click();
        filesPage.addToFavorite.click();
        filesPage.favoritesTab.click();
        filesPage.checkFavoriteAdded();
    }
}

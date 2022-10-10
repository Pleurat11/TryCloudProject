package tests;

import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.FilesPage;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class WriteCommentsFiles extends TestBase {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    FilesPage filesPage = new FilesPage();

    @Test
    public void userWritesCommentsTest(){
        driver.get(ConfigurationReader.getProperty("loginurl"));
        loginPage.logIn();
        dashboardPage.filesModule.click();
        filesPage.actionsFile.click();
        filesPage.detailsModule.click();
        filesPage.commentsModule.click();
        filesPage.sendMessageComment();
        filesPage.messageIsDisplayed();
    }

}

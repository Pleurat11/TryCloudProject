package tests;

import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.FilesPage;
import pages.LoginPage;
import pages.TalkPage;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class SendMessage extends TestBase {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    FilesPage filesPage = new FilesPage();
    TalkPage talkPage = new TalkPage();

    @Test
    public void accessTalkModule(){
        driver.get(ConfigurationReader.getProperty("loginurl"));
        loginPage.logIn();
        dashboardPage.talkModule.click();
        dashboardPage.verifyTalkTitle();
    }

    @Test
    public void sendMessageTest(){
        driver.get(ConfigurationReader.getProperty("loginurl"));
        loginPage.logIn();
        dashboardPage.talkModule.click();
        talkPage.searchUser();
        talkPage.sendMessageUser();
    }
}

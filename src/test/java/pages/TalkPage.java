package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class TalkPage {
    public TalkPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@class='app-navigation-search__input']")
    public WebElement searchUsers;

    @FindBy(id = "conversation_6c28b33h")
    public WebElement talkUpdates;

    @FindBy(xpath = "//div[@class='new-message-form__advancedinput']")
    public WebElement writeMessage;

    @FindBy(xpath = "//div[@class='message__author']/h6[contains(text(),'User103')]")
    public WebElement verifyMessageSent;

    public void searchUser(){
        searchUsers.click();
        searchUsers.sendKeys("Talk");
        talkUpdates.click();
    }
    public void sendMessageUser(){
        writeMessage.click();
        writeMessage.sendKeys("message101" + Keys.ENTER);
        System.out.println(verifyMessageSent.getText());
        Assert.assertTrue(verifyMessageSent.isDisplayed());
    }
}

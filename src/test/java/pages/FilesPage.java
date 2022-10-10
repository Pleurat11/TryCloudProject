package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utilities.Driver;

import java.util.List;

public class FilesPage {
    public FilesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement selectAllFiles;

    @FindBy(xpath = "//a[@class='name sort columntitle']/span[contains(text(),'folder')]")
    public WebElement selectFilesResult;

    @FindBy(xpath = "(//a[@class='action action-menu permanent'])[3]")
    public WebElement actionsFile;

    @FindBy(xpath = "//a[@data-action='Delete']")
    public WebElement deleteFile;

    @FindBy(xpath = "//a[@class='nav-icon-trashbin svg']")
    public WebElement deletedFilesModule;

    @FindBy(xpath = "//a[@class='name']//span[contains(text(),'some-file')]")
    public WebElement deletedFileCheck;

    @FindBy(xpath = "//a[@data-action='Favorite']")
    public WebElement addToFavorite;

    @FindBy(xpath = "//td[@class='filename']")
    public WebElement favoriteAddedCheck;

    @FindBy(xpath = "//li[@data-id='favorites']")
    public WebElement favoritesTab;

    @FindBy(xpath = "//h2[contains(text(),'No favorites yet')]")
    public WebElement noFavoritesYet;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addButton;

    @FindBy(xpath = "//label[@for='file_upload_start']")
    public WebElement uploadFile;

    @FindBy(xpath = "//a[@data-action='folder']")
    public WebElement newFolder;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement newFolderClick;

    @FindBy(xpath = "//span[contains(text(),'some-file')]")
    public WebElement someFile;

    @FindBy(xpath = "//a[@data-action='Details']")
    public WebElement detailsModule;

    @FindBy(id = "commentsTabView")
    public WebElement commentsModule;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement messageField;

    @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement sendMessage;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement messageCheck;

    @FindBy(xpath = "//button[@class='settings-button']")
    public WebElement settingsButton;

    @FindBy(xpath = "//label[@for]")
    public List<WebElement> myList;

    public void checkSettingsCheckboxes(){
        for (int i = 0; i <=2; i++) {
            myList.add(myList.get(i));
            for (int j = 0; j <3; j++) {
                myList.get(i).click();
            }
            }
        }


    public void messageIsDisplayed(){
        Assert.assertTrue(messageCheck.isDisplayed());
    }

    public void sendMessageComment(){
        messageField.clear();
        messageField.sendKeys("qwerty");
        sendMessage.click();
    }

    public void checkDeletedFile(){
        Assert.assertTrue(deletedFileCheck.isDisplayed());
    }

    public void checkFavoriteAdded(){
        Assert.assertTrue(favoriteAddedCheck.isDisplayed());
    }

    public void createFolder(){
        newFolder.click();
        newFolderClick.click();
    }

    public void uploadFile(){
        uploadFile.click();
        uploadFile.sendKeys(System.getProperty("C:/Users/inter/Downloads/some-file.txt") );
    }

    public void checkFavoriteDeleted(){
        Assert.assertFalse(noFavoritesYet.isDisplayed());
    }

    public void verifyTitle(){
        String expectedTitle = "Files - Trycloud";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public void verifyFilesSelected(){
        Assert.assertTrue(selectFilesResult.isDisplayed());
    }


}

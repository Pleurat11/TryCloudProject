package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@aria-label]")
    public List<WebElement> mainModules;

    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement filesModule;

    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public WebElement talkModule;

    public void verifyModules(){
        List<String> expList = new ArrayList<>(Arrays.asList("Dashboard", "Files",  "Photos", "Activity", "Talk", "Contacts", "Circles", "Calendar", "Deck"));

        List<String> actList = new ArrayList<>();
        for (int i = 1; i <=9; i++) {
            actList.add(Driver.getDriver().findElement(By.xpath("(//a[@aria-label])["+ i + "]")).getAttribute("aria-label"));
        }
        Assert.assertEquals(expList, actList);
    }

    public void verifyTalkTitle(){
        Assert.assertEquals(Driver.getDriver().getTitle(), "Talk - Trycloud");
    }

}

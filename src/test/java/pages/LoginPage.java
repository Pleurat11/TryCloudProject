package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "user")
    public WebElement usernameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "submit-form")
    public WebElement loginBttn;

    @FindBy(xpath = "//div//p[contains(text(),'Wrong username')]")
    public WebElement invalidCredentialsError;



    public void logIn(){
        usernameField.sendKeys(ConfigurationReader.getProperty("username"));
        passwordField.sendKeys(ConfigurationReader.getProperty("password"));
        loginBttn.click();
    }
}

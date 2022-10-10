package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
    public WebDriver driver = Driver.getDriver();

}

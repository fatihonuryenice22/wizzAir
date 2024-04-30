package StepDefinitions;

import Pages.WizzAirHomePage;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class MyStepdefsCase2 {
    WebDriver driver = DriverFactory.getDriver();
    WizzAirHomePage wizzAirHomePage=new WizzAirHomePage(driver);
}

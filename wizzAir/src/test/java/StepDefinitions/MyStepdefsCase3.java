package StepDefinitions;

import Pages.WizzAirHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class MyStepdefsCase3 {
    WebDriver driver = DriverFactory.getDriver();
    WizzAirHomePage wizzAirHomePage=new WizzAirHomePage(driver);
    @Given("Kullanıcı websiteyi açar")
    public void kullanıcıWebsiteyiAçar() {
        wizzAirHomePage.webSiteAcim();
    }

    @When("Login butonu tıklanır")
    public void loginButonuTıklanır() {
        wizzAirHomePage.loginButtonTıklama();
    }

    @Then("username password girilir")
    public void usernamePasswordGirilir() {
        wizzAirHomePage.loginOlma();
    }

    @And("ana sayfaya yönlendirilir")
    public void anaSayfayaYönlendirilir() {
    }

    @Given("Kullanıcı login olur")
    public void kullanıcıLoginOlur() {
        wizzAirHomePage.kullanıcıLoginolur();
    }

    @When("flights seçeneği seçilir")
    public void flightsSeçeneğiSeçilir() {
        wizzAirHomePage.flightsSecenegiSecme();
    }

    @And("Round trip seçeneği seçilir")
    public void roundTripSeçeneğiSeçilir() {
        wizzAirHomePage.roundTripSecme();
    }

    @And("Gidiş yeri dönüş yeri seçilir")
    public void gidişYeriDönüşYeriSeçilir() {
        wizzAirHomePage.gidisDonusYeriYazma();
    }

    @When("Search butonuna tıklanır")
    public void searchButonunaTıklanır() {
        wizzAirHomePage.searchButtonTiklama();
    }

    @Then("En ucuz bilet seçilir")
    public void enUcuzBiletSeçilir() {
        wizzAirHomePage.enucuzFiltre();
    }

    @Then("En pahalı bilet seçilir")
    public void enPahalıBiletSeçilir() {
        wizzAirHomePage.enPahaliBilet();
    }
    }


package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverFactory;
import util.ElementHelper;
public class WizzAirHomePage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    //static By acceptCookies= By.cssSelector("//button[@data-testid='uc-accept-all-button']");
    static By loginButton= By.xpath("//span[@class='account-title']");
    static By loginWithEmailOption= By.xpath("//span[normalize-space()='Continue with e-mail']");
    static By yourEmail= By.xpath("//input[@placeholder='Your e-mail']");
    static By yourPW= By.xpath("//input[@placeholder='Password']");
    static By loginButtonemail= By.xpath("//button[@type='submit']");
    static By flightsOption= By.xpath("//img[@alt='Flights']");
    static By roundtripOption= By.xpath("//label[@for='TripTypeRoundtrip']");
    static By Departure= By.xpath("//input[@id='departureRoundtrip0']");
    static By destination=By.xpath("//input[@id='arrivalRoundtrip0']");
    static By departureDate=By.xpath("//input[@id='departureDateRoundtrip0']");
    static By returnDate=By.xpath("//input[@id='departureDateRoundtrip1']");
    static By nextMonth=By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']");
    static By nextMont27=By.xpath("/html[1]/body[1]/div[11]/table[1]/tbody[1]/tr[5]/td[1]/a[1]");
    static By nextMonth30=By.xpath("/html[1]/body[1]/div[11]/table[1]/tbody[1]/tr[5]/td[5]");
    static By searchButton=By.xpath("//button[@class='btn transaction qsf-search']");
    static By cheapestOption=By.xpath("//span[normalize-space()='Cheapest']");
    static By fastestOption=By.xpath("//span[normalize-space()='Fastest']");
    By firstviewdealbutton=By.xpath("//span[@class='transaction-text'][normalize-space()='View deal'][1]");



    public WizzAirHomePage(WebDriver driver){
        this.driver = driver;
        this.wait= new WebDriverWait(driver,10);
        this.elementHelper= new ElementHelper(driver);
    }

    public void webSiteAcim() {
        System.out.println("Setup Otomatik Yapar");
    }

    public void loginButtonTıklama() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // elementHelper.click(acceptCookies);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(loginButton);
    }

    public void loginOlma() {
        elementHelper.click(loginWithEmailOption);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(yourEmail);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.findElement(yourEmail).sendKeys("yenicefatihonur@gmail.com");
        elementHelper.click(yourPW);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.findElement(yourPW).sendKeys("foy3131");
        elementHelper.click(loginButtonemail);



    }

    public void flightsSecenegiSecme() {
        elementHelper.click(flightsOption);
    }

    public void roundTripSecme() {
        elementHelper.click(roundtripOption);
    }

    public void gidisDonusYeriYazma() {
        elementHelper.findElement(Departure).sendKeys("Istanbul Airport (IST)");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.findElement(destination).sendKeys("Izmir Adnan Menderes (ADB)");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(departureDate);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(nextMonth);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(nextMont27);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(returnDate);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(nextMonth);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(nextMonth30);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void searchButtonTiklama() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(searchButton);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void enucuzFiltre() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(cheapestOption);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(firstviewdealbutton);
    }

    public void enPahaliBilet() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(fastestOption);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(firstviewdealbutton);
    }

    public void kullanıcıLoginolur() {
        //elementHelper.click(acceptCookies);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(loginButton);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(loginWithEmailOption);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(yourEmail);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.findElement(yourEmail).sendKeys("yenicefatihonur@gmail.com");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(yourPW);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.findElement(yourPW).sendKeys("foy3131");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(loginButtonemail);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

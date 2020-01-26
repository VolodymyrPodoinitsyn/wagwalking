package wagwalking;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;
    protected static Client client;
    protected static Client errorClient;
    protected static Client clientLogin;
    protected HomePage homePage;
    protected ApplyPage applyPage;
    protected LoginPage loginPage;
    protected WagTagPage wagTagPage;
    protected OrderPage orderPage;

    @BeforeClass

    public static void start(){

        System.setProperty("webdriver.chrome.driver", "/Users/vladimirpodoinitsyn/Desktop/chromedriver");

        driver = new ChromeDriver();

        driver.manage().window().fullscreen();

        driver.get("https://wagwalking.com/");

        String actualTitle = driver.getTitle();

        System.out.println(actualTitle);

        String expectedTitle = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners";

        Assert.assertEquals(expectedTitle, actualTitle);

        client = new Client("vladimir@gmail.com", "12345678A", "Vladimir", "Pupkin", "+1322223322");

        errorClient = new Client("12345678A", "3151020B", "Ihor", "Pirdudkin", "+131510200");

        clientLogin = new Client("vlad.podoinisin@gmail.com", "qwerty+2018","Vlad", "Podoinisin","+1322223322");



    }

//    @AfterClass
//
//    public static void finish(){
//
//        driver.quit();
//    }
}

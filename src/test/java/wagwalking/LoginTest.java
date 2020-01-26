package wagwalking;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class LoginTest extends BaseTest {

    private static Logger log = Logger.getLogger(LoginTest.class.getName());

    @Test
    public void testLogin(){

        log.info("Starting Home Page");
        homePage = new HomePage(driver);
        log.info("Click Login Button and loading Login Page");
        loginPage = homePage.clickLoginButton();
        log.info("input user email");
        loginPage.inputEmail(clientLogin.getEmail());
        log.info("get user email");
        String email = loginPage.getEmail();
        log.info("check expect email and actual email");
        Assert.assertEquals("vlad.podoinisin@gmail.com", email);
        log.info("input user password");
        loginPage.inputPassword(clientLogin.getPassword());
        log.info("get user password");
        String password = clientLogin.getPassword();
        log.info("check expect password and actual password");
        Assert.assertEquals("qwerty+2018", password);
        log.info("Click ButtonLogin ");
        loginPage.clickButtonLogin();
        log.info("check expect title and actual title");
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectTitle = "Wag! Dog Walking On-Demand";
        Assert.assertEquals(expectTitle, actualTitle);


    }
}

package wagwalking;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class HomeworkTest extends BaseTest {

    private static Logger log = Logger.getLogger(HomeworkTest.class.getName());// описываем каждый шаг


    @Test
    public void testHomework(){
        log.info("Starting test Homework..."); //описываем  шаг
        homePage =  new HomePage(driver);
        log.info("Home Page is opened"); //описываем  шаг
        applyPage = homePage.clickBookFirstWalkFreeButton();
        log.info("User clicked on the BookFirstWalkFreeButton");//описываем  шаг...и так далее


        applyPage.inputEmail("alex@gmail.com");
        String email = applyPage.getEmail();
        Assert.assertEquals("alex@gmail.com", email);

        applyPage.inputPassword("3151020AA2");
        applyPage.inputFirstName("Vladimir");
        String firstName = applyPage.getFirstName();
        Assert.assertEquals("Vladimir", firstName);

        applyPage.inputLastName("Pupkin");
        String lastName = applyPage.getLstName();
        Assert.assertEquals("Pupkin", lastName);

        applyPage.inputPhone("(132) 222-3322");
        String phone = applyPage.getPhone();
        Assert.assertEquals("(132) 222-3322", phone);


    }

}

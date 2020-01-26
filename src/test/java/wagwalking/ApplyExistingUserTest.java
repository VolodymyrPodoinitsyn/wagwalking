package wagwalking;

import org.junit.Assert;
import org.junit.Test;

public class ApplyExistingUserTest extends BaseTest {

    @Test
    public void testApplyExistingUser() throws InterruptedException {

       homePage =  new HomePage(driver);
       applyPage = homePage.clickBookFirstWalkFreeButton();
       applyPage.inputEmail("alex@gmail.com");
       applyPage.inputPassword("3151020AA2");
       applyPage.inputFirstName("Vladimir");
       applyPage.inputLastName("Pupkin");
       applyPage.inputPhone("+1322223322");
       applyPage.clickNextButton();

//     Thread.sleep(3000); Принудительная задержка в крайнем случае.

       String error = applyPage.getErrorRegisteredEmail();
        Assert.assertEquals("Email address already registered", error);

    }
}

package wagwalking;

import org.junit.Assert;
import org.junit.Test;

public class ApplyTest extends BaseTest {

    @Test
    public void testApply(){

        homePage = new HomePage(driver);

        applyPage = homePage.clickBookFirstWalkFreeButton();

        applyPage.inputEmail("vladimir@gmail.com");

        String email = applyPage.getEmail();

        Assert.assertEquals("vladimir@gmail.com", email);

        applyPage.inputPassword("3151020");

        applyPage.inputFirstName("Vladimir");

        applyPage.inputLastName("Pupkin");

        applyPage.inputPhone("+1322223322");
    }
}

package wagwalking;

import org.junit.Assert;
import org.junit.Test;

public class ErrorTest extends BaseTest {

    @Test
    public void testError() {

        HomePage homePage = new HomePage(driver);

        homePage.clickBookFirstWalkFreeButton();

        ApplyPage applyPage = new ApplyPage(driver);

        applyPage.clickEmail();
        applyPage.clickPassword();
        applyPage.clickFirstName();
        applyPage.clickLastName();
        applyPage.clickPhone();
        applyPage.clickEmail();

        String error1 = applyPage.errorEmail();
        Assert.assertEquals("required", error1);

        String error2 = applyPage.errorFirstName();
        Assert.assertEquals("required", error2);

        String error3 = applyPage.errorLastName();
        Assert.assertEquals("required", error3);

        String error4 = applyPage.errorPhone();
        Assert.assertEquals("required", error4);









    }


}

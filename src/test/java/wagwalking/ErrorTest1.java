package wagwalking;

import org.junit.Assert;
import org.junit.Test;

public class ErrorTest1 extends BaseTest {

    @Test
    public void test1Error() {

        HomePage homePage = new HomePage(driver);

        homePage.clickBookFirstWalkFreeButton();

        ApplyPage applyPage = new ApplyPage(driver);

        applyPage.inputEmail("322223");
        applyPage.clickLastName();

        String error = applyPage.errorFieldEmail();
        Assert.assertEquals("please provide a valid email", error);

        String error0 = applyPage.errorFieldPassword();
        Assert.assertEquals("(8 Characters,", error0);

        String error1 = applyPage.errorFieldPassword1();
        Assert.assertEquals("1 Letter,", error1);

        String error2 = applyPage.errorFieldPassword2();
        Assert.assertEquals("1 Number)", error2);







    }

}

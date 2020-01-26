package wagwalking;

import org.junit.Test;

public class WagTagTest extends BaseTest {
    @Test
    public void testWagTag() throws InterruptedException {
       homePage = new HomePage(driver);
       homePage.clickWagTagButton();
       wagTagPage = new WagTagPage(driver);
       wagTagPage.clickOrderNow();
       orderPage = new OrderPage(driver);
       Thread.sleep(3000);
       orderPage.inputFirstName("Vlad");
       orderPage.inputLastName("Pupkin");



    }
}

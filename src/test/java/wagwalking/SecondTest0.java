package wagwalking;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SecondTest0 extends BaseTest {


    @Test
    public void testSecond(){

        WebElement bookFirstWalkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.yeXEn"));

        bookFirstWalkFreeButton.click();

        List<WebElement> inputFields = driver.findElements(By.cssSelector("input"));

        inputFields.get(0).sendKeys("vladimir@gmail.com");

        inputFields.get(1).sendKeys("322223");

        inputFields.get(2).sendKeys("Vladimir");

        inputFields.get(3).sendKeys("Pupkin");

        inputFields.get(4).sendKeys("1322223322");

    }
}

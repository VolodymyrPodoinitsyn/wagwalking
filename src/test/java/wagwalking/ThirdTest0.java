package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ThirdTest0 extends BaseTest {

    @Test
    public void testThird (){


        WebElement bookFirstWalkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.yeXEn"));

        bookFirstWalkFreeButton.click();

        List<WebElement> inputField = driver.findElements(By.cssSelector("input"));

        inputField.get(0).click();
        inputField.get(1).click();
        inputField.get(2).click();
        inputField.get(3).click();
        inputField.get(4).click();
        inputField.get(0).click();

//        WebElement elementField = driver.findElement(By.cssSelector("input[name=\"email\"]"));
//
//        elementField.click();
//
//        WebElement passwordField = driver.findElement(By.cssSelector("input[name=\"password\"]"));
//
//        passwordField.click();
//
//        WebElement firstNameField = driver.findElement(By.cssSelector("input[name=\"firstName\"]"));
//
//        firstNameField.click();
//
//        WebElement lastNameField = driver.findElement(By.cssSelector("input[name=\"lastName\"]"));
//
//        lastNameField.click();
//
//        WebElement cellPhoneField = driver.findElement(By.cssSelector("input[name=\"phone\""));
//
//        cellPhoneField.click();
//
//        driver.findElement(By.cssSelector("input[name=\"email\"]"));
//
//        elementField.click();



        List<WebElement> divFields = driver.findElements(By.cssSelector(".sc-bdVaJa.sc-iwsKbI.kOShw"));

        String expError = "required";

        for(int i = 0; i < divFields.size(); i ++){
            Assert.assertEquals(expError, divFields.get(i).getText());
        }


//        String arrayError = divFields.get(0).getText();
//
//        String expError = "required";
//
//        Assert.assertEquals(expError, arrayError);
//
//        String arrayError = divFields.get(1).getText();
//
//        String expError = "required";
//
//        Assert.assertEquals(expError, arrayError);
//
//        String arrayError = divFields.get(2).getText();
//
//        String expError = "required";
//
//        Assert.assertEquals(expError, arrayError);
//
//        String arrayError = divFields.get(3).getText();
//
//        String expError = "required";
//
//        Assert.assertEquals(expError, arrayError);





    }


}

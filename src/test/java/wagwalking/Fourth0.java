package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Fourth0 extends BaseTest {

    @Test
    public void testFourth(){

        WebElement bookFirstWalkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.yeXEn"));

        bookFirstWalkFreeButton.click();

        List<WebElement> inputField = driver.findElements(By.cssSelector("input"));


        inputField.get(0).sendKeys(errorClient.getEmail());
        inputField.get(3).click();





//        WebElement elementField = driver.findElement(By.cssSelector("input[name=\"email\"]"));
//
//        elementField.sendKeys(errorClient.getEmail());
//
//        WebElement passwordField = driver.findElement(By.cssSelector("input[name=\"password\"]"));
//
//        passwordField.click();
//
//        WebElement lastNameField = driver.findElement(By.cssSelector("input[name=\"lastName\"]"));
//
//        lastNameField.click();



        List<WebElement> divField = driver.findElements(By.cssSelector(".sc-bdVaJa.sc-iwsKbI.kOShw"));

        String validEmail = divField.get(0).getText();

        String expValidEmail = "please provide a valid email";

        Assert.assertEquals(expValidEmail, validEmail);


        List<WebElement> fontField = driver.findElements(By.cssSelector(".sc-gzVnrw.fzplxK"));

        String charactersPassword = fontField.get(0).getText();

        String expCharactersPassword = "(8 Characters,";

        Assert.assertEquals(expCharactersPassword, charactersPassword);

        String charactersPassword1 = fontField.get(1).getText();

        String expCharactersPassword1 = "1 Letter,";

        Assert.assertEquals(expCharactersPassword1, charactersPassword1);

        String charactersPassword2 = fontField.get(2).getText();

        String expCharactersPassword2= "1 Number)";

        Assert.assertEquals(expCharactersPassword2, charactersPassword2);











    }

}

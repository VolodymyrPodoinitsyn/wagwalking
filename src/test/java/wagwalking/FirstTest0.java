package wagwalking;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FirstTest0 extends BaseTest {

    @Test
    public void testFirst (){

        WebElement bookFirstWalkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.yeXEn"));

        bookFirstWalkFreeButton.click();

        WebElement elementField = driver.findElement(By.cssSelector("input[name=\"email\"]"));

        elementField.sendKeys(client.getEmail());

        WebElement passwordField = driver.findElement(By.cssSelector("input[name=\"password\"]"));

        passwordField.sendKeys(client.getPassword());

        WebElement firstNameField = driver.findElement(By.cssSelector("input[name=\"firstName\"]"));

        firstNameField.sendKeys(client.getFirstName());

        WebElement lastNameField = driver.findElement(By.cssSelector("input[name=\"lastName\"]"));

        lastNameField.sendKeys(client.getLastName());

        WebElement cellPhoneField = driver.findElement(By.cssSelector("input[name=\"phone\""));

        cellPhoneField.sendKeys(client.getPhone());



    }
}

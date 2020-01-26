package wagwalking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class OrderPage extends BasePage {
    public OrderPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "input")
    private List<WebElement> shippingDetails;

    public void inputFirstName(String firstName){
        wait.until(ExpectedConditions.elementToBeClickable(shippingDetails.get(0)));
        shippingDetails.get(0).sendKeys(firstName);
    }
    public void inputLastName(String LastName){
        wait.until(ExpectedConditions.elementToBeClickable(shippingDetails.get(1)));
        shippingDetails.get(1).sendKeys(LastName);
    }

}



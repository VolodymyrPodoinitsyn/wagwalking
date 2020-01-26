package wagwalking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".form-control")
    private List<WebElement> inputFields;

    @FindBy(css = ".btn.btn-secondary.btn-block")
    private WebElement clickButtonLogin;

    public void inputEmail(String email){
        wait.until(ExpectedConditions.visibilityOfAllElements(inputFields));
        inputFields.get(0).sendKeys(email);
    }

    public String getEmail(){
        wait.until(ExpectedConditions.visibilityOf(inputFields.get(0)));
        String email = inputFields.get(0).getAttribute("value");
        return email;
    }

    public void inputPassword(String password){
        inputFields.get(1).sendKeys(password);
    }

    public String getPassword(){
        wait.until(ExpectedConditions.visibilityOf(inputFields.get(1)));
        String password = inputFields.get(1).getAttribute("value");
        return password;
    }

    public void clickButtonLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(clickButtonLogin));
        clickButtonLogin.click();
    }
}


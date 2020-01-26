package wagwalking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".sc-ifAKCX.yeXEn")
    private WebElement bookFirstWalkFreeButton;

    @FindBy(css = ".sc-ifAKCX.fHUled")
    private List<WebElement> loginButton;

    @FindBy(css = ".sc-ifAKCX.fHUled")
    private List<WebElement> wagTagButton;


    public ApplyPage clickBookFirstWalkFreeButton(){
        wait.until(ExpectedConditions.elementToBeClickable(bookFirstWalkFreeButton));
        bookFirstWalkFreeButton.click();
        return new ApplyPage(driver);
    }

    public LoginPage clickLoginButton(){
        wait.until(ExpectedConditions.visibilityOfAllElements(loginButton));
        loginButton.get(3).click();
        return new LoginPage(driver);
    }

    public  WagTagPage clickWagTagButton(){
        wait.until(ExpectedConditions.visibilityOfAllElements(wagTagButton));
        wagTagButton.get(1).click();
        return new WagTagPage(driver);
    }


}

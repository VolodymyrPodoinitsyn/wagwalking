package wagwalking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ApplyPage extends BasePage {

    public ApplyPage(WebDriver driver){

        super(driver);
    }
//    @FindBy(css = "input[name=\"email\"]")
//    private WebElement emailField;
//
//    @FindBy(css = "input[name=\"password\"]")
//    private WebElement passwordField;
    @FindBy(css = "input")
    private List<WebElement> inputFields;

    public void inputEmail(String email){
        wait.until(ExpectedConditions.visibilityOfAllElements(inputFields));
        inputFields.get(0).sendKeys(email);

//        emailField.sendKeys(email);
    }

    public String getEmail(){
        wait.until(ExpectedConditions.visibilityOf(inputFields.get(0)));
        String email = inputFields.get(0).getAttribute("value");
        return email;

    }

    public void inputPassword(String password){
        inputFields.get(1).sendKeys(password);
//        passwordField.sendKeys(password);
    }

    public void inputFirstName(String firstName){
        inputFields.get(2).sendKeys(firstName);
    }

    public String getFirstName(){
        wait.until(ExpectedConditions.visibilityOf(inputFields.get(2)));
        String firstName = inputFields.get(2).getAttribute("value");
        return firstName;

    }

    public void inputLastName(String lastName){
        inputFields.get(3).sendKeys(lastName);
    }

    public String getLstName(){
        wait.until(ExpectedConditions.visibilityOf(inputFields.get(3)));
        String lastName = inputFields.get(3).getAttribute("value");
        return lastName;
    }

    public void inputPhone(String phone){
        inputFields.get(4).sendKeys(phone);
    }

    public String getPhone(){
        wait.until(ExpectedConditions.visibilityOf(inputFields.get(4)));
        String phone = inputFields.get(4).getAttribute("value");
        return phone;

    }

    public void clickEmail(){
        inputFields.get(0).click();
    }

    public void clickPassword(){
        inputFields.get(1).click();
    }

    public void clickFirstName() {
        inputFields.get(2).click();
    }

    public void clickLastName() {
        inputFields.get(3).click();
    }

    public void clickPhone() {
        inputFields.get(4).click();
    }

    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private List<WebElement> errorFields;



    public String errorEmail(){
        wait.until(ExpectedConditions.visibilityOfAllElements(errorFields));
        String emailError = errorFields.get(0).getText();
        return emailError;
    }

    public String errorFirstName(){
        String errorFirstName = errorFields.get(1).getText();
        return errorFirstName;
    }

    public String errorLastName(){
        String errorLastName = errorFields.get(2).getText();
        return errorLastName;
    }

    public String errorPhone() {
        String errorPhone = errorFields.get(3).getText();
        return errorPhone;
    }

    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private List<WebElement> errorFieldEmail;

    public String errorFieldEmail(){
        String fieldEmailerror = errorFieldEmail.get(0).getText();
        return fieldEmailerror;
    }
    @FindBy(css = ".sc-gzVnrw.fzplxK")
    private List<WebElement> errorFieldPassword;

    public String errorFieldPassword(){
        wait.until(ExpectedConditions.visibilityOfAllElements(errorFieldPassword));
        String fieldPasswordError = errorFieldPassword.get(0).getText();
        return fieldPasswordError;

    }

    public String errorFieldPassword1(){
        String fieldPasswordError1 = errorFieldPassword.get(1).getText();
        return fieldPasswordError1;

    }

    public String errorFieldPassword2(){
        String fieldPasswordError2 = errorFieldPassword.get(2).getText();
        return fieldPasswordError2;

    }

    @FindBy(css = ".sc-gzVnrw.jvIbBW")
    private WebElement clickNextButton;
    public void clickNextButton(){
        clickNextButton.click();
    }

    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private WebElement errorRegisteredFields;


    public String getErrorRegisteredEmail(){
        wait.until(ExpectedConditions.visibilityOf(errorRegisteredFields));
        String errorRegisteredEmail = errorRegisteredFields.getText();
        return errorRegisteredEmail;
    }











}

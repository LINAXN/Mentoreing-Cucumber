package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {

    public RegistrationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    private By ssnField = By.id("ssn");
    private By firstnameField = By.id("first-name");
    private By lastnameField = By.id("last-name");
    private By addressField = By.id("address");
    private By emailField = By.id("email");
    private By phoneField = By.id("phone");
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By confirmPasswordField = By.id("confirm-password");
    private By submitButton = By.xpath("//button[@type='submit']");
    private By successMessage = By.id("successMessage");

    public void enterSSN(String ssn) {
          Driver.getDriver().findElement(ssnField).sendKeys(ssn);
    }
    public void enterFirstname(String firstName) {
          Driver.getDriver().findElement(firstnameField).sendKeys(firstName);
    }
    public void enterLastname(String lastName) {
          Driver.getDriver().findElement(lastnameField).sendKeys(lastName);
    }
    public void enterAddress(String address) {
          Driver.getDriver().findElement(addressField).sendKeys(address);
    }


    public void enterEmail(String email) {
          Driver.getDriver().findElement(emailField).sendKeys(email);
    }

    public void enterPhone(String phone) {
          Driver.getDriver().findElement
(phoneField).sendKeys(phone);
    }

    public void enterUsername(String username) {
          Driver.getDriver().findElement
(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
          Driver.getDriver().findElement
(passwordField).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
          Driver.getDriver().findElement
(confirmPasswordField).sendKeys(confirmPassword);
    }

    public void clickSubmit() {
          Driver.getDriver().findElement
(submitButton).click();
    }

    public String getSuccessMessage() {
        WebElement message =   Driver.getDriver().findElement
(successMessage);
        return message.getText();
    }
}



package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegistrationPage;
import utilities.Driver;

public class RegisrtaionsStepDefinitions {
RegistrationPage registrationPage;
    @Given("User navigate to {string}")
    public void user_navigate_to(String string) {
        Driver.getDriver().get("https://claruswaysda.github.io/form.html");
    }
    @When("User enters SSN {string}")
    public void user_enters_ssn(String ssn) {
        registrationPage = new RegistrationPage();
        registrationPage.enterSSN(ssn);
    }
    @When("user enters first name {string}")
    public void user_enters_first_name(String firstName) {
        registrationPage = new RegistrationPage();
        registrationPage.enterFirstname(firstName);
    }
    @When("user enters last name {string}")
    public void user_enters_last_name(String lastName) {
        registrationPage = new RegistrationPage();
        registrationPage.enterLastname(lastName);
    }
    @When("user enters address {string}")
    public void user_enters_address(String address) {
        registrationPage = new RegistrationPage();
        registrationPage.enterAddress(address);
    }


    @When("user enters email {string}")
    public void user_enters_email(String email) {
        registrationPage = new RegistrationPage();
        registrationPage.enterEmail(email);
    }

    @When("user enters phone {string}")
    public void user_enters_phone(String phone) {
        registrationPage = new RegistrationPage();
        registrationPage.enterPhone(phone);
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
        registrationPage.enterUsername(username);
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        registrationPage = new RegistrationPage();
        registrationPage.enterPassword(password);
    }

    @When("user enters confirm password {string}")
    public void user_enters_confirm_password(String confirmPassword) {
        registrationPage = new RegistrationPage();
        registrationPage.enterConfirmPassword(confirmPassword);
    }

    @When("User submit the form")
    public void user_submit_the_form() {
        registrationPage = new RegistrationPage();
        registrationPage.clickSubmit();
    }

    @Then("I should see a success message")
    public void i_should_see_a_success_message() {
        String message = registrationPage.getSuccessMessage();
        Assert.assertTrue("Expected success message not found!",
                message.toLowerCase().contains("success"));
    }
}


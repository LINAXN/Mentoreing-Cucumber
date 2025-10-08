package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.FormAddPage;
import pages.FormPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class UserManagementSteps {

    FormAddPage formPage;
    boolean foundResult;

    @Given("user opens the browser and navigates to {string}")
    public void user_opens_the_browser_and_navigates_to(String string) {
        Driver.getDriver().get("https://claruswaysda.github.io/addRecordWebTable.html");
    }

    @When("user enters {string} as firstname")
    public void user_enters_firstname(String firstname) {
        formPage = new FormAddPage();
        formPage.enterFirstname(firstname);
    }


    @When("user enters {string} as age")
    public void user_enters_age(String age) {
        formPage = new FormAddPage();
        formPage.enterAge(age);
    }

    @When("user selects {string} as country")
    public void user_selects_country(String country) {
        formPage = new FormAddPage();
        formPage.selectCountry(country);
    }

    @Then("user clicks submit button")
    public void user_clicks_submit_button() {
        formPage = new FormAddPage();
        formPage.clickAddRecordButton();
    }

    @Then("user verifies new user is added")
    public void user_verifies_new_user_is_added() {
//        Assert.assertTrue(table.getText().contains("Lina"));
    }

    @When("user edits the first record")
    public void user_edits_the_first_record() {
        Driver.getDriver().findElement(By.xpath("//button[contains(.,'Edit')]")).click();
    }

    @When("user changes firstname to {string}")
    public void user_changes_firstname_to(String name) {
        formPage = new FormAddPage();
        formPage.enterFirstname("LinaUpdated");
        formPage.clickAddRecordButton();
    }

    @Then("user verifies the record is updated")
    public void user_verifies_the_record_is_updated() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("LinaUpdated"));
    }

    @When("user deletes the first record")
    public void user_deletes_the_first_record() {
        Driver.getDriver().findElement(By.xpath("//button[contains(.,'Delete')]")).click();
    }

    @Then("user verifies the record is deleted")
    public void user_verifies_the_record_is_deleted() {
        Assert.assertFalse(Driver.getDriver().getPageSource().contains("LinaUpdated"));
    }

    @When("user searches for {string}")
    public void user_searches_for(String name) {
        List<WebElement> rows = Driver.getDriver().findElements(By.xpath("/html/body/table/tbody/tr"));
        foundResult = rows.stream().anyMatch(row -> row.getText().contains(name));
    }

    @Then("user verifies search result is displayed")
    public void user_verifies_search_result_is_displayed() {
        Assert.assertTrue("Search result not found in table!", foundResult);
    }
}

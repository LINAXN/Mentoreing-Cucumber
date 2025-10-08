package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AddRecordPage;
import utilities.Driver;

import java.util.List;

public class AddRecordStepDefinitions {

    AddRecordPage addRecordPage;
    List<List<String>> addedData;
//    @Given("user visits {string}")
//    public void user_visits(String url) {
//        Driver.getDriver().get(url);
//    }
    @When("enter data")
    public void enter_data(DataTable dataTable) {
        addRecordPage = new AddRecordPage();
        // We'll store the names added earlier so we can assert them later


     addedData = dataTable.asLists();
        for (List<String> eachList : addedData) {
            System.out.println(eachList);
            addRecordPage.enterName(eachList.getFirst());
            addRecordPage.enterAge(eachList.get(1));
            addRecordPage.selectCountry(eachList.getLast());
            addRecordPage.clickAddRecord();
        }
    }
        @Then("assert added records")
        public void assert_added_records() {
            for (List<String> record : addedData) {
                String name = record.get(0);
                boolean isAdded = addRecordPage.getRecordAdded(name);
                Assert.assertTrue("❌ Record not found in table for: " + name, isAdded);
                System.out.println("✅ Record found in table for: " + name);
            }
        }

        @Then("close the application browser")
        public void close_the_application_browser() {
            Driver.closeDriver();
        }

}


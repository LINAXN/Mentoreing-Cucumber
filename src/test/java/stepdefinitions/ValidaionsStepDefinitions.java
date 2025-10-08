package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import java.util.List;

public class ValidaionsStepDefinitions {

    @Given("user enters valid inputs")
    public void user_enters_valid_inputs(DataTable dataTable) {
        List<String> validInputs = dataTable.asList(String.class);
        for (String input : validInputs) {
            System.out.println("Testing valid input: " + input);
            boolean isValid = input.matches("\\d{7}");
            Assert.assertTrue("Expected valid input, but found invalid: " + input, isValid);
        }
        }


    @Given("user enters invalid inputs")
    public void user_enters_invalid_inputs(DataTable dataTable) {
        List<String> invalidInputs = dataTable.asList(String.class);

        for (String input : invalidInputs) {
            System.out.println("Testing invalid input: " + input);
            boolean isValid = input.matches("\\d{7}");
            Assert.assertFalse("Expected invalid input, but found valid: " + input, isValid);
        }
    }
}

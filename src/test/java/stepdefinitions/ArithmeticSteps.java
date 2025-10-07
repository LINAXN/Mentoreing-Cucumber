package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class ArithmeticSteps {

    int num1, num2, result;

    @Given("user enters number {int}")
    public void user_enters_number(Integer int1) {
        num1 = int1;
    }

    @And("user enters another number {int}")
    public void user_enters_another_number(Integer int2) {
        num2 = int2;
    }

    @When("user adds the numbers")
    public void user_adds_the_numbers() {
        result = num1 + num2;
    }

    @Then("the result should be {int}")
    public void the_result_should_be(Integer expected) {
        Assert.assertEquals(expected.intValue(), result);
    }
}
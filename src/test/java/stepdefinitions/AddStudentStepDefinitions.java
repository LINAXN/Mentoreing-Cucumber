package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddStudentPage;

public class AddStudentStepDefinitions {
    AddStudentPage studentPage;


    @When("user enters full name {string}")
    public void user_enters_full_name(String name) {
        studentPage = new AddStudentPage();
        studentPage.enterFullName(name);


    }

    @When("user enters student id {string}")
    public void user_enters_student_id(String id) {
        studentPage = new AddStudentPage();
        studentPage.enterStudentId(id);

    }

    @When("user enters email {string}")
    public void user_enters_email(String email) {
        studentPage = new AddStudentPage();
        studentPage.enterEmail(email);
    }

    @When("user enters course {string}")
    public void user_enters_course(String course) {
        studentPage = new AddStudentPage();
        studentPage.enterCourse(course);
    }

    @When("user selects grade {string}")
    public void user_selects_grade(String grade) {
        studentPage = new AddStudentPage();
        studentPage.selectGrade(grade);
    }

    @When("user click on add student button")
    public void user_click_on_add_student_button() {
        studentPage = new AddStudentPage();
        studentPage.clickAddStudentButton();
    }

    @Then("assert that student is added")
    public void assert_that_student_is_added() {
        studentPage = new AddStudentPage();
        studentPage.assertStudentAdded();
    }

    @Then("assert that error message is displayed as {string}")
    public void assertThatErrorMessageIsDisplayedAs(String message) {

    }
}

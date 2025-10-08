package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class FormAddPage {

    public FormAddPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "nameInput")
    private WebElement firstname;

    @FindBy(id = "ageInput")
    private WebElement age;

    @FindBy(id = "countrySelect")
    private WebElement country;

    @FindBy(xpath = "//button[.='Add Record']")
    private WebElement addRecordButton;

    public void enterFirstname(String firstname) {
        this.firstname.sendKeys(firstname);
    }


    public void enterAge(String age) {
        this.age.sendKeys(age);
    }


    public void selectCountry(String countrySelect){
        new Select(this.country).selectByVisibleText(countrySelect);
    }

public void  clickAddRecordButton(){this.addRecordButton.click();}

}

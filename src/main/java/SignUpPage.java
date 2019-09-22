
import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.lang.String.format;
import static org.openqa.selenium.By.xpath;


/**
 * Created by Sergey
 */
public class SignUpPage {


    private By emailField = By.cssSelector("input#register-email");
    private By confirmField = By.cssSelector("input#register-confirm-email");
    private By passwordField = By.cssSelector("input#register-password");
    private By nameField = By.cssSelector("input#register-displayname");
    private By monthDropDown = By.cssSelector("select#register-dob-month");
    private String monthDropDownOption = "//select[@id='register-dob-month']/option[text()='%s']";
    private By dayField = By.cssSelector("input#register-dob-day");
    private By yearField = By.cssSelector("input#register-dob-year");
   private String sexRadioButton = "//li[@id='li-gender']/label[normalize-space()='%s']/input";
   private By sexradioB=By.xpath("//li[@id='li-gender']");
  //  private By sexRadioButton = By.cssSelector("li#li-gender");

    private By shareCheckBox = By.cssSelector("input#register-thirdparty");
    private By agreeCheckBox = By.cssSelector("input#register-terms");
    private By registerButton = By.cssSelector("a#register-button-email-submit");

    private By errorLabel = xpath("//label[@class='has-error' and string-length(text())>0]");

    private String errorText = "//label[@class=\"has-error\" and text()=\"%s\"]";

    public SignUpPage open() {

        Selenide.open("/");
        return this;
    }


    public SignUpPage typeEmail(String email) {
        $(emailField).setValue(email);
      //  $(emailField).findAll(email);
        return this;
    }

    public SignUpPage typeConfirmEmail(String email) {
        $(confirmField).setValue(email);
        return this;
    }

    public SignUpPage typePassword(String name) {
        $(passwordField).setValue(name);
        return this;
    }

    public SignUpPage typeName(String name) {
        $(nameField).setValue(name);
        return this;
    }

    public SignUpPage setMonth(String month) {
        $(monthDropDown).selectOption(month);


//        new WebDriverWait(driver, 5).until(visibilityOfElementLocated(xpath(format(monthDropDownOption, month)))).click();
        return this;
    }

    public SignUpPage typeDay(String day) {
        $(dayField).setValue(day);
        return this;
    }

    public SignUpPage typeYear(String year) {
        $(yearField).setValue(year);
        return this;
    }

    public SignUpPage setSex(String sex) {
$(sexradioB).find(Selectors.withText(sex)).click();
      //  $(sexRadioButton).selectRadio(value);


     //  $(xpath(format(sexRadioButton, value))).click();
        return this;
    }


    public SignUpPage setShare(boolean value) {
        $(shareCheckBox).setSelected(value);

//        WebElement checkbox = $(shareCheckBox);
//        if (!checkbox.isSelected() == value) {
//            checkbox.click();
//        }
        return this;
    }

    public SignUpPage setAgree(boolean value) {
        WebElement checkbox = $(agreeCheckBox);
        if (!checkbox.isSelected() == value) {
            checkbox.click();
        }
        return this;
    }


    public void clickSignUpButton() {

    //    $(registerButton).waitWhile(Condition.visible,5000);
        $(registerButton).click();



    }

    public ElementsCollection getErrors() {

        return $$(errorLabel);
    }

    public SelenideElement getErrorByNamber(int number) {

        return getErrors().get(number - 1);
    }

    public SelenideElement getError(String message) {


        return $(xpath(format(errorText, message)));
    }

}

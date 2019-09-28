package steps;

import com.codeborne.selenide.Condition;
import net.thucydides.core.annotations.Step;
import pages.SignUpPage;

/**
 * Created by Sergey
 */
public class SignUpSteps {

    SignUpPage page;

    @Step
    public void open_signup_page(){
        page.open();
    }

    @Step("User typed email [0]")
    public void type_email(String mail){

        page.typeEmail(mail);
    }

    @Step("User typed confirmation email [0]")
    public void type_confirmation_email(String mail){
        page.typeConfirmEmail(mail);
    }

    @Step("User typed password [0]")
    public void type_password(String password){
        page.typePassword(password);
    }

    @Step("User typed name [0]")
    public void type_name(String name){
        page.typeName(name);
    }
    @Step("User set month [0]")
    public void set_month(String month){
        page.setMonth(month);
    }

    @Step("User set day [0]")
    public void set_day(String day){
        page.typeDay(day);
    }
    @Step("User set year [0]")
    public void set_year(String year){
        page.typeYear(year);
    }

    @Step("User selected sex [0]")
    public void select_sex(String sex){
        page.setSex(sex);
    }

    @Step("User set share [0]")
    public void set_share(boolean value){
        page.setShare(value);
    }

    @Step("User set agree [0]")
    public void set_agree(boolean value){
        page.setAgree(value);
    }
    @Step("User clicked on Sign up [0]")
    public void clickSignUp(){
        page.clickSignUpButton();
    }

    @Step("User got errors [0]")
    public void get_errors(){
        page.getErrors();
    }

    @Step("User got visible error [0]")
    public void get_visible_error(String massage){
        page.getError(massage).shouldBe(Condition.visible);
    }

    @Step("User got visible error [0]")
    public void get_not_visible_error(String massage){
        page.getError(massage).shouldNotBe(Condition.visible);
    }

    @Step("User got error by number [0]")
    public void get_error_by_number(int number){
        page.getErrorByNamber(number);
    }


}

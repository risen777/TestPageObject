package steps;

import com.codeborne.selenide.Condition;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;
import pages.SignUpPage;

/**
 * Created by Sergey
 */
public class SignUpSteps {


    SignUpPage page = new SignUpPage();

    @Step
    @Screenshots
    public void open_signup_page(){
        page.open();
    }

    @Step
    public void type_email(String mail){

        page.typeEmail(mail);
    }

    @Step
    public void type_confirmation_email(String mail){
        page.typeConfirmEmail(mail);
    }

    @Step
    public void type_password(String password){
        page.typePassword(password);
    }

    @Step
    public void type_name(String name){
        page.typeName(name);
    }
    @Step
    public void set_month(String month){
        page.setMonth(month);
    }

    @Step
    @Screenshots
    public void set_day(String day){
        page.typeDay(day);
    }
    @Step
    public void set_year(String year){
        page.typeYear(year);
    }

    @Step
    public void select_sex(String sex){
        page.setSex(sex);
    }

    @Step
    public void set_share(boolean value){
        page.setShare(value);
    }

    @Step
    public void set_agree(boolean value){
        page.setAgree(value);
    }
    @Step
    public void clickSignUp(){
        page.clickSignUpButton();
    }

    @Step
    public void get_errors(){
        page.getErrors();
    }

    @Step
    public void get_visible_error(String massage){
        page.getError(massage).shouldBe(Condition.visible);
    }

    @Step
    public void get_not_visible_error(String massage){
        page.getError(massage).shouldNotBe(Condition.visible);
    }

    @Step
    public void get_error_by_number(int number){
        page.getErrorByNamber(number);
    }


}

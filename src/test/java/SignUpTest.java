import com.codeborne.selenide.Condition;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.SignUpPage;
import steps.SignUpSteps;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Sergey
 */

@RunWith(SerenityRunner.class)
public class SignUpTest extends BaseTest {

    @Steps
    SignUpSteps steps;

//    @Managed
//    WebDriver driver;


    @Test
    @Title("When the user typed invalid year")
    public void typeInvalidYear() {
       steps.open_signup_page();
        steps.set_month("December");
        steps.set_day("20");
        steps.set_year("85");
        steps.set_share(true);
        steps.get_visible_error("Please enter a valid year.");
        steps.get_not_visible_error("When were you born?");

//        page = new SignUpPage();
//
//        page.open()
//                .setMonth("December").
//                typeDay("20").
//                typeYear("85").
//                setShare(true);
//        page.getError("Please enter a valid year.").shouldBe(Condition.visible);
//        page.getError("When were you born?").shouldNotBe(Condition.visible);
    }

//    @Test
//    public void typeInvalidEmail() {
//
//        page = new SignUpPage();
//        page.open()
//                .typeName("sggdv@gmail.com")
//                .setMonth("December")
//                .typeConfirmEmail("wrong@mail.test")
//                .typeName("TestName")
//                .clickSignUpButton();
//        //  Assert.assertTrue(page.isErrorVisible("Email address doesn't match."));
//        page.getError("Email address doesn't match.").shouldBe(Condition.visible);
//    }
//
//    @Test
//    public void signUpWithEmptyPassword() {
//        page = new SignUpPage();
//        page.open()
//                .typeEmail("test@mail.ru")
//                .typeConfirmEmail("test@mail.ru")
//                .typeName("Vasia")
//                .clickSignUpButton();
//        //    Assert.assertTrue(page.isErrorVisible("Enter a password to continue."));
//        page.getError("Enter a password to continue.").shouldBe(Condition.visible);
//    }
//
//    @Test
//    public void typeInvalidValues() throws InterruptedException {
//        page = new SignUpPage();
//        page.open()
//                .typeEmail("ksjkdj@com")
//                .typeConfirmEmail("test@test.ru")
//                .typeName("Vasia")
//                .setSex("Male")
//                .setShare(false)
//                .setAgree(true)
//                .clickSignUpButton();
//        page.getErrors().shouldHaveSize(7);
//        page.getErrorByNamber(4).shouldHave(Condition.text("Please enter a valid day of the month."));

//page.getErrorByNamber(4).shouldHave(Condition.text("Please enter a valid day of the month."));

//        Assert.assertEquals(7, page.getErrors().size());
//
//
//        Assert.assertEquals("Please enter a valid day of the month.", page.getErrorByNamber(4));

    }




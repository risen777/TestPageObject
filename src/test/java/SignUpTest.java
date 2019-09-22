import com.codeborne.selenide.Condition;
import org.junit.*;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Sergey
 */
public class SignUpTest extends  BaseTest{

    private SignUpPage page;

//    @BeforeClass
//    public static void setUp() {
//        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
//        baseUrl = "https://www.spotify.com/ca-en/signup";
//       browser = "chrome";
//
//    }

    @Test
    public void typeInvalidYear() {


        page = new SignUpPage();

        page.open()
                .setMonth("December").
                typeDay("20").
                typeYear("85").
                setShare(true);
        page.getError("Please enter a valid year.").shouldBe(Condition.visible);
        page.getError("When were you born?").shouldNotBe(Condition.visible);
    }

    @Test
    public void typeInvalidEmail() {

        page = new SignUpPage();
        page.open()
                .typeName("sggdv@gmail.com")
                .setMonth("December")
                .typeConfirmEmail("wrong@mail.test")
                .typeName("TestName")
                .clickSignUpButton();
        //  Assert.assertTrue(page.isErrorVisible("Email address doesn't match."));
        page.getError("Email address doesn't match.").shouldBe(Condition.visible);
    }

    @Test
    public void signUpWithEmptyPassword() {
        page = new SignUpPage();
        page.open()
                .typeEmail("test@mail.ru")
                .typeConfirmEmail("test@mail.ru")
                .typeName("Vasia")
                .clickSignUpButton();
        //    Assert.assertTrue(page.isErrorVisible("Enter a password to continue."));
        page.getError("Enter a password to continue.").shouldBe(Condition.visible);
    }

    @Test
    public void typeInvalidValues() throws InterruptedException {
        page = new SignUpPage();
        page.open()
                .typeEmail("ksjkdj@com")
                .typeConfirmEmail("test@test.ru")
                .typeName("Vasia")
                .setSex("Male")
                .setShare(false)
                .setAgree(true)
                .clickSignUpButton();
        page.getErrors().shouldHaveSize(7);
        page.getErrorByNamber(4).shouldHave(Condition.text("Please enter a valid day of the month."));

//page.getErrorByNamber(4).shouldHave(Condition.text("Please enter a valid day of the month."));

//        Assert.assertEquals(7, page.getErrors().size());
//
//
//        Assert.assertEquals("Please enter a valid day of the month.", page.getErrorByNamber(4));

    }


}

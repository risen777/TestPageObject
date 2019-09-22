import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

/**
 * Created by Sergey
 */
public class BaseTest {

    {
      //  Configuration.startMaximized=true;
        Configuration.baseUrl="https://www.spotify.com/ca-en/signup";

    }

}

package tests;

import elements.StartPage;
import envoirment.Base;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class Login extends Base {

    StartPage startPage = new StartPage();

    @Test
    public void openPage() {
        open("https://mail.ru/");
        startPage.emailButton.click();
    }
}

package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class StartPage {
    public final SelenideElement emailButton = $x("//*[text()='Почта']");
}

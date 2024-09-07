package envoirment;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class Base {

    static WebDriver driver;

    @BeforeAll
    static void setUp() {
        WebDriverManager.firefoxdriver().setup(); // Настройка WebDriverManager для автоматической установки драйвера Chrome

        // Настройки Selenide
        Configuration.browser = "firefox";    // Использовать браузер firefox
        Configuration.timeout = 10000;       // Таймаут ожидания элементов в миллисекундах
        Configuration.headless = false; // Для запуска в headless-режиме:
    }

    @AfterAll
    static void tearDown() {
        if (driver != null)
            driver.quit();  // Завершение работы драйвера после тестов
    }
}

package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;


class LocalizationServiceImplTest {
    LocalizationService localizationService;

    @BeforeEach
    void beforeEach() {
        localizationService = new LocalizationServiceImpl();
    }

    @Test
    void localeRU() {
        Assertions.assertEquals("Добро пожаловать",localizationService.locale(Country.RUSSIA));
    }
    @Test
    void localeUS() {
        Assertions.assertEquals("Welcome",localizationService.locale(Country.USA));
    }
    @Test
    void localeBR() {
        Assertions.assertEquals("Welcome",localizationService.locale(Country.BRAZIL));
    }
    @Test
    void localeDE() {
        Assertions.assertEquals("Welcome",localizationService.locale(Country.GERMANY));
    }
}
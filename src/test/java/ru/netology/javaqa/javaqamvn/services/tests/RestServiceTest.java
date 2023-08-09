package ru.netology.javaqa.javaqamvn.services.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.javaqa.javaqamvn.services.restService;

public class RestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/java/resources/exps.csv")
    public void vacationPerYearTest(int income, int expenses, int threshold) {
        restService service = new restService();
        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
}

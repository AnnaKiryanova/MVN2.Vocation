package ru.netology.MVN2.vacation.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculateTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/resources/vacation.csv")
    void vacationCalculation(int expected, int income, int expenses, int threshold) {
        Calculate service = new Calculate();
        int actual = service.calculateVac(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
}

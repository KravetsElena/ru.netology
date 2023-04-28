package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CountServiceTest {
    @ParameterizedTest
//    @CsvSource({
//            "3,10000,3000,20000",
//            "2,100000,60000,150000"
//    })
    @CsvFileSource(files = "src/test/resources/count.csv")
    public void conditionCalcCount(int expected, int income, int expenses, int threshold) {
        CountService service = new CountService();
        //int expected = 3;
        int actual = service.calcCount(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
//
//    @Test
//    public void conditionChangeCalcCount() {
//        CountService service = new CountService();
//        int expected = 2;
//        int actual = service.calcCount(100_000, 60_000, 150_000);
//
//        Assertions.assertEquals(expected, actual);
//    }
}
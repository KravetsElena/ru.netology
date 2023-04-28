package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountServiceTest {
    @Test
    public void conditionCalcCount() {
        CountService service = new CountService();
        int expected = 3;
        int actual = service.calcCount(10_000, 3000, 20_000);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void conditionChangeCalcCount() {
        CountService service = new CountService();
        int expected = 2;
        int actual = service.calcCount(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}
package ru.netology.HomeWorkFreelance.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AccountMoneyServiceTest {

    @Test
    public void homeWorkTaskOne() {
        AccountMoneyService service = new AccountMoneyService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void homeWorkTaskTwo() {
        AccountMoneyService service = new AccountMoneyService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);

    }
}
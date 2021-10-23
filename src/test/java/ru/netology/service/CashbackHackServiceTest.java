package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateAmountToReceiveCashback() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 950;
        int expected = cashbackHackService.remain(amount);
        int actual = 50;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldCalculateAmountToReceiveCashbackIf1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = cashbackHackService.remain(amount);
        int actual = 0;
        assertEquals(actual, expected);

    }
}

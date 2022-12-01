package ru.netology.service;

import org.testng.Assert;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();
    @org.testng.annotations.Test
    public void shouldBelowLimit() {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldLimit() {
        int amount = 1_000;

        int actual = service.remain(amount);
        int expected = 0;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldAboveLimit() {
        int amount = 1_850;

        int actual = service.remain(amount);
        int expected = 150;

        org.testng.Assert.assertEquals(actual, expected);
    }
}
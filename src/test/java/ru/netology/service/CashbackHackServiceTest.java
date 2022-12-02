package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();
    @Test
    public void shouldBelowLimit() {
        int amount = 750;

        int actual = service.remain(amount);
        int expected = 250;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldLimit() {
        int amount = 1_000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveLimit() {
        int amount = 1_350;

        int actual = service.remain(amount);
        int expected = 650;
        Assert.assertEquals(expected, actual);
    }
}
package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();
    @org.junit.Test
    public void shouldBelowLimit() {
        int amount = 750;

        int actual = service.remain(amount);
        int expected = 250;

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldLimit() {
        int amount = 1_000;

        int actual = service.remain(amount);
        int expected = 0;

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldAboveLimit() {
        int amount = 1_350;

        int actual = service.remain(amount);
        int expected = 650;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testRemainBoundaryValuesThreeWithJupiter() {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        org.junit.jupiter.api.Assertions.assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    public void testRemainBoundaryValuesTwoWithJupiter() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        org.junit.jupiter.api.Assertions.assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    public void testRemainBoundaryValuesSixWithJupiter() {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1001;


        org.junit.jupiter.api.Assertions.assertEquals(expected,actual);
    }
}
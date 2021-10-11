package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void NeedMoreBuy100() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

        System.out.println("For get bonuses you need buy for " + expected + " rub");

    }

    @Test
    public void NeedMoreBuy10() {
        int amount = 990;
        int expected = 10;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

        System.out.println("For get bonuses you need buy for " + expected + " rub");
    }

//    @Test
//    public void NoNeedMoreBuy1000() {
//        int amount = 1000;
//        int expected = 0;
//        int actual = service.remain(amount);
//
//        assertEquals(expected, actual);
//
//        System.out.println("For get bonuses you need buy for " + expected + " rub");
//    }
//
//    @Test
//    public void NoNeedMoreBuy2000() {
//        int amount = 2000;
//        int expected = 0;
//        int actual = service.remain(amount);
//
//        assertEquals(expected, actual);
//
//        System.out.println("For get bonuses you need buy for " + expected + " rub");
//    }
}
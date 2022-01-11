package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void ShouldRemain() {

        int actual= service.remain(201);
        int expected = 799;
        assertEquals(actual, expected);
    }

    @Test
    public void ShouldRemainOverBoundary() {

        int actual= service.remain(2011);
        int expected = 989;
        assertEquals(actual, expected);
    }

    @Test
    public void ShouldRemainIsBoundary() {

        int actual= service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}
package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


class CashBackHackServiceTest {

    @Test

    public static void shouldC(){
        CashBackHackService service = new CashBackHackService();

        int amount = 100;

        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual,expected);




    }

}
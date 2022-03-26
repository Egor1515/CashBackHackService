package ru.netology.service;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


class CashBackHackServiceTest {
    @Test
    public void shouldCalculate() {
        int amount = 1500;
        CashBackHackService service = new CashBackHackService();

        int expected = 500;
        int actual = service.remain(amount);


        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculate1() {
        int amount = 1000;
        CashBackHackService service = new CashBackHackService();

        int expected = 0;
        int actual = service.remain(amount);


        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculate2() {
        int amount = 999;
        CashBackHackService service = new CashBackHackService();

        int expected = 1;
        int actual = service.remain(amount);


        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculate3() {
        int amount = 1001;
        CashBackHackService service = new CashBackHackService();

        int expected = 999;
        int actual = service.remain(amount);


        assertEquals(expected, actual);
    }


}
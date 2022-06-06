package ru.netology.sqr.javaqamvn.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calc(200, 300);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalcInExact() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calc(200, 315);

        Assertions.assertEquals(expected, actual);
    }
}



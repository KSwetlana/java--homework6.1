package ru.netology.sqr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void checkExpected5() {
        SQRService service = new SQRService();

        int expected = 5;
        int actual = service.SQR(100, 200);
       Assertions.assertEquals(expected, actual);


    }

    @Test
    public void checkExpected90() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.SQR(100, 9801);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void heckExpected() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.SQR(300, 20);
        Assertions.assertEquals(expected, actual);
    }
}




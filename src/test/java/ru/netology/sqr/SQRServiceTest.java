package ru.netology.sqr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Locale;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "5,100,200",
            "90,100,9801",
            "-1,300,20",
            "0,16,81",
            "1,9801,10000"

    })

    public void checkExpected5(int expected, int range1, int range2) {
        SQRService service = new SQRService();

        //int expected = 5;
        int actual = service.SQR(range1, range2);
        Assertions.assertEquals(expected, actual);


    }

}

// @Test
// public void checkExpected90() {
//    SQRService service = new SQRService();

//   int expected = 90;
//  int actual = service.SQR(100, 9801);
//  Assertions.assertEquals(expected, actual);
// }

// @Test
// public void heckExpected() {
//   SQRService service = new SQRService();

//  int expected = -1;
//   int actual = service.SQR(300, 20);
//  Assertions.assertEquals(expected, actual);
// }

// @Test
//  public void checkExpected0() {
//     SQRService service = new SQRService();

//   int expected = 0;
//    int actual = service.SQR(16, 81);
//    Assertions.assertEquals(expected, actual);
// }

// @Test
// public void checkExpected1() {
//    SQRService service = new SQRService();

//   int expected = 1;
//   int actual = service.SQR(9801, 10000);
//    Assertions.assertEquals(expected, actual);
// }
//}




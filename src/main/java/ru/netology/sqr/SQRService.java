package ru.netology.sqr;

public class SQRService {
    public int SQR(int range1, int range2) {
        if (range1 > range2) {
            return -1;
        }

        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= range1 && i * i <= range2) {
                System.out.println("найдено число:" + i);
                count++;


            }
        }

        return count;
    }

}
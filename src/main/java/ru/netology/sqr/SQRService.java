package ru.netology.sqr;

public class SQRService {
    public int SQR(int x, int y) {
        if (x>y){
            return - 1;
        }

        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= x && i * i <= y) {
                System.out.println("найдено число:" +i);
                count++;


            }
                    }

       return count;
    }

}
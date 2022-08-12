package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int resalt = service.SQR(100, 9801);
        if (resalt == -1) {
            System.out.println("Задан не верный диапазон");
        } else {
            System.out.println("количество вхождений" + resalt);
        }
    }
}

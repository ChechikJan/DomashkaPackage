package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.numbersSquaresInRange(100, 9999));
    }
}
package ru.netology.sqr;

public class SQRService {
    public int numbersSquaresInRange(int range1, int range2) {
       int a = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= range1 & i * i <= range2) {
                a++;
            }
        }
        return a;
    }
}

package ru.netology.sqr.javaqamvn.services;



public class SQRService {
    public int calc(int x, int y) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = (i * i);
            if (sqr >= x)
                if (sqr <= y)
                    count = count + 1;

        }
        return count;
    }
}


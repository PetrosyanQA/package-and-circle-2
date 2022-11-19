package ru.netology.sqr.javaqamvn.services;

public class SQRService {
    public int calcSqrt(int start, int finish) {

        int variable = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= start & i * i <= finish) {
                variable++;
            }
            System.out.println(i);
        }
        return variable;
    }
}
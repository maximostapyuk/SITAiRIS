package com.company;

public class Ambulance implements SpecialTransport {
    public int a;
    private int b;

    @Override
    public int countNumber1(int a,int b) {
        System.out.println("Вывод функции countNumber1 \n");
        return a+b;
    }

    @Override
    public int countNumber3(int a,int b) {
        System.out.println("Вывод функции countNumber3 \n");
        int c = a-b+10;
        System.out.println("Результат " + c + "\n");
        return 0;
    }
}

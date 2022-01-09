package com.company;

public class MersedesSprinter implements MiniBus, RouteTaxi {
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
        return a*b;
    }

    @Override
    public int countNumber4(int a,int b) {
        System.out.println("Вывод функции countNumber4 \n");
        return a-b;
    }

    @Override
    public int countNumber5(int a,int b) {
        System.out.println("Вывод функции countNumber5 \n");
        return (a+b)*3;
    }

    @Override
    public int countNumber7(int a,int b) {
        System.out.println("Вывод функции countNumber7 \n");
        return a+b*2;
    }

    @Override
    public int countNumber8(int a,int b) {
        System.out.println("Вывод функции countNumber8 \n");
        int c=a*b;
        System.out.println(c);

        return 0;
    }
}

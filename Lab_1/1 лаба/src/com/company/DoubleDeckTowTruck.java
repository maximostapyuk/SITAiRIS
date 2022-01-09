package com.company;

public class DoubleDeckTowTruck extends Ambulance implements TowTruck, MiniBus {
    public int a;
    private int b;


    @Override
    public int countNumber2(int a,int b) {
        System.out.println("Вывод функции countNumber2 \n");
        return a-b;
    }

    @Override
    public int countNumber4(int a,int b) {
        System.out.println("Вывод функции countNumber4 \n");
        return a+b*4;
    }

    @Override
    public int countNumber5(int a,int b) {
        System.out.println("Вывод функции countNumber5 \n");
        return a-b*10;
    }

    @Override
    public int countNumber6(int a,int b) {
        System.out.println("Вывод функции countNumber6 \n");
        return (a+10)*b;
    }

    @Override
    public int countNumber7(int a,int b) {
        System.out.println("Вывод функции countNumber7 \n");
        return a*b+10;
    }
}

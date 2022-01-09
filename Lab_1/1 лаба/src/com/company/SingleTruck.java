package com.company;

public abstract class SingleTruck implements Truck {
    public int a;
    private int b;

    @Override
    public int countNumber1(int a,int b) {
        System.out.println("Вывод функции countNumber1 \n");
        return a+b;
    }

    @Override
    public int countNumber2(int a,int b) {
        System.out.println("Вывод функции countNumber2 \n");
        int c = a-b*3;
        System.out.println("Результат" + c + "\n");
        return 0;
    }
}

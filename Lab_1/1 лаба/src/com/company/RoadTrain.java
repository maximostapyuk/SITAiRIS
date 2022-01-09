package com.company;



public class RoadTrain implements Truck {
    public int a;
    private int b;

    public int countNumber1(int a, int b) {
        System.out.println("Вывод функции countNumber1 \n");
        int c = a + b;
        System.out.println("Результат " + c + "\n");
        return 0;
    }


    @Override
    public int countNumber2(int a, int b) {
        System.out.println("Вывод функции countNumber2 \n");
        int c = a*b+2;
        System.out.println("Результат " + c + "\n");
        return 0;
    }
}


package com.company;

public class Main {

    public static void main(String[] args) {
        int m1[] = new int[5];
        int m2[] = new int[5];
        int m3[] = new int[10];

        for (int i = 0; i < 10; i++) {

            m1[i] = (int) Math.round(Math.random() * 10);
            m2[i] = (int) Math.round(Math.random() * 10);
            m3[i] = m1[i] * m2[i];

            System.out.println("Перший масив: "+m1[i]);
            System.out.println("Другий масив: "+m2[i]);
            System.out.println("Третій масив: "+m3[i]);
        }
    }
}
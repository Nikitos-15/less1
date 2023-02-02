package org.example;
//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
public class Main {

    public static void main(String[] args) {
        int[] nubers = {68, 34, 36, 17, 39, 32};
        int max = 0;
        int min = nubers[1];
        for (int i = 0; i<nubers.length; i++)
        {

            if ( max < nubers[i] )
            {

                 max = nubers[i];

            }
            if ( min > nubers[i] )
            {

            min = nubers[i];

            }

        }
        System.out.println("минимум "+ min + "; максимум "+ max);


    }

}
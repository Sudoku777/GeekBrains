package ru.geekbrains.home_works;

import static ru.geekbrains.home_works.LessonOne.*;
import static ru.geekbrains.home_works.LessonTwo.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lesson1");
        one();
        System.out.println("\nresult " + calculate(5, 5, 7, 1));
        System.out.println("\n" + doFive(5));
        System.out.println("\n" + five(7, 11));
        System.out.println("\n" + bl(-1));
        str("Geek");
        System.out.println("\n");

        System.out.println("Lesson2");
        System.out.println("Задание 1:");
        invertArray();
        System.out.println("\nЗадание 2:");
        fillArray();
        System.out.println("\nЗадание 3:");
        changeArray();
        System.out.println("\nЗадание 4:");
        int[][] matrix = {
                {0, 0 ,0, 0},
                {0, 0 ,0, 0},
                {0, 0 ,0, 0},
                {0, 0 ,0, 0}
        };
        fillDiagonal(matrix);
        printArray(matrix);
        fillDiagonal(matrix);

    }
}
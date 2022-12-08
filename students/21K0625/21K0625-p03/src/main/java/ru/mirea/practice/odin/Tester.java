package ru.mirea.practice.odin;

import java.util.Arrays;
import java.util.Random;

public final class Tester {
    private Tester() {}

    public static void main(String[] args) {
        Random random = new Random();
        Circle[] array = new Circle[5];

        int i;
        for (i = 0; i < array.length; ++i) {
            array[i] = new Circle(random.nextInt(20), random.nextInt(20), random.nextDouble() + (double)random.nextInt(40));
        }

        System.out.println("Созданные окружности:");

        for (i = 0; i < array.length; ++i) {
            System.out.println(i + 1 + ". ");
            System.out.println(array[i]);
        }

        Arrays.sort(array);
        System.out.println("Наименьшая площадь: \n" + array[0]);
        System.out.println("Наибольшая площадь: \n" + array[array.length - 1]);
    }
}

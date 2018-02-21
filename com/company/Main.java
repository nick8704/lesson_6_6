package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the number of triangles: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Now enter the lengths of the sides of all triangles");
        double[] array = new double[3];
        int count = 0;
        for (int i = 1; i <= number; i++) {
            System.out.println("Triangle # " + i);
            System.out.print("side 1: ");
            array[0] = input.nextDouble();
            System.out.print("side 2: ");
            array[1] = input.nextDouble();
            System.out.print("side 3: ");
            array[2] = input.nextDouble();
            double semiperimeter;
            semiperimeter = (array[0] + array[1] + array[2]) / 2;
            double yardage;
            yardage = Math.sqrt(semiperimeter * (semiperimeter - array[0]) * (semiperimeter - array[1]) * (semiperimeter - array[2]));
            System.out.println();
            if (((int) array[0] - array[0]) == 0 && ((int) array[0] - array[0]) == 0 && ((int) array[0] - array[0]) == 0 && yardage < 100) {
                count++;
            }
        }
        System.out.println("The number of triangles whose sides are given by integers and whose area is less than 100 is: " + count + ".");
    }
}
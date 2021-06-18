package com.bridgelabz;
import java.util.Scanner;

class Harmonic {
    static double findSum(int n) {
        double sum = 0;

        for (double i = 1; i <= n; i++) {
            sum = sum + 1 / i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.printf("Sum upto " + n + "th value in the series is: %.2f",findSum(n));
    }
}


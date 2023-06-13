package com.assignment;

public class Pattern {
    public static void main(String[] args) {
        int n=5; // Example input
        myCode(n);
    }

    public static void myCode(int n) {
        

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

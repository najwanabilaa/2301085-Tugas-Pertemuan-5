package com.oopjava.methods;

import java.util.Scanner;

public class soalno1 {
    public static void cetakBilangan(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n (>=1): ");
        int n = input.nextInt();

        if (n >= 1) {
            cetakBilangan(n);
        } else {
            System.out.println("n harus >= 1");
        }
    }
}

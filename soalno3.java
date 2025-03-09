package com.oopjava.methods;

import java.util.Scanner;

public class soalno3   {
    public static void cekJenisSegitiga(int a, int b, int c) {
        if (a * a + b * b == c * c) {
            System.out.println("Segitiga Siku-siku");
        } else if (a * a + b * b > c * c) {
            System.out.println("Segitiga Lancip");
        } else {
            System.out.println("Segitiga Tumpul");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tiga sisi (a <= b <= c): ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a <= b && b <= c) {
            cekJenisSegitiga(a, b, c);
        } else {
            System.out.println("Masukkan sisi dalam urutan a <= b <= c!");
        }
    }
}

package com.oopjava.methods;

import java.util.Scanner;

public class soalno2 {
    public static void cekBentuk(int sisi1, int sisi2, int sisi3) {
        if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tiga sisi: ");
        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = input.nextInt();

        cekBentuk(s1, s2, s3);
    
    }
}

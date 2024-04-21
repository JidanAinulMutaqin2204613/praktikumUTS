package com.pbo.praktikumUTS;

import java.util.Scanner;

/**
 *
 * @author Jidan Ainul Mutaqin
 */
public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilPositif = 0;
        int bilNegatif = 0;
        int nilaiTotal = 0;
        int jumlah = 0;

        System.out.println("Masukkan bilangan integer, (0 untuk keluar program!):");

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            } else if (number > 0) {
                bilPositif++;
            } else {
                bilNegatif++;
            }

            if (number != 0) {
                nilaiTotal += number;
                jumlah++;
            }
        }

        if (jumlah == 0) {
            System.out.println("Program Selesai, Terimakasih.");
        } else {
            double rerata = (double) nilaiTotal / jumlah;
            System.out.println("Jumlah bilangan positif: " + bilPositif);
            System.out.println("Jumlah bilangan negatif: " + bilNegatif);
            System.out.println("Nilai Total: " + nilaiTotal);
            System.out.printf("Nilai Rata-rata: %.2f%n", rerata);
        }

        scanner.close();
    }
}


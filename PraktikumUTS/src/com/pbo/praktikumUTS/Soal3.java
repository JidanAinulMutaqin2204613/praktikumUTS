package com.pbo.praktikumUTS;

import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        long number = scanner.nextLong();
        int sum = sumDigits(number);
        System.out.println("Jumlah digit dalam bilangan " + number + " adalah: " + sum);
        scanner.close();
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10; // Mengambil digit terakhir dan menambahkannya ke sum
            n /= 10; // Menghapus digit terakhir
        }
        return sum;
    }
}

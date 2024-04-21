package com.pbo.praktikumUTS;

import java.util.Random;

/**
 *
 * @author Jidan Ainul Mutaqin
 */
public class Soal1 {
    public static void main(String[] args) {
        // Membuat objek random
        Random angkaAcak = new Random();
        
        // Menghasilkan bilangan acak 1 - 12
        int angkaBulan = angkaAcak.nextInt(12) + 1;
        System.out.println("Angka Random: " + angkaBulan);
        
        // Menampilkan nama bulan dengan switch case
        switch(angkaBulan){
            case 1:
                System.out.println("Januari");
                break;
            case 2:
                System.out.println("Februari");
                break;
            case 3:
                System.out.println("Maret");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Mei");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("Agustus");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Oktober");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("Desember");
                break;
            default:
                System.out.println("Bulan tidak ada!");
                break;
        }
    }
    
}

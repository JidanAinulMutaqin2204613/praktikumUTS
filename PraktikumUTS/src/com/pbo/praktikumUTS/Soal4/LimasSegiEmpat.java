package com.pbo.praktikumUTS.Soal4;

/**
 *
 * @author Jidan Ainul Mutaqin
 */

class LimasSegiempat {
    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;
    
    // Membuat Konstruktor
    public LimasSegiempat() {
        this.luasAlas = 0;
        this.luasSelubungLimas = 0;
        this.tinggi = 0;
    }
    
    // Konstruktor dengan parameter
    public LimasSegiempat(double luasAlas, double luasSelubungLimas, double tinggi) {
        this.luasAlas = luasAlas;
        this.luasSelubungLimas = luasSelubungLimas;
        this.tinggi = tinggi;
    }
    
    // Getter untuk luas alas
    public double getLuasAlas() {
        return this.luasAlas;
    }
    
    // Getter untuk luas selubung limas
    public double getLuasSelubungLimas() {
        return this.luasSelubungLimas;
    }
    
    // Getter untuk tinggi
    public double getTinggi() {
        return this.tinggi;
    }
    
    // Method untuk menghitung luas limas segiempat
    public double hitungLuas() {
        return this.luasAlas + this.luasSelubungLimas;
    }
    
    // Method untuk menghitung volume limas segiempat
    public double hitungVolume() {
        return (1.0/3.0) * this.luasAlas * this.tinggi;
    }
    
    // Setter untuk luas alas
    public void setLuasAlas(double luasAlas) {
        this.luasAlas = luasAlas;
    }
    
    // Setter untuk luas selubung limas
    public void setLuasSelubungLimas(double luasSelubungLimas) {
        this.luasSelubungLimas = luasSelubungLimas;
    }
    
    // Setter untuk tinggi
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}

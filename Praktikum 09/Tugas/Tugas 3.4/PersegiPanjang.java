/**
 * Nama        : Muhammad Farhan Al Ghifari - 24060123140186
 * Tanggal     : 10 - Mei - 2025
 * File        : PersegiPanjang.java
 * Deskripsi   : implementasi Persegi Panjang sebagai BangunDatar
 */

public class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double hitungLuas() {
        return panjang * lebar;
    }
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}
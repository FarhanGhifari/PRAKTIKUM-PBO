/**
 * Nama        : Muhammad Farhan Al Ghifari - 24060123140186
 * Tanggal     : 10 - Mei - 2025
 * File        : BangunDatarGeneric.java
 * Deskripsi   : kelas konstruksi generic untuk BangunDatar
 */

public class BangunDatarGenerik<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T bangunDatar) {
        this.bangunDatar = bangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double luas() {
        return bangunDatar.hitungLuas();
    }

    public double keliling() {
        return bangunDatar.hitungKeliling();
    }
}
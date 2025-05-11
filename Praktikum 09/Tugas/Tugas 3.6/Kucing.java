/**
 * Nama        : Muhammad Farhan Al Ghifari - 24060123140186
 * Tanggal     : 10 - Mei - 2025
 * File        : Kucing.java
 * Deskripsi   : Turunan dari kelas Anabul yang merepresentasikan hewan kucing, mengimplementasikan metode bersuara dan metode bergerak.
 **/

public class Kucing extends Anabul{

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Meong!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan cara melata.");
    }
}
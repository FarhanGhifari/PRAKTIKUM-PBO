/**
 * Nama        : Muhammad Farhan Al Ghifari - 24060123140186
 * Tanggal     : 10 - Mei - 2025
 * File        : Burung.java
 * Deskripsi   : Turunan dari kelas Anabul yang merepresentasikan hewan burung, mengimplementasikan metode bersuara dan metode bergerak.
 **/

public class Burung extends Anabul{

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Cuit!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan cara terbang.");
    }
}
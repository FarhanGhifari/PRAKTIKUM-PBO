/**
 * Nama        : Muhammad Farhan Al Ghifari - 24060123140186
 * Tanggal     : 10 - Mei - 2025
 * File        : Anabul.java
 * Deskripsi   : Kelas abstrak Anabul berfungsi sebagai superclass untuk semua jenis hewan yang memiliki kemampuan untuk berbunyi dan bergerak.
 **/

public abstract class Anabul {
    // Atribut
    protected String nama;

    // Konstruktor
    public Anabul(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void bersuara();
    public abstract void bergerak();
}
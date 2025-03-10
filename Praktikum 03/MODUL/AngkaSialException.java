package MODUL;
/**
 * File      : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri menolak masukan angka 13
 * Pembuat   : Muhammad Farhan Al Ghifari / 24060123140186
 * Tanggal   : 07 Maret 2025
 */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}

/**
 * Nama        : Muhammad Farhan Al Ghifari - 24060123140186
 * Tanggal     : 10 - Mei - 2025
 * File        : Main.java
 * Deskripsi   : Demonstrasi penggunaan kelas Koleksi dengan karakter "MFARHANALG"
 **/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>(10);
        System.out.println("Menambahkan 10 karakter:");
        char[] karakter = {'M', 'F', 'A', 'R', 'H', 'A', 'N', 'A', 'L', 'G'};
        for (char c : karakter) {
            koleksiKarakter.add(c);
        }
        koleksiKarakter.showAll();
        System.out.println("Jumlah elemen: " + koleksiKarakter.getSize());
        System.out.println();
        
        System.out.println("Ambil elemen di indeks ke-0:");
        System.out.println("Isi: " + koleksiKarakter.getIsi(0));
        System.out.println();
        
        System.out.println("Ubah elemen di indeks ke-3 menjadi 'U':");
        koleksiKarakter.setIsi(5, 'U');
        koleksiKarakter.showAll();
        System.out.println();
        
        System.out.println("Hapus elemen di indeks ke-9:");
        koleksiKarakter.delete(9);
        koleksiKarakter.showAll();
        System.out.println("Jumlah elemen: " + koleksiKarakter.getSize());
        System.out.println();
        
        System.out.println("Set size menjadi 12:");
        koleksiKarakter.setSize(12);
        koleksiKarakter.showAll();
        System.out.println("Jumlah elemen: " + koleksiKarakter.getSize());
        System.out.println();
        
        System.out.println("Set size menjadi 7:");
        koleksiKarakter.setSize(7);
        koleksiKarakter.showAll();
        System.out.println("Jumlah elemen: " + koleksiKarakter.getSize());
    }
}
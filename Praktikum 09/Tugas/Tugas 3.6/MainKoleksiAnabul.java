/**
 * Nama        : Muhammad Farhan Al Ghifari - 24060123140186
 * Tanggal     : 10 - Mei - 2025
 * File        : MainKoleksiAnabul.java
 * Deskripsi   : Berfungsi untuk mendemonstrasikan penggunaan kelas-kelas yang telah dibuat sebelumnya.
 **/

import java.util.Random;

public class MainKoleksiAnabul {
    public static void main(String[] args) {
        KoleksiAnabul<Anabul> koleksiAnabul = new KoleksiAnabul<>();
        Random rand = new Random();

        // Array nama untuk anabul
        String[] nama = {"Milo", "Coco", "Oscar", "Luna", "Max", "Lily", "Simba", "Rocky", "Daisy", "Mimi"};

        // Mengisi KoleksiAnabul dengan 10 elemen acak
        for (int i = 0; i < 10; i++) {
            int pilih = rand.nextInt(3); // 0: Kucing, 1: Anjing, 2: Burung
            if (pilih == 0)
                koleksiAnabul.add(new Kucing(nama[i]));   
            else if (pilih == 1)
                koleksiAnabul.add(new Anjing(nama[i]));   
            else
                koleksiAnabul.add(new Burung(nama[i]));  
        }

        koleksiAnabul.showAll();
    }
}

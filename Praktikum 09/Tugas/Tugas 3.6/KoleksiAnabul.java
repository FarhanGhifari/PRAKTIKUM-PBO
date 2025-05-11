/**
 * Nama        : Muhammad Farhan Al Ghifari - 24060123140186
 * Tanggal     : 10 - Mei - 2025
 * File        : KoleksiAnabul.java
 * Deskripsi   : Kelas generik yang digunakan untuk menyimpan objek-objek bertipe Anabul dalam sebuah koleksi (list)
 **/

import java.util.ArrayList;

public class KoleksiAnabul<T extends Anabul> {
    private int nbelm;            // Jumlah elemen dalam koleksi
    private ArrayList<T> wadah;   // Wadah koleksi yang menyimpan objek Anabul

    public KoleksiAnabul() {
        wadah = new ArrayList<>();
        nbelm = 0;
    }

    public T getIsi(int index) {
        if (index >= 0 && index < nbelm) {
            return wadah.get(index);
        } else {
            System.out.println("Index di luar batas!");
            return null;
        }
    }

    public void setIsi(int index, T nilai) {
        if (index >= 0 && index < nbelm) {
            wadah.set(index, nilai);
        } else {
            System.out.println("Index di luar batas!");
        }
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int size) {
        if (size >= 0 && size <= wadah.size()) {
            nbelm = size;
        }
    }

    public void add(T nilai) {
        wadah.add(nilai); 
        nbelm++;          
    }

    public void delete(int index) {
        if (index >= 0 && index < nbelm) {
            for (int i = index; i < nbelm - 1; i++) {
                wadah.set(i, wadah.get(i + 1));
            }
            wadah.remove(nbelm - 1); 
            nbelm--;
        } else {
            System.out.println("Index tidak valid untuk delete!");
        }
    }

    public void showAll() {
        System.out.println("\n=== DAFTAR SELURUH ANABUL ===");
        for (int i = 0; i < nbelm; i++) {
            T anabul = wadah.get(i);
            System.out.println("\n" + (i + 1) + ". " + anabul.getClass().getSimpleName() + " - " + anabul.getNama());
            System.out.print("   ");
            anabul.bersuara();
            System.out.print("   ");
            anabul.bergerak();
        }
        System.out.println("\nTotal : " + nbelm + " Anabul");
    }
}

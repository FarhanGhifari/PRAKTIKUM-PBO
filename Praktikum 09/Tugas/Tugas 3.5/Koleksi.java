/**
 * Nama        : Muhammad Farhan Al Ghifari - 24060123140186
 * Tanggal     : 10 - Mei - 2025
 * File        : Koleksi.java
 * Deskripsi   : Implementasi struktur data koleksi generik, menyediakan operasi: add, getIsi, setIsi, delete, getSize, setSize, dan showAll
 **/

public class Koleksi<T> {
    // Atribut
    private int nbelm;      // Banyaknya elemen efektif koleksi
    private Object[] wadah; // Wadah untuk menyimpan nilai-nilai elemen
    
    // Konstruktor
    public Koleksi(int kapasitas) {
        this.nbelm = 0;
        this.wadah = new Object[kapasitas];
    }
    
    public T getIsi(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return (T) wadah[indeks];
        } else {
            System.out.println("Indeks tidak valid!");
            return null;
        }
    }
    
    public void setIsi(int indeks, T nilai) {
        if (indeks >= 0 && indeks < nbelm) {
            wadah[indeks] = nilai;
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }
    
    public int getSize() {
        return nbelm;
    }
    
    public void setSize(int ukuran) {
        if (ukuran >= 0 && ukuran <= wadah.length) {
            this.nbelm = ukuran;
        } else {
            System.out.println("Ukuran tidak valid!");
        }
    }

    public void add(T nilai) {
        if (nbelm < wadah.length) {
            wadah[nbelm] = nilai;
            nbelm++;
        } else {
            System.out.println("Koleksi sudah penuh!");
        }
    }

    public void delete(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            // Geser elemen-elemen setelah indeks yang dihapus
            for (int i = indeks; i < nbelm - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            // Kosongkan elemen terakhir yang sekarang duplikat
            wadah[nbelm - 1] = null;
            // Kurangi jumlah elemen efektif
            nbelm--;
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }
    
    public void showAll() {
        if (nbelm == 0) {
            System.out.println("Koleksi kosong!");
        } else {
            System.out.println("Isi koleksi:");
            for (int i = 0; i < nbelm; i++) {
                System.out.println("Elemen ke-" + i + ": " + wadah[i]);
            }
        }
    }
}
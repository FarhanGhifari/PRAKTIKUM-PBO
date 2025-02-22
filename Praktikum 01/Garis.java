/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Muhammad Farhan Al Ghifari
 * Tanggal      : Sabtu, 22 Februari 2025
 */

public class Garis {
    // Atribut
     Titik titikAwal;
     Titik titikAkhir;
     static int counterGaris = 0;

    // Konstruktor
     Garis() {
        this(new Titik(0, 0), new Titik(1, 1));
    }

     Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Method getter dan setter
     Titik getTitikAwal() {
        return titikAwal;
    }

     void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

     Titik getTitikAkhir() {
        return titikAkhir;
    }

     void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

     static int getCounterGaris() {
        return counterGaris;
    }

    // Method untuk mendapatkan panjang garis
     double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // Method untuk mendapatkan gradien garis
     double getGradien() {
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        return deltaY / deltaX;
    }

    // Method untuk mendapatkan titik tengah garis
     Titik getTitikTengah() {
        double tengahX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double tengahY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(tengahX, tengahY);
    }

    // Method untuk mengecek apakah garis sejajar dengan garis lain
     boolean isSejajar(Garis garisLain) {
        return this.getGradien() == garisLain.getGradien();
    }

    // Method untuk mengecek apakah garis tegak lurus dengan garis lain
     boolean isTegakLurus(Garis garisLain) {
        return this.getGradien() * garisLain.getGradien() == -1;
    }

    // Method untuk menampilkan titik awal dan titik akhir garis
     void printGaris() {
        System.out.println("Garis dari titik (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ") ke titik (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    // Method untuk menampilkan persamaan garis dalam bentuk y = mx + c
     String getPersamaanGaris() {
        double m = this.getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}

/**
 * Nama        : Muhammad Farhan Al Ghifari - 24060123140186
 * Tanggal     : 10 - Mei - 2025
 * File        : BangunDatarGenericTest.java
 * Deskripsi   : main class untuk generic bangun datar
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        //Persegi
        Persegi persegi = new Persegi(5);
        BangunDatarGenerik<Persegi> gen1 = new BangunDatarGenerik<>();
        gen1.set(persegi);
        System.out.println("Luas persegi: " + gen1.luas());
        System.out.println("Keliling persegi: " + gen1.keliling());
        System.out.println("Tipe Generic: " + gen1.get().getClass().getName());
        System.out.println();

        //Persegi Panjang
        PersegiPanjang persegipanjang = new PersegiPanjang(6, 2);
        BangunDatarGenerik<PersegiPanjang> gen2 = new BangunDatarGenerik<>();
        gen2.set(persegipanjang);
        System.out.println("Luas persegi panjang: " + gen2.luas());
        System.out.println("Keliling persegi panjang: " + gen2.keliling());
        System.out.println("Tipe Generic: " + gen2.get().getClass().getName());
        System.out.println();

        //Segitiga
        Segitiga segitiga = new Segitiga(3, 5);
        BangunDatarGenerik<Segitiga> gen3 = new BangunDatarGenerik<>();
        gen3.set(segitiga);
        System.out.println("Luas segitiga: " + gen3.luas());
        System.out.println("Keliling segitiga: " + gen3.keliling());
        System.out.println("Tipe Generic: " + gen3.get().getClass().getName());
    }
}
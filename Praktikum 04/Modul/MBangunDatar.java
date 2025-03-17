/* 
Nama File   : MBangunDatar.java
Deskripsi   : Berisi main dari program" yang telah dibuat
Pembuat     : Muhammad Farhan Al Ghifari / 24060123140186
Tanggal     : 15 Maret 2025
*/
public class MBangunDatar {
    public static void main(String[] args) {
        System.out.println("=== Persegi ===");
        System.out.println();
        
        Persegi persegi1 = new Persegi(5, "Biru", "Merah");
        persegi1.printInfo();

        System.out.println("\n=== Lingkaran ===");
        System.out.println();

        Lingkaran lingkaran1 = new Lingkaran(14, "Hijau", "Kuning");
        lingkaran1.printInfo();
    }
}


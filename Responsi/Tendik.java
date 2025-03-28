/* Nama File : Tendik.java
 * Deskripsi : Berisi atribut dan method dalam subclass Tendik
 * Pembuat : Muhammad Farhan Al Ghifari / 24060123140186
 * Tanggal : Jumat, 28 Maret 2025
 */

 public class Tendik extends Karyawan implements Info {
    private static int tendikCounter = 0;
    
    public Tendik(String nama, String email, String NIP, int masaKerja) {
        super(nama, email, NIP, masaKerja);
        tendikCounter++;
    }
    
    public double hitungGaji() {
        return 4000000 + (masaKerja * 0.01 * 4000000);
    }
    
    public static int getTendikCounter() {
        return tendikCounter;
    }
    
    @Override
    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("Tendik: " + nama);
        System.out.println("Masa kerja: " + masaKerja);
        System.out.println("Gaji: " + hitungGaji());
    }
}
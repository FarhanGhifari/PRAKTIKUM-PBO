/* Nama File : Dosen.java
 * Deskripsi : Berisi atribut dan method dalam subclass dosen
 * Pembuat : Muhammad Farhan Al Ghifari / 24060123140186
 * Tanggal : Jumat, 28 Maret 2025
 */

 public class Dosen extends Karyawan  implements Info{
    private Fakultas fakultas;
    private static int DosenCounter = 0;

    public Dosen(String nama, String email, String NIP, int masaKerja, Fakultas fakultas) {
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
        DosenCounter++;
    }

    public static int getDosenCounter() {
        return DosenCounter;
    }

    @Override
    public double hitungGaji() {
        return fakultas.getGajiPokok() + (masaKerja * 0.01 * fakultas.getGajiPokok());
    }

    @Override
    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("Dosen: " + nama);
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Masa kerja: " + masaKerja);
        System.out.println("Gaji: " + hitungGaji());
    }
}
/* Nama File : Karyawan.java
 * Deskripsi : Berisi atribut dan method dalam abstract class Super Karyawan
 * Pembuat : Muhammad Farhan Al Ghifari / 24060123140186
 * Tanggal : Jumat, 28 Maret 2025
 */
public abstract class Karyawan extends CivitasAkademika {
    protected String NIP;
    protected int masaKerja;
    protected static int karyawanCounter = 0;

    public Karyawan(String nama, String email, String NIP, int masaKerja) {
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
        karyawanCounter++;
    }

    public String getNIP() {
        return NIP;
    }

    public int getMasaKerja() {
        return masaKerja;
    }
    
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public static int getKaryawanCounter() {
        return karyawanCounter;
    }

    public abstract double hitungGaji();
}
package Tugas;

/*  Nama File   : PNS.java
    Nama        : Muhammad Farhan Al Ghifari - 24060123140186
    Deskripsi   : subclass PNS dari Manusia
    Tanggal     : 22 - Maret - 2025
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS;

    public PNS(String nama, String tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, LocalDate.parse(tglMulaiKerja, java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy")), alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Selector (Getter)
    public String getNip() {
        return nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 6; // A = 6
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }
}
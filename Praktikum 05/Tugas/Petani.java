package Tugas;

/*  Nama File   : Petani.java
    Nama        : Muhammad Farhan Al Ghifari - 24060123140186
    Deskripsi   : Subclass Petani dari Manusia
    Tanggal     : 22 - Maret - 2025
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani;

    public Petani(String nama, String tglMulaiKerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, LocalDate.parse(tglMulaiKerja, java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy")), alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota() {
        return asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 1; // C = 1
    }

    @Override
    public double hitungPajak() {
        return 0;
    }
}
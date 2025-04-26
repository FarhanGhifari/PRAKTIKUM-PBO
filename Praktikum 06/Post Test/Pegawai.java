/*  Nama File   : Pegawai.java
    Nama        : Muhammad Farhan Al Ghifari - 24060123140186
    Tanggal     : 26 - April - 2025
*/

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}
/* Nama File    : MMahasiswa.java
 * Deskripsi    : berisi main dalam class Mahasiswa
 * Pembuat      : Muhammad Farhan Al Ghifari
 * Tanggal      : 02 Maret 2025
 */

 public class MMahasiswa{
    public static void main(String[] args){
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berbasis Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);

        Mahasiswa M1 = new Mahasiswa("186","Farhan","Informatika");
        Dosen D1 = new Dosen("17865456","Pak Nurdin","Informatika");
        Kendaraan K1 = new Kendaraan("F 3 MI","Mobil");

        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);

        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS = " + M1.getJumlahSks());
    }
}
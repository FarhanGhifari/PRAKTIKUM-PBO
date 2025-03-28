/* Nama File : Main.java
 * Deskripsi : Berisi main class untuk menjalankan program
 * Pembuat : Muhammad Farhan Al Ghifari / 24060123140186
 * Tanggal : Jumat, 28 Maret 2025
 */

 public class Main{
    public static void main(String[] args) {
        Fakultas FSM = new Fakultas("Informatika", 5000000, 8000000);
        Mahasiswa mhs1 = new Mahasiswa("Al Ghifari", "ghifari@gmail.com", "1234567812", 4, FSM);
        Dosen dosen1 = new Dosen("Budi Sujatmiko S.T, M.T", "budi@gmail.com", "1234432156", 10, FSM);
        Tendik tendik1 = new Tendik("Siti Mashur S.Kom, M.Kom", "siti@gmail.com", "1234432178", 5);
        
        System.out.println("======================= Biodata Informasi =======================");
        mhs1.printInfo();
        System.out.println();

        dosen1.printInfo();
        System.out.println();

        tendik1.printInfo();
        System.out.println();

        System.out.println("Total Mahasiswa: " + Mahasiswa.getMahasiswaCounter());
        System.out.println("Total Dosen: " + Dosen.getDosenCounter());
        System.out.println("Total Tendik: " + Tendik.getTendikCounter());
        System.out.println("Total Karyawan: " + Karyawan.getKaryawanCounter());
        System.out.println("Total Civitas Akademika: " + CivitasAkademika.getTotalCounter());
    }
}
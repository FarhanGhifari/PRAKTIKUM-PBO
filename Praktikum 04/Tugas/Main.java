/* 
Nama File   : Main.java
Deskripsi   : Berisi Main dari program Pegawai, Dosen, DosenTetap, DosenTamu dan Tendik
Pembuat     : Muhammad Farhan Al Ghifari / 24060123140186
Tanggal     : 15 Maret 2025
*/
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        // Membuat objek DosenTetap
        DosenTetap dosenTetap = new DosenTetap("197811112008121001", "12345678", "Dr. Fakhri Kurniawan, M.Kom",
            LocalDate.of(1978, 11, 11),
            LocalDate.of(2008, 12, 1), 7000000, "Fakultas Sains & Matematika");
        
        System.out.println("=== Informasi Dosen Tetap ===");
        dosenTetap.printInfo();
        System.out.println();

        // Membuat objek DosenTamu
        DosenTamu dosenTamu = new DosenTamu("198511112020121002", "87654321", "Prof. Mahmud Syamsudin",
            LocalDate.of(1985, 11, 11),
            LocalDate.of(2020, 12, 1), 5000000, "Fakultas Teknik", 24);
        
        System.out.println("=== Informasi Dosen Tamu ===");
        dosenTamu.printInfo();
        System.out.println();

        // Membuat objek Tendik
        Tendik tendik = new Tendik("199001152010121003", "Andi Saputra", 
            LocalDate.of(1990, 1, 15), 
            LocalDate.of(2010, 12, 1), 4000000, "Administrasi Akademik"); 
       
        System.out.println("=== Informasi Tendik ===");
        tendik.printInfo();
        System.out.println();
    }
}
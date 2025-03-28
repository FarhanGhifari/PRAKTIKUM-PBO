/* Nama File : Mahasiswa.java
 * Deskripsi : Berisi atribut dan method dalam subclass Mahasiswa
 * Pembuat : Muhammad Farhan Al Ghifari / 24060123140186
 * Tanggal : Jumat, 28 Maret 2025
 */

 public class Mahasiswa extends CivitasAkademika implements Info {
    private static int mahasiswaCounter = 0;
    private String NIM;
    private int semester;
    private Fakultas fakultas;
    
    public Mahasiswa(String nama, String email, String NIM, int semester, Fakultas fakultas) {
        super(nama, email);
        this.NIM = NIM;
        this.semester = semester;
        this.fakultas = fakultas;
        mahasiswaCounter++;
    }

    public String getNIM() {
        return NIM;
    }
    
    public int getSemester() {
        return semester;
    }
    
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    
    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    public static int getMahasiswaCounter() {
        return mahasiswaCounter;
    }
    
    public double hitungUKT() {
        return fakultas.getTarifUKT() * Math.pow(0.95, semester - 1);
    }

    @Override
    public void printInfo() {
        System.out.println("Mahasiswa: " + nama);
        System.out.println("NIM: " + NIM );
        System.out.println("Semester: " + semester);
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("UKT: " + hitungUKT());
    }
}
/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Muhammad Farhan Al Ghifari
 * Tanggal      : 27 Februari 2025
 */

public class MataKuliah {
    private String idMatKul;
    private String Nama;
    private int Sks;

    //Konstruktor tanpa parameter
    public MataKuliah(){
        this.idMatKul = "";
        this.Nama = "";
        this.Sks = 0;
    }

    //Konstruktor dengan parameter idMatKul,nama dan sks
    public MataKuliah(String idMatkul, String Nama, int Sks){
        this.idMatKul = idMatkul;
        this.Nama = Nama;
        this.Sks = Sks;
    }

    //Selektor dan mutator untuk masing-masing atribut
    public String getidMatKul(){
        return idMatKul;
    }

    public String getNama(){
        return Nama;
    }

    public int getSks(){
        return Sks;
    }

    public void setidMatkul(String idMatkul){
        this.idMatKul = idMatkul;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setSks(int Sks){
        this.Sks = Sks;
    }
}

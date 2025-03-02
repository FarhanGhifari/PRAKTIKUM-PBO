/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Muhammad Farhan Al Ghifari
 * Tanggal      : 27 Februari 2025
 */

public class Dosen {
    private String Nip;
    private String Nama;
    private String Prodi;
    
    //Konstruktor tanpa parameter
    public Dosen () {
        this.Nip = "";
        this.Nama = "";
        this.Prodi = "";
    }
    //Konstruktor dengan parameter nip, nama dan prodi
    public Dosen (String Nip, String Nama, String Prodi) {
        this.Nip = Nip;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }
    //Selektor dan mutator untuk masing-masing atribut
    public String getNip(){
        return Nip;
    }

    public String getNama(){
        return Nama;
    }

    public String getProdi(){
        return Prodi;
    }

    public void setNip(String Nip){
        this.Nip = Nip;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }
}



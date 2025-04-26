/*  Nama File   : Manager.java
    Nama        : Muhammad Farhan Al Ghifari - 24060123140186
    Tanggal     : 26 - April - 2025
*/

public class Manager extends Pegawai {
    private int tunjangan;

    public Manager(String nama) {
        super(nama); 
        this.tunjangan = 700000;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
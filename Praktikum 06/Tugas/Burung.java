/*  Nama File   : Burung.java
    Nama        : Muhammad Farhan Al Ghifari - 24060123140186
    Tanggal     : 26 - April - 2025
*/

class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Cuit.");
    }
}
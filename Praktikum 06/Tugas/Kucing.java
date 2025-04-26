/*  Nama File   : Kucing.java
    Nama        : Muhammad Farhan Al Ghifari - 24060123140186
    Tanggal     : 26 - April - 2025
*/

class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Meong.");
    }
}
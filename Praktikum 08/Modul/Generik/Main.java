/*  Nama File   : Main.java
    Nama        : Muhammad Farhan Al Ghifari - 24060123140186
    Tanggal     : 03 - Mei - 2025
*/

public class Main {
    public static void main(String[] args) {
        Anjing a = new Anjing();
        Kucing b = new Kucing();
        Datum <Anabul> f = new Datum<>();
        f.setIsi(a);
        f.getIsi().gerak();
        f.getIsi().suara();
        f.setIsi(b);
        f.getIsi().gerak();
        f.getIsi().suara();
        f.setIsi(new Burung());
        f.getIsi().gerak();
        f.getIsi().suara();
    }

}
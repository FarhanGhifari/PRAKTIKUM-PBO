/*  Nama File   : MainGenerik.java
    Nama        : Muhammad Farhan Al Ghifari - 24060123140186
    Tanggal     : 03 - Mei - 2025
*/

public class MainGenerik {
    public static void main(String[] args) {
        Datum<Anabul> x = new Datum<>();
        x.setIsi(new Kucing());

        Datum<Anabul> y = new Datum<>();
        y.setIsi(new Anjing());

        Datum<Anabul> z = new Datum<>();
        z.setIsi(new Burung());

        ContohMetodeGenerik.Perilaku(x);
        ContohMetodeGenerik.Perilaku(y);
        ContohMetodeGenerik.Perilaku(z);
    }
}
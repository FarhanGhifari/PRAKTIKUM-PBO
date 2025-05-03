/*  Nama File   : Senjata.java
    Nama        : Muhammad Farhan Al Ghifari - 24060123140186
    Tanggal     : 03 - Mei - 2025
*/

public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0; 
    }

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru() {
        this.peluru = 5; 
    }

    // Method menembak
    public void menembak() {
        if (peluru > 0) {
            System.out.println("AK47 menembak");
            System.out.println(bunyi);
            peluru--;
            System.out.println("Sisa Peluru: " + peluru);
        } else {
            System.out.println("Peluru habis, isi ulang terlebih dahulu!");
        }
    }
}

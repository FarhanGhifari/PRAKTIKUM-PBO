/*
 * File      : Pesanan.java
 * Deskripsi : Program untuk penggunaan pesanan
 * Pembuat   : Muhammad Farhan Al Ghifari / 24060123140186
 * Tanggal   : 07 Maret 2025 
 */
public class Pesanan {
    private Menu menu;
    private int jumlah;
    private double total;

    public Pesanan(Menu menu, int jumlah) {
        this.menu = menu;
        this.jumlah = jumlah;
        hitungTotal();
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    private void hitungTotal() {
        total = menu.getHarga() * jumlah;
    }
}
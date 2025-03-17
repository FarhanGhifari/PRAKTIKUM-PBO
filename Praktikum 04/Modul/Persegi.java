/* 
Nama File   : Persegi.java
Deskripsi   : Berisi atribut dan method dalam class Persegi
Pembuat     : Muhammad Farhan Al Ghifari / 24060123140186
Tanggal     : 15 Maret 2025
*/
class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * sisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Panjang Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Diagonal: " + getDiagonal());
    }
}
/*
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi yang akan menolak input jari-jari lingkaran yang bernilai 0
 * Pembuat   : Muhammad Farhan Al Ghifari / 24060123140186
 * Tanggal   : 07 Maret 2025
 */

 //class Lingkaran
 class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
 }
 
 //class Asersi2
 public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0):"Jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
 }

 // PERTANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
 //              Jelaskan pada lembar laporan praktikum!
 // JAWABAN : pada asersi2 terdapat asersi yang digunakan tidak sesuai dengan kondisi yg diinginkan
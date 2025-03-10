package MODUL;
/*
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri Pengenalan klausa 'throw' dan 'throws'
 * Pembuat   : Muhammad Farhan Al Ghifari / 24060123140186
 * Tanggal   : 07 Maret 2025 
 */
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }   
}

// PERTANYAAN : 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
//              2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
//                 Jelaskan pada lembar praktikum anda !
 
// JAWABAN : 1. baris 12 tidak dieksekusi jika angkanya 13 karena exception terjadi sebelum mencapai baris tersebut, untuk angka selain 13 akan dieksekusi
//           2. Kalau ada exception dan sudah dihandle oleh blok catch, maka program tidak langsung berhenti. Setelah blok catch selesai, program 
//              bakal lanjut jalan ke baris-baris setelah try-catch
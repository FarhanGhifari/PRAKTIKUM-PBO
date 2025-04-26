/*  Nama File   : TestPolimorfisme.java
    Nama        : Muhammad Farhan Al Ghifari - 24060123140186
    Tanggal     : 26 - April - 2025
*/

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Manager pegawai3 = new Manager("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

/* 
2. Kode lebih fleksibel dan mudah dikembangkan, bisa mengelola semua jenis pegawai
(Programmer, Manager) lewat satu tipe umum yaitu Pegawai, menambah jenis pegawai baru
misal Designer tidak perlu ubah kode utama tinggal buat subclass baru

3. jika tidak menggunakan polimorfisme dapat membuat beberapa permasalahan berikut :
- Setiap objek pegawai harus dicek satu per satu untuk mengetahui jenisnya (apakah
Manager, Programmer, atau jenis lainnya)
- Program menjadi lebih panjang, rumit, dan sulit dipelihara
- Setiap kali ada penambahan jenis pegawai baru, program utama harus diubah lagi untuk
menambahkan pengecekan terhadap tipe baru tersebut
- Risiko terjadinya kesalahan (error) dalam program juga menjadi lebih tinggi
*/
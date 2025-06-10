/**
 * Nama        : Muhammad Farhan Al Ghifari - 24060123140186
 * File        : MapMahasiswaLambda.java
 * Deskripsi   : Implementasi lambda pada Map, digunakan untuk menampilkan key (NIM) dan value (nama mahasiswa).
 */

import java.util.HashMap;
import java.util.Map;

public class MapMahasiswaLambda {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("2023001", "Adi");
        mahasiswaMap.put("2023002", "Bambang");
        mahasiswaMap.put("2023003", "Cici");
        mahasiswaMap.put("2023004", "Didi");
        mahasiswaMap.put("2023005", "Eka");
        
        System.out.println("Daftar Mahasiswa:");
        System.out.println("NIM\t\tNama");
        System.out.println("=========================");
        
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + "\t\t" + nama));
    }
}
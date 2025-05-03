/*  Nama File   : KontrolSenjata.java
    Nama        : Muhammad Farhan Al Ghifari - 24060123140186
    Tanggal     : 03 - Mei - 2025
*/

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumlah) {
        int peluruBaru = senjata.getPeluru() + jumlah;
        senjata.setPeluru(peluruBaru);
        System.out.println(">> Peluru berhasil ditambah: " + jumlah);
    }

public void menembak(int jumlah) {
    System.out.println(">> Siap menembak " + jumlah + " kali");
    if (!isAdaPeluru()) {
        System.out.println("Peluru Habis");
    } else {
        for (int i = 0; i < jumlah; i++) {
            if (isAdaPeluru()) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
                break;
            }
        }
    }
    System.out.println(">> Peluru sisa: " + senjata.getPeluru());
}


    public String menusuk() {
        if (senjata.isMenusuk()) {
            return "menusuk";
        } else {
            return "tidak bisa menusuk";
        }
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }
}

/*  Nama File   : Main.java
    Nama        : Muhammad Farhan Al Ghifari - 24060123140186
    Tanggal     : 26 - April - 2025
*/

public class Main {
    public static void main(String[] args) {
        Anabul[] anabulArray = {
            new Kucing("Ocil"),
            new Anjing("Hachi"),
            new Burung("Birdie")
        };

        for (Anabul anabul : anabulArray) {
            anabul.gerak();
            anabul.bersuara();
            System.out.println();
        }
    }
}
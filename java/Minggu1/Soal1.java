package Minggu1;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Nama Film: ");
        String namaFilm = scn.nextLine();
        System.out.print("Harga Tiket: ");
        int hargaTiket = scn.nextInt();
        System.out.print("Jumlah Tiket: ");
        int jumlahTiket = scn.nextInt();

        System.out.println("");
        System.out.println("Nama Film: " + namaFilm);
        System.out.println("Harga Tiket: " + hargaTiket);
        System.out.println("Jumlah Tiket " + jumlahTiket);

    }
}

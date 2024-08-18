package Minggu1;

import java.util.Scanner;

public class Soal2 {
    public static void  main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukan nama film: ");
        String namaFilm = scn.nextLine();

        System.out.println("");

        System.out.println("Nama film dalam huruf besar: " + namaFilm.toUpperCase());
    }
}

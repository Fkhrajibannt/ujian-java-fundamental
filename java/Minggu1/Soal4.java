package Minggu1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] listFilm = new String[6];

        System.out.println("Daftar Film Bioskop");
        for(int i = 1; i <= 5; i++) {
            System.out.print("Masukan nama film " + i +": ");
            listFilm[i] = scn.nextLine();
        }

        System.out.println("");

        System.out.println("Film yang ingin ditonton:");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i + "." + " " +listFilm[i]);
        }
    }
}

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] hargaTiket = new int[6];
        int jumlah = 0;

        System.out.println("Daftar Film Bioskop");
        for(int i = 1; i <= 5; i++) {
            System.out.print("Harga tiket film " + i +": ");
            hargaTiket[i] = scn.nextInt();
            jumlah += hargaTiket[i];
        }
        System.out.println("Total harga tiket: " + jumlah);
    }
}

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        String week;
        int harga;
        Scanner scn = new Scanner(System.in);


        LocalDateTime tanggalWaktuSekarang = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd-MM-yyyy HH:mm:ss");
        String tanggalWaktuHariFormat = tanggalWaktuSekarang.format(formatter);

        if (tanggalWaktuHariFormat.contains("Saturday") || tanggalWaktuHariFormat.contains("Sunday")) {
            week = "Weekend";
            harga = 45000;
        } else {
            week = "Weekdays";
            harga = 35000;
        }

        System.out.print("Masukan jumlah tiket: ");
        int jumlahTiket = scn.nextInt();

        if (jumlahTiket > 5) {
            System.out.println("Jumlah tiket: " + jumlahTiket);
            System.out.println("Total harga (dengan diskon): " + (jumlahTiket * harga) * 0.1);
        } else {
            System.out.println("Jumlah tiket: " + jumlahTiket);
            System.out.println("Total harga (dengan diskon): " + (jumlahTiket * harga));
        }


    }
}

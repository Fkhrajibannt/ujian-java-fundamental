package Minggu2;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATMTest {
    private ATM atm;

    // Menginisialisasi objek ATM sebelum setiap metode pengujian dijalankan
    @BeforeMethod
    public void setUp() {
        atm = new ATM(1000.0); // Saldo awal sebesar 1000.0
    }

    // Menguji apakah metode lihatSaldo() mengembalikan saldo yang benar
    @Test
    public void testLihatSaldo() {
        double saldo = atm.lihatSaldo();
        Assert.assertEquals(saldo, 1000.0, "Saldo awal seharusnya 1000.0");
    }

    // Menguji apakah metode setorUang() berfungsi dengan benar ketika jumlah yang valid disetor
    @Test
    public void testSetorUang() {
        atm.setorUang(500.0);
        double saldo = atm.lihatSaldo();
        Assert.assertEquals(saldo, 1500.0, "Saldo seharusnya bertambah menjadi 1500.0 setelah penyetoran 500.0");
    }

    // Menguji apakah metode setorUang() melempar pengecualian ketika jumlah yang negatif disetor
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetorUangNegatif() {
        atm.setorUang(-100.0);
    }

    // Menguji apakah metode tarikUang() berfungsi dengan benar ketika jumlah yang valid ditarik
    @Test
    public void testTarikUang() {
        atm.tarikUang(500.0);
        double saldo = atm.lihatSaldo();
        Assert.assertEquals(saldo, 500.0, "Saldo seharusnya berkurang menjadi 500.0 setelah penarikan 500.0");
    }

    // Menguji apakah metode tarikUang() melempar pengecualian ketika jumlah yang ditarik melebihi saldo saat ini
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangLebihDariSaldo() {
        atm.tarikUang(1500.0);
    }

    // Menguji apakah metode tarikUang() melempar pengecualian ketika jumlah yang negatif ditarik
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangNegatif() {
        atm.tarikUang(-100.0);
    }
}


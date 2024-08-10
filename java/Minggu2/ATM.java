package Minggu2;

public class ATM {
    private double saldo;

    // Konstruktor untuk menginisialisasi saldo awal
    public ATM(double saldoAwal) {
        if (saldoAwal < 0) {
            throw new IllegalArgumentException("Saldo awal tidak boleh negatif.");
        }
        this.saldo = saldoAwal;
    }

    // Metode untuk melihat saldo saat ini
    public double lihatSaldo() {
        return saldo;
    }

    // Metode untuk menyetor uang
    public void setorUang(double jumlah) {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah setor harus lebih besar dari 0.");
        }
        saldo += jumlah;
    }

    // Metode untuk menarik uang
    public void tarikUang(double jumlah) {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah tarik harus lebih besar dari 0.");
        }
        if (jumlah > saldo) {
            throw new IllegalArgumentException("Saldo tidak mencukupi untuk penarikan.");
        }
        saldo -= jumlah;
    }

    // Main method untuk testing
    public static void main(String[] args) {
        // Contoh penggunaan kelas ATM
        ATM atm = new ATM(1000.0); // Saldo awal 1000.0
        System.out.println("Saldo awal: " + atm.lihatSaldo());

        atm.setorUang(500.0);
        System.out.println("Saldo setelah setor: " + atm.lihatSaldo());

        atm.tarikUang(300.0);
        System.out.println("Saldo setelah tarik: " + atm.lihatSaldo());

        // Uji penarikan dengan jumlah lebih dari saldo
        try {
            atm.tarikUang(1500.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Uji penyetoran dengan jumlah negatif
        try {
            atm.setorUang(-200.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


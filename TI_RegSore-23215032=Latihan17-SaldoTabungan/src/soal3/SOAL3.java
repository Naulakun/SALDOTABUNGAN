/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3;

/**
 *
 * @author 
 * NAMA         : AYIP NANDANG MAULANA
 * NIM          : 23215032
 * KELAS        : PBO 1 REG.SORE
 * DESKRIPSI    : SALDO TABUNGAN
 */
public class SOAL3 {
    public static void main(String[] args) {
        // Deklarasi variabel
        double saldoAwal = 2500000; // Saldo awal Rp 2.500.000
        double bungaPerBulan = 15;  // Bunga per bulan 15%
        int lamaBulan = 6;          // Lama simpanan 6 bulan

        // Menampilkan header
        System.out.println("Saldo Awal: Rp " + saldoAwal);
        System.out.println("Bunga per Bulan: " + bungaPerBulan + "%");
        System.out.println("Lama (bulan): " + lamaBulan);
        System.out.println();

        // Proses perhitungan bunga tiap bulan dan tampilkan saldo tiap bulan
        double saldo = saldoAwal;
        for (int bulan = 1; bulan <= lamaBulan; bulan++) {
            double bunga = saldo * (bungaPerBulan / 100); // Menghitung bunga bulan ini
            saldo += bunga; // Menambahkan bunga ke saldo

            // Menampilkan saldo pada bulan ini
            System.out.printf("Bulan %d: Saldo = Rp %.3f\n", bulan, saldo);
        }
    }
}

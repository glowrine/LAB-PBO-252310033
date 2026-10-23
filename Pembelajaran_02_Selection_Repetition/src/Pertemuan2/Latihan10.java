<<<<<<< HEAD
package Pertemuan2;

import java.util.Scanner;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final long PIN_BENAR = 252310033;
        long saldo = 0;
        long pin;
        String lanjut;

        do {
            System.out.print("Masukan PIN: ");
            pin = input.nextLong();

            if (pin != PIN_BENAR) {
                System.out.println("PIN salah, silakan coba lagi.\n");
            }
        } while (pin != PIN_BENAR);
        do {
            System.out.println("\n===== MENU ATM =====");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Masukan menu: ");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Saldo anda: Rp " + saldo);
                    break;

                case 2:
                    System.out.print("Masukan nominal setor tunai: ");
                    long setor = input.nextLong();
                    saldo += setor;
                    System.out.println("Saldo anda: Rp " + saldo);
                    break;

                case 3:
                    System.out.print("Masukan nominal tarik tunai: ");
                    long tarik = input.nextLong();
                    if (saldo >= tarik) {
                        saldo -= tarik;
                        System.out.println("Saldo anda: Rp " + saldo);
                    } else {
                        System.out.println("Saldo tidak cukup");
                    }
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
                    break;
            }

            System.out.print("\nMasukan konfirmasi keluar aplikasi. Kembali ke menu? (y/n): ");
            lanjut = input.next();

        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("Terimakasih, aplikasi ditutup.");
        input.close();
    }
=======
package Pertemuan2;

import java.util.Scanner;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final long PIN_BENAR = 252310033;
        long saldo = 0;
        long pin;
        String lanjut;

        do {
            System.out.print("Masukan PIN: ");
            pin = input.nextLong();

            if (pin != PIN_BENAR) {
                System.out.println("PIN salah, silakan coba lagi.\n");
            }
        } while (pin != PIN_BENAR);
        do {
            System.out.println("\n===== MENU ATM =====");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Masukan menu: ");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Saldo anda: Rp " + saldo);
                    break;

                case 2:
                    System.out.print("Masukan nominal setor tunai: ");
                    long setor = input.nextLong();
                    saldo += setor;
                    System.out.println("Saldo anda: Rp " + saldo);
                    break;

                case 3:
                    System.out.print("Masukan nominal tarik tunai: ");
                    long tarik = input.nextLong();
                    if (saldo >= tarik) {
                        saldo -= tarik;
                        System.out.println("Saldo anda: Rp " + saldo);
                    } else {
                        System.out.println("Saldo tidak cukup");
                    }
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
                    break;
            }

            System.out.print("\nMasukan konfirmasi keluar aplikasi. Kembali ke menu? (y/n): ");
            lanjut = input.next();

        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("Terimakasih, aplikasi ditutup.");
        input.close();
    }
>>>>>>> 952640774d210c165d49220e4b793838f10bca4f
}
<<<<<<< HEAD
package Pertemuan2;

import java.util.Scanner;

public class Resto {
    private long Harga;

    public void chooseMenu() {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu Sarapan:");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bubur Ayam");
        System.out.println("3. Soto Ayam");
        System.out.print("Pilih menu (1-3): ");
        int pilihan = input.nextInt();

        long harga = getPrices(pilihan);

        switch (pilihan) {
            case 1:
                System.out.println("Anda memesan Nasi Goreng dengan harga Rp " + format(harga) + ",-");
                break;
            case 2:
                System.out.println("Anda memesan Bubur Ayam dengan harga Rp " + format(harga) + ",-");
                break;
            case 3:
                System.out.println("Anda memesan Soto Ayam dengan harga Rp " + format(harga) + ",-");
                break;
            default:
                System.out.println("Maaf menu yang anda masukan salah.");
                break;
        }
    }

    private long getPrices(int pilihan) {
        switch (pilihan) {
            case 1:
                Harga = 22000;
                break;
            case 2:
                Harga = 15000;
                break;
            case 3:
                Harga = 25000;
                break;
            default:
                Harga = 0;
                break;
        }
        return Harga;
    }
    private String format(long angka) {
        return String.format(java.util.Locale.GERMANY, "%,d", angka);
    }
=======
package Pertemuan2;

import java.util.Scanner;

public class Resto {
    private long Harga;

    public void chooseMenu() {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu Sarapan:");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bubur Ayam");
        System.out.println("3. Soto Ayam");
        System.out.print("Pilih menu (1-3): ");
        int pilihan = input.nextInt();

        long harga = getPrices(pilihan);

        switch (pilihan) {
            case 1:
                System.out.println("Anda memesan Nasi Goreng dengan harga Rp " + format(harga) + ",-");
                break;
            case 2:
                System.out.println("Anda memesan Bubur Ayam dengan harga Rp " + format(harga) + ",-");
                break;
            case 3:
                System.out.println("Anda memesan Soto Ayam dengan harga Rp " + format(harga) + ",-");
                break;
            default:
                System.out.println("Maaf menu yang anda masukan salah.");
                break;
        }
    }

    private long getPrices(int pilihan) {
        switch (pilihan) {
            case 1:
                Harga = 22000;
                break;
            case 2:
                Harga = 15000;
                break;
            case 3:
                Harga = 25000;
                break;
            default:
                Harga = 0;
                break;
        }
        return Harga;
    }
    private String format(long angka) {
        return String.format(java.util.Locale.GERMANY, "%,d", angka);
    }
>>>>>>> 952640774d210c165d49220e4b793838f10bca4f
}
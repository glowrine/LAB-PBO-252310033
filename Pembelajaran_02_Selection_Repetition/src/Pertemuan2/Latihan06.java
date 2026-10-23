<<<<<<< HEAD
package Pertemuan2;

import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.print("Apakah anda akan memesan kembali? (y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Terima kasih sudah memesan!");

        input.close();
    }
}
=======
package Pertemuan2;

import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.print("Apakah anda akan memesan kembali? (y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Terima kasih sudah memesan!");

        input.close();
    }
}
>>>>>>> 952640774d210c165d49220e4b793838f10bca4f

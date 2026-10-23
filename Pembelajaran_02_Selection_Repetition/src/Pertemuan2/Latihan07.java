<<<<<<< HEAD
package Pertemuan2;

import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Resto resto = new Resto();
        Scanner input = new Scanner(System.in);
        String ulang;

        do {
            resto.chooseMenu();

            System.out.print("\nApakah anda akan memesan kembali ? (y/n): ");
            ulang = input.next();
            System.out.println();
        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("Terimakasih telah memesan.");
        input.close();
    }
=======
package Pertemuan2;

import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Resto resto = new Resto();
        Scanner input = new Scanner(System.in);
        String ulang;

        do {
            resto.chooseMenu();

            System.out.print("\nApakah anda akan memesan kembali ? (y/n): ");
            ulang = input.next();
            System.out.println();
        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("Terimakasih telah memesan.");
        input.close();
    }
>>>>>>> 952640774d210c165d49220e4b793838f10bca4f
}
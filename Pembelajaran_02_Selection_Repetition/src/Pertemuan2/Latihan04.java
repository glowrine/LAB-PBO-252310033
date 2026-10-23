<<<<<<< HEAD
package Pertemuan2;

import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM: ");
        long npm = input.nextLong();

        System.out.print("Masukkan angka faktor (minimal 20): ");
        int angka = input.nextInt();

        if (angka < 20) {
            System.out.println("Angka tidak boleh kurang dari 20.");
        } else {
            System.out.print("Faktor " + angka + " adalah ");

            if (npm % 2 == 0) {
                boolean pertama = true;

                for (int i = 1; i <= angka; i++) {
                    if (angka % i == 0) {
                        if (!pertama) {
                            System.out.print(", ");
                        }
                        System.out.print(i);
                        pertama = false;
                    }
                }
            } else {
                boolean pertama = true;

                for (int i = angka; i >= 1; i--) {
                    if (angka % i == 0) {
                        if (!pertama) {
                            System.out.print(", ");
                        }
                        System.out.print(i);
                        pertama = false;
                    }
                }
            }

            System.out.println();
        }

        input.close();
    }
}
=======
package Pertemuan2;

import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM: ");
        long npm = input.nextLong();

        System.out.print("Masukkan angka faktor (minimal 20): ");
        int angka = input.nextInt();

        if (angka < 20) {
            System.out.println("Angka tidak boleh kurang dari 20.");
        } else {
            System.out.print("Faktor " + angka + " adalah ");

            if (npm % 2 == 0) {
                boolean pertama = true;

                for (int i = 1; i <= angka; i++) {
                    if (angka % i == 0) {
                        if (!pertama) {
                            System.out.print(", ");
                        }
                        System.out.print(i);
                        pertama = false;
                    }
                }
            } else {
                boolean pertama = true;

                for (int i = angka; i >= 1; i--) {
                    if (angka % i == 0) {
                        if (!pertama) {
                            System.out.print(", ");
                        }
                        System.out.print(i);
                        pertama = false;
                    }
                }
            }

            System.out.println();
        }

        input.close();
    }
}
>>>>>>> 952640774d210c165d49220e4b793838f10bca4f

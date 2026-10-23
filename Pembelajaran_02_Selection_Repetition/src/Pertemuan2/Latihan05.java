<<<<<<< HEAD
package Pertemuan2;


import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of row: ");
        int n = input.nextInt();

        int i = 1;

        while (i <= 2 * n - 1) {
            int kosong;

            if (i <= n) {
                kosong = i - 1;
            } else {
                kosong = 2 * n - 1 - i;
            }

            int j = 1;

            while (j <= 2 * n) {
                if (j <= n - kosong || j > n + kosong) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

                j++;
            }

            System.out.println();
            i++;
        }

        input.close();
    }
}
=======
package Pertemuan2;


import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of row: ");
        int n = input.nextInt();

        int i = 1;

        while (i <= 2 * n - 1) {
            int kosong;

            if (i <= n) {
                kosong = i - 1;
            } else {
                kosong = 2 * n - 1 - i;
            }

            int j = 1;

            while (j <= 2 * n) {
                if (j <= n - kosong || j > n + kosong) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

                j++;
            }

            System.out.println();
            i++;
        }

        input.close();
    }
}
>>>>>>> 952640774d210c165d49220e4b793838f10bca4f

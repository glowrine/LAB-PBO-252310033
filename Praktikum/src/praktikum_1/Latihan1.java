package praktikum_1;

import java.util.Scanner;

public final class Latihan1 {
	public static void main(String[] args) {
		System.out.println("Program Menghitung Volume Balok");
		
		Balok balok = new Balok();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukkan Panjang Balok: ");
		balok.panjang = scanner.nextDouble();
		
		System.out.print("Masukkan lebar Balok: ");
		balok.lebar = scanner.nextDouble();
		
		System.out.print("Masukkan tinggi Balok: ");
		balok.tinggi = scanner.nextDouble();
		
		System.out.println("Volume dari balok: " + balok.getVolume());
	}
}

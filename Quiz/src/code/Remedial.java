package code;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Remedial {
	public static void main(String[] args) {
		
		int data = Integer.parseInt (
				JOptionPane.showInputDialog("Input total data: "));
		
		int i = 0;
		double total = 0;
		
		while (i < data) {
			double angka = Double.parseDouble (
					JOptionPane.showInputDialog("Masukkan angka ke: " + (i + 1) + " "));
			
			total = total + angka;
			
			i++;		
		}
		
		double rata = total / data;
		
		JOptionPane.showInternalMessageDialog(null, "Rata-rata: " + rata);
	}
}
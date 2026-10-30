package Pertemuan3;

import javax.swing.JOptionPane;

public class Latihan03 {

    private static boolean isNumeric(String s) {
        return s.matches("\\d+");
    }

    public static void main(String[] args) {
        String fullname, usia, alamat;

        while (true) {
            fullname = JOptionPane.showInputDialog(null, "Masukkan Fullname:", "Form Biodata", JOptionPane.QUESTION_MESSAGE);
            if (fullname == null) return;
            if (fullname.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Field fullname tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            break;
        }

        while (true) {
            usia = JOptionPane.showInputDialog(null, "Masukkan Usia:", "Form Biodata", JOptionPane.QUESTION_MESSAGE);
            if (usia == null) return;
            if (usia.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Field usia tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            if (!isNumeric(usia.trim())) {
                JOptionPane.showMessageDialog(null, "Isian usia harus angka", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            break;
        }

        while (true) {
            alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat:", "Form Biodata", JOptionPane.QUESTION_MESSAGE);
            if (alamat == null) return;
            if (alamat.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Field alamat tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            if (alamat.trim().length() < 10) {
                JOptionPane.showMessageDialog(null, "Masukan alamat minimum 10 karakter", "Warning", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            break;
        }

        Biodata bio = new Biodata();
        bio.simpanData(fullname.trim(), usia.trim(), alamat.trim());

        JOptionPane.showMessageDialog(null,
                "Fullname : " + bio.getFullname() + "\n" +
                "Usia     : " + bio.getUsia() + "\n" +
                "Alamat   : " + bio.getAlamat(),
                "Data Biodata", JOptionPane.INFORMATION_MESSAGE);
    }
}
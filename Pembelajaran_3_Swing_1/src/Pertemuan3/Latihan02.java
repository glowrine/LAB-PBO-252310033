package Pertemuan3; 

import javax.swing.JOptionPane;

public class Latihan02 {
    public static void main(String[] args) {
        String fullname = JOptionPane.showInputDialog(null, "Masukkan Fullname:", "Form Biodata", JOptionPane.QUESTION_MESSAGE);
        String usia     = JOptionPane.showInputDialog(null, "Masukkan Usia:", "Form Biodata", JOptionPane.QUESTION_MESSAGE);
        String alamat   = JOptionPane.showInputDialog(null, "Masukkan Alamat:", "Form Biodata", JOptionPane.QUESTION_MESSAGE);

        Biodata bio = new Biodata();
        bio.simpanData(fullname, usia, alamat);

        JOptionPane.showMessageDialog(null,
                "Fullname : " + bio.getFullname() + "\n" +
                "Usia     : " + bio.getUsia() + "\n" +
                "Alamat   : " + bio.getAlamat(),
                "Data Biodata", JOptionPane.INFORMATION_MESSAGE);
    }
}
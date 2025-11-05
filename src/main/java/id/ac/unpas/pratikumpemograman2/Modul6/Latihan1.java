package id.ac.unpas.pratikumpemograman2.Modul6;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author ASUS
 */

public class Latihan1{
    public static void main(String[] args) {
        // Frame utama
        JFrame frame = new JFrame("Kalkulator Sederhana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout(10, 10));

        // Komponen layar (JTextField)
        JTextField display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        frame.add(display, BorderLayout.NORTH);

        // Panel untuk tombol-tombol
        JPanel panelTombol = new JPanel();
        panelTombol.setLayout(new GridLayout(4, 4, 5, 5));

        // Daftar tombol kalkulator
        String[] tombol = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        // Tambahkan tombol ke panel
        for (String text : tombol) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.PLAIN, 18));
            panelTombol.add(btn);
        }

        frame.add(panelTombol, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}

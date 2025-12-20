/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pratikumpemograman2.Modul10;

/**
 *
 * @author ASUS
 */

import id.ac.unpas.pratikumpemograman2.Modul10.view.MahasiswaApp;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Memanggil aplikasi MahasiswaApp untuk dijalankan
        SwingUtilities.invokeLater(() -> {
            new MahasiswaApp().setVisible(true);
        });
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_cth.tugaspraktikum6;

/**
 *
 * @author Marsy
 */
public class Matriks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 4; // jumlah matriks kolom dan barisnya
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    // untuk baris pertama mencetak angka kolom
                    System.out.print((j == 0 ? "   " : j + "  "));
                } else {
                    // untuk kolom pertama harus sesuai nilai baris awal (i) 
                    System.out.print((j == 0 ? i + "  " : (i * j) + "  "));
                }
            }
            System.out.println();
        }
    }
    
}

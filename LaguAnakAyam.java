/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_cth.tugaspraktikum6;

/**
 *
 * @author Marsy
 */
public class LaguAnakAyam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 10;
        for (int i = n ; i> 0; i--) { // perulangan untuk menghitung nilai
            System.out.println("Tek kotek, kotek kotek~");
            System.out.println("Anak ayam turun "+i);
            System.out.println("Tek kotek, kotek kotek~");
            System.out.println("Mati satu, tinggal "+((i-1) == 0?"induknya~~":i-1+"\n"));
        }
    }
}

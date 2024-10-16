/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_cth.tugaspraktikum6;

/**
 *
 * @author Marsy
 */
public class BilanganGanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 20;
        System.out.println("Bilangan ganjil dari 0 sampai "+n+":");
        for (int i = 0; i <= n; i++) { //angka akan terus terulang sampai kurang dari atau sama dengan n yaitu 20
            if (i%2 == 1) { // akan memeriksa apakah i tidak habis dibagi 2, jika tidak maka bilngan tersebut ganjil
                System.out.print(i + " ");
            }
        }
        System.out.println("\n\nBilangan genap dari 0 sampai "+n+":");
        for (int i = 0; i <= n; i++) {
            if (i%2 == 0) {  // akan memeriksa apakah i habis dibagi 2, jika ya maka bilngan tersebut genap
                System.out.print(i + " ");
            }
        }
    }  
}

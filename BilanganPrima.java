/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_cth.tugaspraktikum6;

/**
 *
 * @author Marsy
 */
public class BilanganPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 20;
        System.out.println("Bilangan Prima dari 0 sampai "+n+":");
        for (int i = 0; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j == 0 ){
                    ++count;
                }
            }
            if(count == 2){
                System.out.print(i+" ");
            }
        }

        System.out.println("\n\nBilangan Bukan Prima dari 0 sampai "+n+":");
        for (int i = 0; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j == 0 ){
                    ++count;
                }
            }
            if(count != 2){
                System.out.print(i+" ");
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rima7509
 */
package Exercicis_Intro_Java_II;

public class Prueba {
    public static void main(String[] args) {
        int parells=0,imparells=0;
        int cont=101;
        while (cont<200){
            if (cont%2==0){
            } else {
                imparells+cont;
            }
            cont++;
        }
        
        
        
        
        /*Bucle amb for
        for (int i = 101; i < 200; i++) {
            if (i%2==0) {
                parells+=i; // parells = parells+1;
            } else {
                imparells+=i;
            }
            
        }*/
        System.out.printf("Numeros compresos entre 100 i 200\n");
        System.out.printf("La suma dels imparells es %d\n", imparells);
        System.out.printf("La suma dels parells es %d\n", parells);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenricardo;
import java.util.Scanner;

/**
 *
 * @author rima7509
 */
public class ExamenRicardo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el numero entero: ");
        int numeroE = scanner.nextInt();
        boolean divisibleX4 = numeroE % 4 == 0;
        boolean divisibleX6 = numeroE % 6 == 0;
        if (divisibleX4 && divisibleX6) {
            System.out.println("El numero es divisible por 4 pero no por 6");
        } else if (divisibleX6 && !divisibleX4) {
            System.out.println("El numero es divisible por 6 pero no por 4");
        } else if (divisibleX4 && divisibleX6) {
            System.out.println("El numero es divisible por 4 y por 6");
        } else {
            System.out.println("El numero no es divisible ni por 4 ni por 6");
        }
    }
}
   
        

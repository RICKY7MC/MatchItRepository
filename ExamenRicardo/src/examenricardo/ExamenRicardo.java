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
public class ExamenRicardo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia,mes,año;
        System.out.println("Introduce la fecha");
        System.out.println("Dia:");
        dia = scanner.nextInt();
        System.out.println("Mes:");
        mes = scanner.nextInt();
        System.out.println("Año:");
        año = scanner.nextInt();
        boolean fValida = validarFecha(dia,mes,año);
        if (fValida){
            System.out.println("La fecha introducida"+ dia +"-"+ mes +"-"+ año +"es valida");
        }else{
            System.out.println("La fecha introducida no es valida");
        }
        
    }
    public static boolean validarFecha(int dia, int mes, int año) {
        boolean fValida = true;
        if (año<1900){
            fValida = false;
            System.out.println("El año"+ año +"es incorrecto, debe ser igual o posterior a 1900" );
        }if (mes<1 || mes>12){
            fValida = false;
        }else if (mes == 2){
            if(dia<1 || dia>28){
                fValida = false;
                System.out.println("El dia"+ dia +"no es valido, este debe estar entre el dia 1 y el dia 28");
            }
        }else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            if(dia<1 || dia>30){
                fValida = false;
                System.out.println("El dia"+ dia +"no es valido, este debe estar entre el dia 1 y el dia 30");
            }
        }else{
            if (dia<1 || dia>31){
                fValida = false;
                System.out.println("El dia"+ dia +"no es valido, este debe estar entre el dia 1 y el dia 30");
            }
            
        }
        
        return fValida;
    }

   
}

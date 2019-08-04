
package Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
 Scanner s= new Scanner (System.in);
        final int euros=166;
       int cantidad;
            System.out.println("Ingrese la cantidad de euros a convertir: ");
            cantidad=s.nextInt();
            
            int pesetas;
            pesetas=euros*cantidad;
            System.out.println("La cantidad en pesetas es: "+pesetas);
            
 }
}
 

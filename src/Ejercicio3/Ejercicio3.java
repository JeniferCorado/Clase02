
package Ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {
 public static void main(String[] args) {   
     Scanner s= new Scanner (System.in);
        final double pesetas=0.0060099765610914;
       double cantidad;
            System.out.println("Ingrese la cantidad en pesetas a convertir: ");
            cantidad=s.nextInt();
            
            double euros;
            euros=pesetas*cantidad;
            System.out.println("La cantidad en euros es: "+euros); 
 }
}

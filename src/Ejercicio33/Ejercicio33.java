
package Ejercicio33;

import java.util.Scanner;

public class Ejercicio33 {
   public static void main(String[] args) {   
       Scanner s= new Scanner (System.in); 
        int numero;
        System.out.print("Ingrese el numero de la tabla de multiplicar que desea: ");
    numero=s.nextInt();
        
    for (int i = 0; i <= 10; i++) {
      System.out.println(numero + " x " + i + " = " + numero * i);
    }
   }  
}

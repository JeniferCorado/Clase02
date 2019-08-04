
package Ejercicio42;

import java.util.Scanner;

public class Ejercicio42 {
     public static void main(String[] args) {   
       Scanner s= new Scanner (System.in); 
      
int numero;
        System.out.print("Introduzca un número entero y le diré si es primo: ");
         numero=s.nextInt();

       
    for (int i = 2; i < numero; i++) {
      if ((numero% i) == 0) {
          System.out.println("Es primo.");
        
      }
    
      else 
      {
          System.out.println("No es primo.");
    }

    
    }     
}
}
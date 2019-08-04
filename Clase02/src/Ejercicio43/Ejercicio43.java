
package Ejercicio43;

import java.util.Scanner;


public class Ejercicio43 {
  public static void main(String[] args) {   
       Scanner s= new Scanner (System.in);
         int numero= 0;
    int suma= 0; 
    do {
      System.out.print("Introduzca un número entero positivo: ");
      numero=s.nextInt();
      
      if(numero < 0) {
        System.out.println("El número introducido no es correcto, introduzca un número positivo.");
      }
    } while (numero < 0);
    
   
    
    for(int i = numero; i < numero + 100; i++) {
      suma += i;
    }

    System.out.println("Su resultado es " + suma);
   
  }   
}

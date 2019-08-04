
package Ejercicio34;

import java.util.Scanner;


public class Ejercicio34 {
  public static void main(String[] args) {   
       Scanner s= new Scanner (System.in); 
        
     int numeros = 1, n, numero2;

    System.out.print("Introduzca un número: ");
    numero2=s.nextInt();
    
    n = numero2;
    
    while (n > 10) {
      n /= 10;
      numeros++;
    }
    
    System.out.println(" El Siguiente numero  " +numero2 +" tiene " + numeros + " dígitos.");
   
        
  }   
}


package Ejercicio41;

import java.util.Scanner;

public class Ejercicio41 {
     public static void main(String[] args) {   
   Scanner s= new Scanner (System.in);      
    double base, exponente, potencia; 
     System.out.print("Introduzca un número real como base: ");
    base=s.nextInt();
    
    System.out.print("Introduzca un múmero entero como exponente: ");
    exponente=s.nextInt();

 
    int exponentes;
        
    for (int i = 1; i <= exponente; i++) {
        
      potencia = 1;
      exponentes = i;
      
      for (int j = 0; j < exponentes; j++) {
        potencia *= base;
      }
      
      System.out.println(base + "^" + i + " = " + potencia);
    }
        
       
        

     }
}


package Ejercicio23;

import java.util.Scanner;


public class Ejercicio23 {
   public static void main(String[] args) {   
       Scanner s= new Scanner (System.in); 
         int aux, a, b, c;
        System.out.println("Este programa ordena tres números introducidos por teclado.\n");
    System.out.println("Introduzca el primer numero ");
    a=s.nextInt();
    System.out.println("Introduzca el segundo  numero ");
    b=s.nextInt();
    System.out.println("Introduzca el tercer numero ");
    c=s.nextInt();

  
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
   
    if (b > c) {
      aux = b;
      b = c;
      c = aux;
    }
    
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
        
    System.out.println("Los numeros ya ordenas son " + a + ", " + b + " y " + c );    
      
   }  
}

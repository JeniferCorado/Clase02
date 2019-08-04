
package Ejercicio36;

import java.util.Scanner;


public class Ejercicio36 {

     public static void main(String[] args) {   
         Scanner s= new Scanner (System.in); 
int numero, digitado=0;
        
        System.out.print("Introduzca un número: ");
    numero=s.nextInt();
    for (int i = digitado; i < digitado + 5; i++) {
      System.out.printf("%5d %10d %15d\n", i, i * i, i * i * i);
    }
     }
}

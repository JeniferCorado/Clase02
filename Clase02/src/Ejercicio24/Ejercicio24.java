
package Ejercicio24;

import java.util.Scanner;


public class Ejercicio24 {
     public static void main(String[] args) {   
   
        Scanner s= new Scanner (System.in); 
        int numero;
       System.out.print("Introduzca un numeroe: ");
    numero=s.nextInt();

    if ((numero % 2) == 0) {
      System.out.print("El número es par");
    } 
    else 
    {
      System.out.print("El número es impar");
    }

    if ((numero % 5) == 0) {
      System.out.println(" y el numero es divisible entre 5.");
    } else {
      System.out.println(" y el numero no es divisible entre 5.");
    } 
}
}


package Ejercicio38;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {   
        Scanner s= new Scanner (System.in);      
     System.out.println("Introduzca numeros: ");

    int negativos = 0;
    int positivos = 0;
    int numero;
    for (int i = 0; i < 10; i++) {
      if ( (numero=s.nextInt()) < 0) {
        negativos++;
      } else {
        positivos++;
      }
    }
    
    System.out.println("Usted a Introducido " + positivos + " numeros positivos y " + negativos + " numeros negativos.");   
      
        
    } 
}

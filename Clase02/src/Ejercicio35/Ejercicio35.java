
package Ejercicio35;

import java.util.Scanner;

public class Ejercicio35 {
 public static void main(String[] args) {   
      Scanner s= new Scanner (System.in); 
    double numeros = 0;
    double digitado = 0;
    double media = 0;

    
    System.out.println("Introduzca numero *puede dejar de introducir cuando introduzca un numero negativo*:");

    while (digitado >= 0) {
      digitado=s.nextInt();
      numeros++;
      media += digitado;
    }
    
    System.out.println("La media de los numeros introducidos es " + (media - digitado)/ (numeros - 1));

 }    
}

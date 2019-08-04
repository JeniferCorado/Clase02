
package Ejercicio44;

import java.util.Scanner;

public class Ejercicio44 {
     public static void main(String[] args) {   
 Scanner s= new Scanner (System.in);
     int numero1, numero2;
    do {
      System.out.print("Introduzca un número: ");
      numero1=s.nextInt();
      
      System.out.print("Introduzca un numero, el cual sea diferente al numero que escribio anteriormente: ");
      numero2=s.nextInt();
      
      if(numero1 == numero2) {
        System.out.println("Los números introducidos son iguales");
      }
    } while (numero1 == numero2);
    
    
    if (numero1> numero2) {
      int aux = numero1;
      numero1 = numero2;
      numero2 = aux;
    }
    
    for(int i = numero1; i <= numero2; i += 7) {
      System.out.print(i + " ");
    }
    
    System.out.println();   

     
}
}
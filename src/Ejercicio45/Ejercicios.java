
package Ejercicio45;

import java.util.Scanner;


public class Ejercicios {
     public static void main(String[] args) {   
         
         Scanner s= new Scanner (System.in);
         int altura;
       String signo; 
       System.out.print("Introduzca la altura de la pirámide: ");
    altura=s.nextInt();

    System.out.print("Introduzca el carácter para la pirámide: ");
    signo=s.nextLine();
    
    int base = 1;
    int longitud = 1;
    int espacios = altura-1;
    
    while (base <= altura) {
      
      
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      
      for (int i = 1; i <= longitud; i++) {
        System.out.print(signo);
      }

      System.out.println();

      base++;
      espacios--;
      longitud += 2;
    }  
}
}
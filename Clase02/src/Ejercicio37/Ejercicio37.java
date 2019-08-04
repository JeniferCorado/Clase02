
package Ejercicio37;

import java.util.Scanner;


public class Ejercicio37 {
   public static void main(String[] args) {   
       Scanner s= new Scanner (System.in); 
  int numero;
    System.out.print("Introduzca un numero: ");
    numero=s.nextInt();

    switch (numero) {
      case 1:
        System.out.print("0");
        break;
      case 2:
        System.out.print("0 1");
        break;
      default:
        System.out.print("0 1");
        int n1 = 0;
        int n2 = 1;
        int aux;
        while(numero > 2) {
            aux = n1;
            n1 = n2;
            n2 = aux + n2;
            System.out.print(" " + n2);
            numero--;
        }
    }
    System.out.println();     
        
        
        
   
        
   }  
}

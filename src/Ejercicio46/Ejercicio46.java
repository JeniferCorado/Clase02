
package Ejercicio46;

import java.util.Scanner;


public class Ejercicio46 {
    public static void main(String[] args) {   
         Scanner s= new Scanner (System.in);
     
     int altura;
       String signo; 
       System.out.print("Introduzca la altura de la pirámide: ");
    altura=s.nextInt();

    System.out.print("Introduzca el carácter para la pirámide: ");
    signo=s.nextLine();
    
    int altura1 = 1;
    int i = 0;
    int espacios1 = altura - 1;
    int espacios3 = 0;
    
    while (altura1 < altura) {
  
      for (i = 1; i <= espacios1; i++) {
        System.out.print(" ");
      }
     
      System.out.print(signo);
      for (i = 1; i < espacios3; i++) {
        System.out.print(" ");
      }
      
      if (altura>1) {
        System.out.print(signo);
      }
      
      System.out.println();
      altura++;
      espacios1--;
      espacios3 += 2;
    } 
    
    for (i = 1; i < altura1*2; i++) {
      System.out.print(signo);
    }   
    } 
}

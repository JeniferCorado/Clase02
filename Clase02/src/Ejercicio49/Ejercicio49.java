
package Ejercicio49;

import java.util.Scanner;


public class Ejercicio49 {
     public static void main(String[] args) {   
 Scanner s= new Scanner (System.in);   
     int altura; 
    System.out.print("Introduzca la altura de su primide");
    altura=s.nextInt(); 

    int altura1 = 1;
    int i = 0;
    int espacios = altura- 1;
    
    while (altura1 <= altura) {
      
   
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
   
      for (i = 1; i < altura1; i++) {
        System.out.print(i);
      }
      
      for (i = altura1; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      altura1++;
      espacios--;
    } 
     }    
}


package Ejercicio32;

import java.util.Scanner;


public class Ejercicio32 {
   public static void main(String[] args) {   
        Scanner s= new Scanner (System.in); 

        int bloquear = 4;
    int clave;
    boolean intento = false;
    
    do {
      System.out.print("Introduzca la clave de la caja fuerte: ");
      clave=s.nextInt();
      
      if (clave == 1610) {
        intento = true;
      } else {
        System.out.println("Clave incorrecta");
      }
      
      bloquear--;
  
    } while((bloquear > 0) && (!intento));
    
    if (intento) {
      System.out.println("Ha abierto la caja fuerte.");
    } else {
      System.out.println("Lo siento, ha agotado las 4 oportunidades.");
    }
   }  
}


package Ejercicio25;

import java.util.Scanner;

public class Ejercicio25 {
  public static void main(String[] args) {   
       Scanner s= new Scanner (System.in); 
        
     int opcion;   
       System.out.println("PIRAMIDE");
    System.out.print("Introduzca un carácter de relleno: ");
    String signo= s.nextLine();
    System.out.println("Elija el tipo de pirámide que desea");
    System.out.println("1. Vértice hacia arriba");
    System.out.println("2. Vértice hacia abajo");
    System.out.println("3. Vértice hacia la derecha");
    System.out.println("4. Vértice hacia la izquierda");
    opcion=s.nextInt();

    switch(opcion) {
      case 1:
        System.out.println("  " + signo);
        System.out.println(" " + signo + signo + signo);
        System.out.println(signo + signo + signo + signo + signo);
        break;
      case 2:
        System.out.println(signo + signo + signo + signo + signo);
        System.out.println(" " + signo + signo + signo);
        System.out.println("  " + signo);
        break;
      case 3:
        
        System.out.println(signo);
        System.out.println(signo + " " + signo);
        System.out.println(signo + " " + signo + " " + signo);
        System.out.println(signo + " " + signo);
        System.out.println(signo);
        break;
      case 4:
        System.out.println("    " + signo);
        System.out.println("  " + signo + " " + signo);
        System.out.println(signo + " " + signo + " " + signo);
        System.out.println("  " + signo + " " + signo);
        System.out.println("    " + signo);
        break;
      default:
    }   
        
  }   
}

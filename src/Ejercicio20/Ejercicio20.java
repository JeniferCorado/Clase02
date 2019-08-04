
package Ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {
public static void main(String[] args) {   
     Scanner s= new Scanner (System.in);
        double numero1;
    double numero2;

    double a, b, c;
    
    System.out.println(" Ecuacion de la forma ax^2 + bx + c = 0");

    System.out.print("Introduzca el valor en a = ");
     a=s.nextInt();
    
    System.out.print("Introduzca el valor en b = ");
     b=s.nextInt();
    
    System.out.print("Introduzca el valor en c = ");
      c=s.nextInt();
    
    if ((a != 0) && (b != 0) && (c == 0)) 
    {
      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-b / a));
    }
    
    if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println("x1 = x2 = " + (-c / b));
    }
    
    
    if ((a != 0) && (b != 0) && (c != 0)) {
        
      double discriminante = b*b - (4 * a * c);
      
      if (discriminante < 0) {
          System.out.println("La ecuación no tiene una solucion");
      }  else {
        System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(2 * a));
        System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a));
      }
    }

          
}    
}
